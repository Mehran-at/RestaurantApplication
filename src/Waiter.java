import java.util.List;
import java.util.Scanner;

public class Waiter {
    public void showMenu() {
        Menu menu = new Menu();
        String order = takeOrder();
        List<Meal> meals = menu.getMeals();
        for (Meal meal : meals) {
            if (order.equalsIgnoreCase(meal.getMealName())) {
                System.out.println("The price of " + meal.getMealName() + " is " + meal.getMealPrice());
            }
            else {
                System.out.println("We donot have that meal in our menu!");
            }
        }
    }
     String takeOrder() {
         System.out.println("Please enter your order");
        Scanner scanner=new Scanner(System.in);
        String order=scanner.nextLine();
        return order;
    }

}