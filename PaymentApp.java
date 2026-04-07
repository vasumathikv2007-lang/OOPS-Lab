interface Payment {

    
    void pay(double amount);
}


class CreditCardPayment implements Payment {

    public void pay(double amount) {
        if (amount > 5000) {
            System.out.println("Credit Card Payment Approved with Discount");
        } else {
            System.out.println("Credit Card Payment Approved");
        }
    }
}


class UpiPayment implements Payment {

    public void pay(double amount) {
        if (amount > 1000) {
            System.out.println("UPI Payment Successful with Cashback");
        } else {
            System.out.println("UPI Payment Successful");
        }
    }
}


public class PaymentApp {

    public static void main(String[] args) {
Payment  c = new CreditCardPayment();
        c.pay(6000);
 Payment u = new UpiPayment();
        u.pay(500);
    }
}