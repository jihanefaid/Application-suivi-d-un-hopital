
CREATE TABLE IF NOT EXISTS Service(

    id_Service SERIAL,
    lit_id INT,
    id_patient INT,
    Nom_service VARCHAR(50),
    PRIMARY KEY(id_Service),

    CONSTRAINT fk_lit_service
    FOREIGN KEY (id_lit)
    REFERENCES Chambre(id_lit),

     CONSTRAINT fk_patient_service
    FOREIGN KEY (id_patient)
    REFERENCES patient(id_patient)
);


CREATE TABLE IF NOT EXISTS Chambre(

    chambre_id SERIAL,
    PRIMARY KEY (id_chambre),
    num_chambres INT,
    nb_lits INT

);

CREATE TABLE IF NOT EXISTS Patient(

    PRIMARY KEY (id_patient),
    id_patient SERIAL,
    nom_patient VARCHAR(50) not null,
    prenom_patient VARCHAR(50) not null,
    sexe_patient VARCHAR(50) not null,
    date_naissance_patient DATE DEFAULT CURRENT_DATE,
    ville_patient VARCHAR(50) not null,
    cp_patient INT 
);


CREATE TABLE IF NOT EXISTS Lit(
    lit_id SERIAL,
    chambre_id INT,
    etat BOOLEAN not null,
    PRIMARY KEY(id_lit),
    CONSTRAINT fk_chambre_lit 
    FOREIGN KEY (chambre_id)
    REFERENCES Chambre(chambre_id)
);


-- Exemples de données pour la table Sejour : 



-- Exemples de données pour la table Chambre :

INSERT INTO Chambre (num_chambres, Nb_lits) VALUES
(101, 3),
(102, 2),
(103, 4),
(104, 3),
(105, 2);


-- Exemples de données pour la table Patient :

INSERT INTO Patient (id_sejour, nom_patient, prenom_patient, sexe_patient, date_naissance_patient, ville_patient, cp_patient) VALUES
(1, 1, 'Doe', 'John', 'M', '1990-01-15', 'Paris', 75000),
(1, 2, 'Smith', 'Alice', 'F', '1985-05-20', 'Lyon', 69000),
(2, 3, 'Johnson', 'Bob', 'M', '1978-11-10', 'Marseille', 13000),
(2, 4, 'Brown', 'Emily', 'F', '1992-09-25', 'Toulouse', 31000),
(3, 5, 'Wilson', 'Michael', 'M', '1982-03-08', 'Nice', 60000);

-- Exemples de données pour la table Lit :

INSERT INTO Lit (chambre_id, etat_lit) VALUES
    (1, TRUE),
    (2, FALSE),
    (3, TRUE),
    (4, FALSE),
    (5, TRUE);

