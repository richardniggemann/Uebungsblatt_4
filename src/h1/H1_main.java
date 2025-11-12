package h1;

public class H1_main {
    public static void main(String[] args) {
        int zone = 42; // always positive
        double price = 0;

        price = 0;

        price = calculatePrice(zone);
        System.out.println("Price " + price);
    }

    public static double calculatePrice(int zone) {
        double price = 0;
        switch (zone) {
            case 5:
                price += 0.7;
            case 3, 4:
                price += 0.5;
            case 2:
                price += 0.35;
            case 1:
                price += 2;
                break;
            default: {
                price = 4;
            }
        }
        return price;
    }
}
