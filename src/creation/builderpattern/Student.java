package creation.builderpattern;

public class Student {
    private int age;
    private String name;

    public static Builder builder() {
        return new Builder();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
