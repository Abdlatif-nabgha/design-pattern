package creation.builderpattern;

public class Main {
    
    public static void main(String[] args) {
        // User user1 = new User.Builder(" ", "nabgha@gmail.com")
        //         .age(25)
        //         .phone("0605425898")
        //         .address("sidi bouzid")
        //         .build();

        // System.out.println(user1.getName());
        // System.out.println(user1.getEmail());
        // System.out.println(user1.getAge());
        // System.out.println(user1.getPhone());

        // Pizza pizza = new Pizza.Builder("large")
        //             .crust("thin")
        //             .cheese()
        //             .pepperoni()
        //             .mushrooms()
        //             .build();
        // System.out.println(pizza);

        AppConfig a = AppConfig.getInstance();
        AppConfig b = AppConfig.getInstance();

        System.out.println(a == b);
        System.out.println(a.get("env"));

        DatabaseConfig dbConfig = DatabaseConfig.getInstance();
        DatabaseConfig dbConfig2 = DatabaseConfig.getInstance();

        System.out.println(dbConfig == dbConfig2);
        System.out.println(dbConfig.get("port"));
        System.out.println(dbConfig.get("timeout"));
        System.out.println(dbConfig.get("user"));
    }
}
