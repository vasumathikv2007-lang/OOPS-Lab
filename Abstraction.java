// Abstract class (partial abstraction)
abstract class FoodOrder {

    
    abstract void prepareFood(int choice);

    // concrete method (has implementation)
    void orderInfo() {
        System.out.println("Welcome to Food Ordering System");
    }
}


class Restaurant extends FoodOrder {

    
    void prepareFood(int choice) {

        switch (choice) {
            case 1:
                System.out.println("Preparing Pizza ");
                break;

            case 2:
                System.out.println("Preparing Burger ");
                break;

            case 3:
                System.out.println("Preparing Pasta ");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}


public class Abstraction {

    public static void main(String[] args) {

        FoodOrder obj = new Restaurant(); 

        obj.orderInfo();      
        obj.prepareFood(2);    
    }
}