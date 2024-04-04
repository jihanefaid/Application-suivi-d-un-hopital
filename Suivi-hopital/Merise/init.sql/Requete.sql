afficher les noms et prénoms de tous les patients affectés au service "Urgences" :

SELECT p.nom, p.prenom
FROM Patient p
JOIN Service s ON p.service_id = s.service_id
WHERE s.nom = 'Urgences';



afficher tous les lits actuellement libres : 

SELECT lit_id
FROM Lit
WHERE etat = 'libre';
