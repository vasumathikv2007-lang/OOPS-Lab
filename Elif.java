import java.util.*;
public class Elif{
public static void main(String[]args){
Scanner obj=new Scanner(System.in);
System.out.println("Enter number 1:");
int a=obj.nextInt();
System.out.println("Enter number 2:");
int b=obj.nextInt();
System.out.println("Enter number 3:");
int c=obj.nextInt();
if(a>b && a>c){
System.out.println(a+" - Number 1 is the largest number");}
else if(b>a &&b>c){
System.out.println(b+" - Number 2 is the largest number");}
else{System.out.println(c+" - Number 3 is the largest number");}
}}