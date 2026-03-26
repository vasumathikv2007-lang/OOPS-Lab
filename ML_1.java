 class Add{
public int calculate(int a , int b){
return(a+b);}

protected int calculate(int a , int b ,int c){
return(a+b+c);} 

private double calculate(double a ,double b){
return(a+b);}

public void calculatedouble(){
System.out.println(calculate(3.4,5.4));}}

public class ML_1{
public static void main(String[]args){
Add a1=new Add(); 
System.out.println(a1.calculate(12,34));
System.out.println(a1.calculate(45,34,23));
a1.calculatedouble();
}}