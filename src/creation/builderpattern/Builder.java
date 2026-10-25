package creation.builderpattern;

public class Builder {
    
    private Student student = new Student();
    
    public Builder name(String name) {
        student.setName(name);
        return this;
    }
    
    public Builder age(int age) {
        student.setAge(age);
        return this;
    }
    
    public Student build() {
        return student;
    }
}
