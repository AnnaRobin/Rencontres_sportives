# Rencontres_sportives

TP programmation objet "rencontres sportives"

- Objectif pédagogique = conception et programmation orientées objet
    - Identifier des classes, leurs responsabilités
    - Nommage, typage
    - Encapsulation, Héritage, Composition
    - Programmaton défensive
    - Organisation du code
    - Structure de données : listes

- Ecrire un petit programme Java (8+)
- Classe application avec un main (pas se sysout dans le main)
- Recontres individuelles et collectives
- Rencontre individuelle = 1 joueur contre 1 joueur
- Rencontre collective = 1 équipe contre 1 équipe
- 1 joueur = 1 nom
- 1 équipe = 1 nom et de 2 à 11 joueurs, même nombre de joueur par équipe
- Le résultat d'une rencontre est un sysout selon le format :
    - Individuelle : "Nom du joueur 1 vs Nom du joueur 2 = n-n" où n-n est le score
    - Collective : "Nom de l'équipe 1 (nb joueurs) vs Nom de l'équipe 2 (nb joueurs) = n-n" où n-n est le score
- Score = déterminé aléatoirement pour chaque joueur/équipe entre 0 et 3
- Objectif = imprimer dans la console une liste de rencontres (2 individuelles et 2 collectives)

- Exemples de sorties console :
    - Individuelle : "Frank vs Fred = 3-0"
    - Collective : "ITSchool P1 (11) vs ITSchool P2 (11) = 2-3"
    
    *****************************************************
    TIPS

- Application avec le main

- Joueur
    - Nom : String
    
- Equipe
    - Nom : String
    - Liste de Joueur : List<Joueur>

- Rencontre
    - Rencontre indiv
    - soit ("if")
    - Rencontre collective
    - Les faire se rencontrer
    - Score ?
    
A hérite de B => A est un B ("IS A" relationship)

A contient B => A est composé de B ("HAS A" relationship)

KEEP IT SIMPLE STUPID
***********************************************************

TP programmation objet "rencontres sportives" (suite)

- Introduire la notion d'arbitre (nom)
- L'arbitre "siffle" le début, la mi-temps et la fin d'une rencontre
- Faire évoluer la gestion du score pour "conserver l'état du score" à la mi-temps et en fin de partie
- Introduire donc la notion de mi-temps et de score par mi-temps
- Score toujours aléatoire mais cohérent, si 1-0 à la mi-temps il ne peut pas y avoir 0-0 en fin de partie
- Modifier la sortie console pour afficher l'évolution du score
- Exemples :
    - Frank vs Fred
        * Mi-temps : 0-1
        * Fin de partie : 3-1
    - ITSchool P1 (11) vs ITSchool P2 (11)
        * Mi-temps : 0-0
        * Fin de partie : 3-2

Bonus format String

- https://www.baeldung.com/string/format
- https://www.codeflow.site/fr/article/java-printstream-printf
