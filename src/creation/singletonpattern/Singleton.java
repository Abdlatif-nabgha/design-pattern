package creation.singletonpattern;

/*****
 * Le Singleton est un design pattern de création qui garantit 
 * qu'une classe ne possède qu'une seule instance dans tout le programme
 * tout en fournissant un point d'accès global à cette instance
 *****/

/**
 * 
Comment ça fonctionne ?
Pour empêcher la multiple création d'objets,
le Singleton s'appuie sur trois règles simples en programmation orientée objet :
 */
public class Singleton {
    // 1- Variable statique privée
    /*
     On stocke l'unique instance de la classe 
    dans un attribut statique interne.
    */
    private static volatile Singleton instance;

    // 2- Un constructeur privé :
    /*
    On cache ou on rend privé le constructeur de la classe 
    pour interdire l'utilisation directe de l'opérateur new par le code extérieur.
    */
    
    private Singleton(String data) {
    }

    // 3- Méthode de création (Factory)
    /*
     On fournit une méthode publique (souvent nommée getInstance) 
    qui gère la création de l'objet et le retourne.
    */
    public static Singleton getInstance(String data) {
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton(data);   
                }
            }
        }
        return result; 
    }
    
    
}