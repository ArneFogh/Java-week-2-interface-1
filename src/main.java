public class main {
    public static void main(String[] args) {
        FastFood[] fastFoodMenu = new FastFood[3];
        fastFoodMenu[0] = new Sandwich("Kylling karry", 65, 1249.13);
        fastFoodMenu[1] = new pizza("Kartoffel pizza", 89, 1112.44);
        fastFoodMenu[2] = new spaghetti("Spaghetti bolognese", 95, 1329.23);

        for (int i = 0; i < fastFoodMenu.length; i++) {
            FastFood foods = fastFoodMenu[i];
            System.out.println(foods.getDishName() + ". Prisen er:" + foods.getPrice() + "kr " + "der er: " + foods.getCalories() + " kalorier i.");
        }
    }
}
