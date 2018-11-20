import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Meal> meals;

    public Menu() {
        this.meals = makeMenu();
    }
    public List<Meal> makeMenu() {
        List<Meal> meals = new ArrayList<>();
        Meal mealOne = new Meal(8.5,"couscous");
        Meal mealTwo = new Meal(9.5,"tajin");
        Meal mealThree = new Meal(3.5,"hummus");
        Meal mealFour = new Meal(4.0,"falafel");
        meals.add(mealOne);
        meals.add(mealTwo);
        meals.add(mealThree);
        meals.add(mealFour);
        return meals;
    }
    public List<Meal> getMeals() {
        return meals;
    }
}
