import java.util.*;
public class For{
public static void main(String[]args)
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter number of students");
double n = obj.nextDouble();
for(int i=0;n>i;i++){
System.out.println("Enter Maths marks:");
int m=obj.nextInt();
System.out.println("Enter English marks:");
int e=obj.nextInt();
System.out.println("Enter Science marks:");
int s=obj.nextInt();
double t1=(m+s+e)/3;
System.out.println("Average :"+t1);
}
}}