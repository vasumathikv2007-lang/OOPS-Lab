import java.util.*;
public class Dowhile{
public static void main(String[]args){
Scanner obj=new Scanner(System.in);
System.out.println("Enter end number:");
int a=obj.nextInt();
int b=1;
do{
System.out.println(b);
b++;}
while(b<=a);
}}