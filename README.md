# SIR-TP3-NoSQL

#Morphia
 - Téléchargez le projet et importez le en tant que projet Maven dans un IDE
 - Avant de tester  l'application, télécharger et installer d'abord MongoDb sur votre machine.
 - Pour tester le projet, importer  toutes les dépendances et lancer le serveur MongoDB et soyez sûr qu'il 
 est accessible par l'application puis lancer le programme à partir de MorphiaTest.
 - Vous pouvez changer le nom de la base de données dans la classe MorphiaService.
 
   Quelles sont les limites d’une base données orientées document ? 
   
   Une des limites d'une base orientée document est qu'on ne dispose pas d'une structure
    clairement définie, la qualité des données fournies sont variable  et les requêtes sont très limitées.
    
    De plus sur un très grand volume de données (centaines-milliers de Teraoctets)
     le modèle peut atteindre des limites en terme de performance.
 
 
 
 #Redis
 Pour tester les différents examples sur Redis, Lancer le serveur Redis par
  la commande redis-server.exe depuis une ligne de commande windows puis,  lancer le programme à partir de 
  RedisTest.
  
  Quels sont les types de données stockés dans Redis, que peut on faire comme types de requêtes ?
  
  Redis est orienté clé valeur, ce sont donc des couples de valeurs (String, Hash, Sets ou Listes) qui sont stockés.
  
  Il est possible d'ajouter une valeur (SET), supprimer (DEL) une valeur ou voir les valeurs (GET) d'une clé avec Redis.
  Il est également possible d'incrémenter un nombre contenu dans une clé (INCR).



