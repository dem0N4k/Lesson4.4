import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Конвертер температуры
        System.out.println("\t\t\tКонвертер температуры");
        System.out.println("Enter temperature value:");
        double tempC = new Scanner(System.in).nextDouble();
        int coof1 = 32;
        double coof2 = 1.8;
        System.out.println("F = " + (tempC * coof2 + coof1));

        // баксы = рубли * курс
        // евро = рубли * курс
        System.out.println("\t\t\tКонвертер валют");
        System.out.println("Enter the required amount of rubles:");
        double rub = new Scanner(System.in).nextDouble();
        System.out.println("Enter the current dollar exchange rate:");
        double dollar = new Scanner(System.in).nextDouble();
        System.out.println(rub + " Р = " + (rub * dollar) + " $");
        System.out.println("Enter the current euro exchange rate:");
        double euro = new Scanner(System.in).nextDouble();
        System.out.println(rub + " Р = " + (rub * euro) + " Э");
    }
}
