public class Meal {
    private double mealPrice;
    private String mealName;

    public Meal(double mealPrice, String mealName) {
        this.mealPrice = mealPrice;
        this.mealName = mealName;
    }
    public String getMealName() {
        return mealName;
    }
    public double getMealPrice() {
        return mealPrice;
    }
}
