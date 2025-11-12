package h3;

public class H3_main {
    public static void main(String[] args) {
        float celsiusFloat = 14.2f, fahrenheitFloat = 0f;
        double celsiusDouble = 14.2d, fahrenheitDouble = 0d;

        fahrenheitFloat = celsiusToFahrenheit(celsiusFloat);
        fahrenheitDouble = celsiusToFahrenheit(celsiusDouble);

        System.out.println("celsiusFloat: " + celsiusFloat);
        System.out.println("fahrenheitFloat: " + fahrenheitFloat);
        System.out.println("celsiusDouble: " + celsiusDouble);
        System.out.println("fahrenheitFloat: " + fahrenheitDouble);
    }

    public static float celsiusToFahrenheit(float celsiusFloat) {
        return celsiusFloat * (float) 9 / (float) 5 + (float) 32;
    }

    public static double celsiusToFahrenheit(double celsiusDouble) {
        return celsiusDouble * (double) 9 / (double) 5 + (double) 32;
    }
}
