
# Application de suivi des patients d'un hôpital 


## Contexte du projet

Dans le cadre de ce projet, nous devons développer une application de gestion des séjours des patients dans un hôpital. L'objectif principal est de permettre la gestion efficace des patients tout au long de leur séjour, en prenant en compte les entrées et les sorties des services, ainsi que l'affectation des patients aux lits dans les chambres.

## Outils et Technologies Utilisés

**Base de données:** 
- PostgreSQL (via docker compose)

**Langages de Programmation:** 
- Java

**Méthodologie de Gestion de Projet:**
- Scrum 

**Modélisation:**
- MERISE
- UML
- 
**Outils de Gestion de Projet:**
- Trello
- GitHub

## Conception 

La conception du projet s'est basée sur les principes de MERISE pour définir la structure de la base de données et sur les diagrammes UML pour modéliser les différentes parties de l'application, notamment les cas d'utilisation et les classes

## Requetes SQL 


- Afficher les noms et prénoms de tous les patients affectés au service "Urgences"

``` 
SELECT p.nom, p.prenom
FROM Patient p
JOIN Service s ON p.service_id = s.service_id
WHERE s.nom = 'Urgences';
```

- Afficher tous les lits actuellement libres

```
SELECT lit_id
FROM Lit
WHERE etat = 'libre';
```
## Tests

Des tests unitaires et d'intégration ont été mis en place pour assurer la qualité du code développé

## Architecture 

L'application suit une architecture multi-couches pour assurer la séparation des préoccupations et la maintenabilité du code











