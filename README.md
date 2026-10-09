# Design Patterns

Projet Java pédagogique dédié à la compréhension et à la mise en pratique des design patterns.

## Description

Ce dépôt sert de base pour explorer les principes de conception les plus utilisés en Java, notamment les design patterns GoF. Il est conçu pour être simple, clair et facilement extensible.

Le projet peut être utilisé comme support de cours, de démonstration ou de point de départ pour des exercices de programmation orientée objet.

## Objectifs

- Comprendre les concepts de conception réutilisables
- Mettre en pratique les design patterns en Java
- Structurer un code plus lisible, maintenable et évolutif
- Servir de base pour des démonstrations et des travaux académiques

## Prérequis

- Java JDK 8 ou supérieur
- Un terminal ou un IDE Java (IntelliJ IDEA, Eclipse, VS Code)

## Structure du projet

```text
designpattern/
├── src/
│   ├── comportement/
│   ├── creation/
│   ├── structure/
│   └── Main.java
├── screens/
│   └── gof.png
├── README.md
├── .gitignore
├── designpattern.iml
└── out/
```

## Catégories de design patterns

Les exemples sont organisés selon les trois familles de patterns GoF :

- **Création** (`src/creation`) : concerne la création des objets.
- **Structure** (`src/structure`) : concerne l’organisation des classes et des objets.
- **Comportement** (`src/comportement`) : concerne les interactions et la répartition des responsabilités entre objets.

## Démarrage rapide

1. Ouvrir le projet dans votre IDE Java ou via un terminal.
2. Vérifier que le JDK est bien installé.
3. Compiler et exécuter le projet depuis la racine du projet.

### Exemple de commande

```bash
javac src/Main.java
java -cp src Main
```

> Vérifiez que la classe principale contient une méthode `main` conforme au standard Java.

## Exemple de méthode principale

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Design Patterns!");
    }
}
```

## Contribution

Les contributions sont les bienvenues. Vous pouvez :

- ajouter de nouveaux exemples de design patterns
- améliorer la structure du projet
- enrichir la documentation
- corriger des erreurs ou améliorer le code

## Auteur

Abdlatif Nabgha
