class Notifier{
public void send(String msg){
System.out.println("PUBLIC\nMessage :"+msg);
}
protected void send(String msg,String email){
System.out.println("PROTECTED\nMessage :"+msg);
System.out.println("E-Mail:"+ email);}

private void send(String msg,long pn){
System.out.println("PRIVATE\nMessage :"+msg);
System.out.println("Phone Number:"+pn);}

void send(String msg, int priority) {
        System.out.println("DEFAULT\n Priority Message:" + msg);
        System.out.println("Priority Level: " + priority);
    }

public void access(){
send("Good Morning", 9374665448L);}}


public class Appnotifier extends Notifier{
public static void main(String[]args){
Appnotifier obj=new Appnotifier();
obj.send("Up to 70% discount on selected products\nexclusive , grab the offer now!");
obj.send("Hello ! Hope you are having a Good Day","sanamurugesan77@gmail.com");
obj.send("Good Night",5);
obj.access();}}
 