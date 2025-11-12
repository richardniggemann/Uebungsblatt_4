package h3;

public class H3_main {
    public static void main(String[] args) {
        float celsiusFloat = 0, fahrenheitFloat = 0;
        double celsiusDouble = 1.0, fahrenheitDouble = 1.0;

        fahrenheitFloat = celsiusToFahrenheit(celsiusFloat);
        fahrenheitDouble = celsiusToFahrenheit(celsiusDouble);

        System.out.println("celsiusFloat: " + celsiusFloat);
        System.out.println("fahrenheitFloat: " + fahrenheitFloat);
        System.out.println("celsiusDouble: " + celsiusDouble);
        System.out.println("fahrenheitFloat: " + fahrenheitDouble);
    }

    public static float celsiusToFahrenheit(float celsiusFloat) {
        return celsiusFloat * 9 / 5 + 32;
    }

    public static double celsiusToFahrenheit(double celsiusDouble) {
        return celsiusDouble * 9 / 5 + 32;
    }
}
