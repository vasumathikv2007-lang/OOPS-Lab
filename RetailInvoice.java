class InvoiceProcessor{
public void grandtotal(int qty,int cost,Double dis, String id){
int tot=qty*cost;
System.out.println("Bill Id:"+ id);
System.out.println("Grand Total is : Rs"+tot);}

private void customerdet(String name , long num  ){
System.out.println("Customer Details:\nName:"+name+ "\nPhone Number:" +num);}

public void access(){
customerdet("Akash",9876544578L);
 //  Cannot override private method
    }}

public class RetailInvoice extends InvoiceProcessor{
@Override

public void grandtotal(int qty,int cost,Double dis, String id){
int tot=qty*cost;
double d=dis/100;
double tot2=tot-(tot*d);
System.out.println("Bill Id:"+ id);
System.out.println("Grand Total is : Rs"+tot2);}

public static void main(String[]args){
InvoiceProcessor obj=new RetailInvoice();
obj.grandtotal(5,200,50.0,"FG#67JU");
obj.access();// indirect access to private method
}

}










