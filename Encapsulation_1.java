class Student {

   
    private String name;
    private int age;

   
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {   
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

   
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


public class Encapsulation_1 {

    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Rahul");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}