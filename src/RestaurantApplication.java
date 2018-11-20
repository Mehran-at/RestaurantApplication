import java.util.List;
import java.util.ArrayList;
//After the weekend hike, Matilda and his friends are tired and decide to renew their energy going to a great restaurant. There, the waiter shows them the menu presenting the name of the meal and its price.
//Have the following points into consideration:
//        . The Meal has a name and a price. The price is a decimal number.
//        . There are four meals in the Menu: couscous (8,5 Euro), tajin (9,5 Euro), hummus (3,5 Euro) and falafel (4 Euro).
//        . The Menu provides the list of Meals.
//        . The Waiter has access to the menu (through the constructor) and can show the list of Meals
//        . The Waiter can receive one order from a customer (typing the name of the desired Meal), then the Waiter will show how much the customer has to pay for that Meal.
//        . The RestaurantApplication has the main method that uses the Waiter class to show the different Meals and takes one order from one customer.
public class RestaurantApplication {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.showMenu();
    }
}
