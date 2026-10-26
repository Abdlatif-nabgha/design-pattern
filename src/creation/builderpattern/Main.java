package creation.builderpattern;



public class Main {
    
    public static void main(String[] args) {

        NutritionFacts cocaCola = NutritionFacts.builder(240, 8)
            .calories(100)
            .fat(0)
            .sodium(35)
            .carbohydrate(27)
            .build();
        System.out.println(cocaCola);

        Pizza pizza = Pizza.builder("large")
            .crust("thin")
            .cheese(true)
            .pepperoni(true)
            .mushrooms(true)
            .build();
        System.out.println(pizza);

        User user = new User.Builder("mom", "mom@gmail.com")
                            .age(100)
                            .phone("123456789")
                            .address("123 Main St")
                            .build();
        System.out.println(user);
    }
}
