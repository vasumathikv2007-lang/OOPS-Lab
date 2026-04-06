class Calculator{
public int add(int a , int b){
return(a+b);
}
protected void display(){
System.out.println("This System displays Addition");}
 
private void show(){
System.out.println("Private method");}

public void accessPrivate(){
show();
}
}
 

class AdvancedCalculator extends Calculator{
@Override
public int add(int a , int b){
return(a-b);
}
@Override
protected void display(){
System.out.println("This System displays Subtraction");
}
 public void show(){
System.out.println("Show method");}

}

public class MO_1{
public static void main(String[]args){
Calculator obj=new AdvancedCalculator();
System.out.println(obj.add(23,2));
obj.display();
obj.accessPrivate();
AdvancedCalculator obj1=new AdvancedCalculator();
obj1.show();}
}