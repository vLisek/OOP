package Tasks;

import java.util.Scanner;

public class RunLab02 {
    private final InputDataLab02 input;
    private final TasksLab02 tasks;
    private final Scanner scanner;

    public RunLab02() {
        scanner = new Scanner(System.in);
        input = new InputDataLab02(scanner);
        tasks = new TasksLab02();
    }

    public void start() {
        while (true) {
            displayMenu();
            int choice = input.getInt("Wybierz zadanie: ");

            switch (choice) {
                case 1:
                    runTask01();
                    break;
                case 2:
                    runTask02();
                    break;
                case 3:
                    runTask03();
                    break;
                case 4:
                    runTask04();
                    break;
                case 5:
                    runTask05();
                    break;
                case 6:
                    runTask06();
                    break;
                case 7:
                    System.out.println("Koniec programu.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }

            System.out.print("\nNaciśnij ENTER, aby kontynuować...");
            scanner.nextLine();
        }
    }

    private void displayMenu() {
        System.out.println("\n=== MENU ===");
        System.out.println("1. Zadanie 1.");
        System.out.println("2. Zadanie 2.");
        System.out.println("3. Zadanie 3.");
        System.out.println("4. Zadanie 4.");
        System.out.println("5. Zadanie 5.");
        System.out.println("6. Zadanie 6.");
        System.out.println("7. Wyjście.");
    }

    private void runTask01() {
        System.out.println("\n=== Zadanie 1: Równanie kwadratowe ===");
        double a = input.getDouble("Podaj współczynnik a: ");
        double b = input.getDouble("Podaj współczynnik b: ");
        double c = input.getDouble("Podaj współczynnik c: ");

        tasks.Task01(a, b, c);
    }

    private void runTask02() {
        System.out.println("\n=== Zadanie 2: Wyznaczanie wartości funkcji ===");
        System.out.println("Wybierz funkcję:");
        System.out.println("1. a(x) = 2x dla x > 0; 0 dla x = 0; -3x dla x < 0");
        System.out.println("2. b(x) = x^2 dla x >= 1; x dla x < 1");
        System.out.println("3. c(x) = 2 + x dla x > 2; 8 dla x = 2; x - 4 dla x < 2");

        int functionChoice = input.getInt("Twój wybór: ");
        double x = input.getDouble("Podaj wartość x: ");

        switch (functionChoice) {
            case 1:
                double resultA = tasks.Task02FunctionA(x);
                System.out.println("a(" + x + ") = " + resultA);
                break;
            case 2:
                double resultB = tasks.Task02FunctionB(x);
                System.out.println("b(" + x + ") = " + resultB);
                break;
            case 3:
                double resultC = tasks.Task02FunctionC(x);
                System.out.println("c(" + x + ") = " + resultC);
                break;
            default:
                System.out.println("Nieprawidłowy wybór funkcji.");
        }
    }

    private void runTask03() {
        System.out.println("\n=== Zadanie 3: Porządkowanie liczb ===");
        double x = input.getDouble("Podaj pierwszą liczbę: ");
        double y = input.getDouble("Podaj drugą liczbę: ");
        double z = input.getDouble("Podaj trzecią liczbę: ");

        tasks.Task03(x, y, z);
    }

    private void runTask04() {
        System.out.println("\n=== Zadanie 4: Warunki logiczne (deszcz i autobus) ===");
        boolean isRaining = input.getBoolean("Czy pada deszcz? (true / false): ");
        boolean isBusAtStop = input.getBoolean("Czy jest autobus na przystanku? (true / false): ");

        tasks.Task04(isRaining, isBusAtStop);
    }

    private void runTask05() {
        System.out.println("\n=== Zadanie 5: Warunki logiczne (zniżka i premia) ===");
        boolean hasDiscount = input.getBoolean("Czy jest zniżka na samochód? (true / false): ");
        boolean hasBonus = input.getBoolean("Czy otrzymałeś premię? (true / false): ");

        tasks.Task05(hasDiscount, hasBonus);
    }

    private void runTask06() {
        System.out.println("\n=== Zadanie 6: Kalkulator ===");
        System.out.println("Dostępne działania:");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Reszta z dzielenia");

        int operation = input.getInt("Wybierz działanie: ");

        if (operation < 1 || operation > 5) {
            System.out.println("Nieprawidłowy wybór działania.");
            return;
        }

        double num1 = input.getDouble("Podaj pierwszą liczbę: ");
        double num2 = input.getDouble("Podaj drugą liczbę: ");

        tasks.Task06(operation, num1, num2);
    }
}