Verzelea (Arthur Verzele)

# M1III_TP_security
Projet Final pour les cours de cybersécurité

## Idée
J'ai juste repris notre projet fait pendant les cours de Programmation par composant, avec Monsieur Douglas Six.
J'avais realise le projet avec Skiadram (Neel-Léo COFFIN).
Pendant ce tp, on devait refaire une api pour un site de revente automobile.

## Docker

## Tests

## Exploit

## Objectif de Sécurité
### Confidentialité
0/5
Les données ne sont pas du tout cryptées, et facile d'accès.
Elles sont écrites en dur dans le code. On peut aussi facilement les récupérer avec les requêtes Get, qui ne sont pas protégés.
Et on ne vérifie pas qui récupère les données.

### Intégrité
2/5
Il y certes les requêtes Post, Put, et Delete pour facilement modifier une données, mais cela ne suffit pas.
Il y a aussi la modification et la suppression en cascade dans la base de donnée, qui évite les erreurs et les doublons.
Mais le plus gros problème, c'est que la base de donnée est en mémoire, et sera donc supprimer à chaque arrêt de l'api.
Ainsi, l'intégrité complète ne peux être faites que si l'api reste tout le temps ouverte.

### Disponibilité
4/5
Accèder par des requêtes simples, avec peu de paramètre.
Il n'y a pas besoin d'authentification pour récupèrer ses données.
Chaque données donne aussi ses liens avec les autres tables.
par exemple, On peux connaitre quel voiture appartient à quel client juste en demandant les clients.

### Traçabilité
0/5
Il n'y a aucun moyen mis en place pour savoir qui à fait tel requête.

## Surface d'attaque
[![](https://mermaid.ink/img/eyJjb2RlIjoiZ3JhcGggVERcbkEoRG9ja2VyKSAtLT4gQihTcHJpbmctYm9vdClcbkIgLS0-IEMoUmVxdcOqdGVzIEh0dHApXG5DIC0tPiBFKEdldClcbkMgLS0-IEYoUG9zdClcbkMgLS0-IEcoUHV0KVxuQyAtLT4gSChEZWxldGUpXG5CIC0tPiBEKEJhc2UgZGUgZG9ubsOpZSlcbkQgLS0-IEsoSW5qZWN0aW9uIFNRTClcbiIsIm1lcm1haWQiOnsidGhlbWUiOiJkZWZhdWx0In0sInVwZGF0ZUVkaXRvciI6ZmFsc2V9)](https://mermaid-js.github.io/mermaid-live-editor/#/edit/eyJjb2RlIjoiZ3JhcGggVERcbkEoRG9ja2VyKSAtLT4gQihTcHJpbmctYm9vdClcbkIgLS0-IEMoUmVxdcOqdGVzIEh0dHApXG5DIC0tPiBFKEdldClcbkMgLS0-IEYoUG9zdClcbkMgLS0-IEcoUHV0KVxuQyAtLT4gSChEZWxldGUpXG5CIC0tPiBEKEJhc2UgZGUgZG9ubsOpZSlcbkQgLS0-IEsoSW5qZWN0aW9uIFNRTClcbiIsIm1lcm1haWQiOnsidGhlbWUiOiJkZWZhdWx0In0sInVwZGF0ZUVkaXRvciI6ZmFsc2V9)
## Analyse de sécurité
voir le document aussi [here](Excel_Surface-Attaque.pdf)
