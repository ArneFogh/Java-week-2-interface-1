public class pizza implements FastFood{

    private String dishName;
    private int price;
    private double calories;

    public pizza(String dishName, int price, double calories){
        this.dishName = dishName;
        this.price = price;
        this.calories = calories;

    }
    @Override
    public String getDishName() {
        return dishName;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public double getCalories() {
        return calories;
    }
}
