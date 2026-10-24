package creation.builderpattern;

public class Main {
    
    public static void main(String[] args) {
        User user1 = new User.Builder()
                .name("Nabgha")
                .email("nabgha@gmail.com")
                .phone("0605425898")
                .build();

        System.out.println(user1.getName());
        System.out.println(user1.getEmail());
        System.out.println(user1.getAge());
        Integer a = user1.getAge();
        System.out.println(a.intValue());
    }
}
