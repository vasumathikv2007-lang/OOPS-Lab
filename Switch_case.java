import java.util.*;
public class Switch_case{
public static void main(String[]args){
int largest;
Scanner obj=new Scanner(System.in);
System.out.println("Enter number 1:");
int a=obj.nextInt();
System.out.println("Enter number 2:");
int b=obj.nextInt();
System.out.println("Enter number 3:");
int c=obj.nextInt();
if(a>b && a>c){
largest=1;}
else if(b>a &&b>c){
largest=2;}
else{largest=3;}
switch(largest){
case 1:
System.out.println(a+" is the largest number");
break;
case 2:
System.out.println(b+" is the largest number");
break;
case 3:
System.out.println(c+" is the largest number");
break;
default:
System.out.println("Invalid case");
}
}}