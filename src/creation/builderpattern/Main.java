package creation.builderpattern;

public class Main {
    
    public static void main(String[] args) {
        User user1 = new User.Builder(" ", "nabgha@gmail.com")
                .age(25)
                .phone("0605425898")
                .address("sidi bouzid")
                .build();

        System.out.println(user1.getName());
        System.out.println(user1.getEmail());
        System.out.println(user1.getAge());
        System.out.println(user1.getPhone());
    }
}
