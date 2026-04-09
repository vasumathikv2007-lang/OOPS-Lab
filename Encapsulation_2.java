class Student {

    
    private String name;
    private int marks;
private String id;

    
    public void setName(String name) {
        this.name = name;
    }
public void setid(String id){
this.id=id;}

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks!");
        }
    }

   
    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
public String getid(){
return id;}
}

public class Encapsulation_2 {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Karissa");
        s.setMarks(85);
s.setid("BSD#FG@J1");
System.out.println("Student ID: " + s.getid());
        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());

    }
}