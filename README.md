# Design Patterns

Un **Design pattern** décrit à la fois :
- **Un problème** qui se produit très fréquemment, dans un environnement,
- **Et l’architecture de la solution** à ce problème de telle façon que l’on puisse utiliser cette solution des milliers de fois.

Il permet de décrire avec succès des types de solutions récurrentes à des problèmes communs dans des types de situations.

### Les design patterns offrent :
- **Une documentation d’une expérience éprouvée** de conception.
- **Une identification et spécification d'abstractions** qui sont au-dessus du niveau des simples classes et instances.
- **Un vocabulaire commun** et une aide à la compréhension de principes de conception.
- **Un moyen de documentation** de logiciels.
- **Une aide à la construction de logiciels complexes et hétérogènes**, répondant à des propriétés précises.

<p align="center">
  <img src="screens/gof.png" alt="Gang of Four Design Patterns" width="700">
</p>

## Objectifs du projet

- Comprendre les concepts de conception réutilisables
- Mettre en pratique les design patterns en Java
- Structurer un code plus lisible, maintenable et évolutif
- Servir de base pour des démonstrations et des travaux académiques

## Prérequis

- Java JDK 25 ou supérieur
- Un terminal ou un IDE Java (IntelliJ IDEA, Eclipse, VS Code)

## Structure du projet

```text
designpattern/
├── src/
│   ├── comportement/
│   │   └── strategypattern/
│   │       ├── isortImpl/
│   │       │   ├── BubbleSort.java
│   │       │   ├── InsertionSort.java
│   │       │   └── SelectionSort.java
│   │       ├── Client.java
│   │       ├── Context.java
│   │       └── ISort.java
│   ├── creation/
│   └── structure/
├── screens/
│   ├── gof.png
│   └── strategy.png
├── README.md
├── .gitignore
├── designpattern.iml
└── out/
```

## Catégories de design patterns

Les design patterns sont organisés selon trois grandes familles :

### 1. Création
- **Description** : Description de la manière dont un objet ou un ensemble d’objets peuvent être créés, initialisés, et configurés.
- **Isolation** : Isolation du code relatif à la création et à l’initialisation afin de rendre l’application indépendante de ces aspects.
- **Exemples** : Abstract Factory, Builder, Prototype, Singleton.

### 2. Structure
- **Description** : Description de la manière dont doivent être connectés des objets de l’application afin de rendre ces connexions indépendantes des évolutions futures de l’application.
- **Exemples** : Adapter (objet), Composite, Bridge, Decorator, Facade, Proxy.

### 3. Comportement
- **Description** : Description de comportements d’interaction entre objets et gestion des interactions dynamiques entre des classes et des objets.
- **Exemples** : Strategy, Observer, Iterator, Mediator, Visitor, State.

---

## Design Pattern : Strategy (Stratégie)

- **Catégorie** : Comportement

<p align="center">
  <img src="screens/strategy.png" alt="Diagramme de classe Strategy Pattern" width="700">
</p>

### Objectifs
- Définir une famille d’algorithmes, et encapsuler chacun et les rendre interchangeables tout en assurant que chaque algorithme puisse évoluer indépendamment des clients qui l’utilisent.

### Raison d’utilisation
- Un objet doit pouvoir faire varier une partie de son algorithme dynamiquement.

### Résultat
- Le Design Pattern permet d'isoler les algorithmes appartenant à une même famille d'algorithmes.

### Fonctionnement et structure
- **Interface de stratégie** : On crée une interface de base, appelée ici « Strategy » (ou `ISort` dans notre implémentation), et on y ajoute une méthode qui sera la méthode qui applique notre stratégie.
- **Classes concrètes** : Il suffit alors de créer des classes concrètes qui implémentent cette interface « StrategyImpl » (`BubbleSort`, `SelectionSort`, `InsertionSort`) et qui redéfinissent la méthode de stratégie.
- **Contexte** : À un instant donné, la classe « Context » qui va utiliser la stratégie compose une instance de l’une des implémentations de Strategy. Elle peut ainsi modifier ou basculer dynamiquement d'algorithme au cours de l'exécution.

### Exemple implémenté dans le projet
Le code source correspondant à ce pattern est disponible dans :
- Interface de stratégie : [`ISort.java`](src/comportement/strategypattern/ISort.java)
- Implémentations d'algorithmes de tri : [`BubbleSort.java`](src/comportement/strategypattern/isortImpl/BubbleSort.java), [`SelectionSort.java`](src/comportement/strategypattern/isortImpl/SelectionSort.java), [`InsertionSort.java`](src/comportement/strategypattern/isortImpl/InsertionSort.java)
- Contexte : [`Context.java`](src/comportement/strategypattern/Context.java)
- Point d'entrée de test : [`Client.java`](src/comportement/strategypattern/Client.java)

---

## Auteur

Abdlatif Nabgha
