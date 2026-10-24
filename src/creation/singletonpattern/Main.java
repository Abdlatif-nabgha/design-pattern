package creation.singletonpattern;

public class Main {
    
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance("Data 1");
        Singleton s2 = Singleton.getInstance("Data 2");

        System.out.println(s1 == s2);   
    }
}
