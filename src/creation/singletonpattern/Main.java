package creation.singletonpattern;

public class Main {
    
    public static void main(String[] args) {
        AppConfig config1 = AppConfig.getInstance();
        System.out.println(config1.get("env"));

        AppConfig config2 = AppConfig.getInstance();
        System.out.println(config2.get("port"));

        System.out.println(config1 == config2);
    }
}
