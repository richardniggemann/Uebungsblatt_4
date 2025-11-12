package h2;

public class H2_main {
    public static void main(String[] args) {
        boolean x = false, y = false, a = false, b = false, c = false;
        int input = 0; // possible values: 0, 1, 10, 11

        x = (input == 10 || input == 11);
        y = (input == 11 || input == 1);

        boolean eigenschaft1 = x;
        boolean eigenschaft2 = y;
        boolean eigenschaft3 = x != y;

        a = eigenschaft1 && eigenschaft2;
        b = eigenschaft1 || eigenschaft3;
        c = (x && !y) || (!x && !y);

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("E1: " + eigenschaft1);
        System.out.println("E2: " + eigenschaft2);
        System.out.println("E3: " + eigenschaft3);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }
}
