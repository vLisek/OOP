package Tasks;

public class TasksLab02 {

    // Zadanie 1: Równanie kwadratowe.
    public void Task01(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Równanie jest tożsamościowe - nieskończenie wiele rozwiązań.");
                }
                else {
                    System.out.println("Równanie sprzeczne - brak rozwiązań.");
                }
            }
            else {
                double x = -c / b;
                System.out.println("To równanie liniowe. Rozwiązanie: x = " + x);
            }
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Delta < 0. Brak rozwiązań.");
        }
        else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Delta = 0. Jedno podwójne rozwiązanie: x = " + x);
        }
        else {
            double sqrtDelta = Math.sqrt(delta);
            double x1 = (-b - sqrtDelta) / (2 * a);
            double x2 = (-b + sqrtDelta) / (2 * a);
            System.out.println("Delta > 0. Dwa rozwiązania:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
    // Koniec zadania 1.

    // Zadanie 2: Wyznaczanie wartości funkcji.
    // Zadanie 2: Funkcja a(x).
    public double Task02FunctionA(double x) {
        if (x > 0) {
            return 2 * x;
        }
        else if (x == 0) {
            return 0;
        }
        else { // x < 0
            return -3 * x;
        }
    }

    // Zadanie 2: Funkcja b(x).
    public double Task02FunctionB(double x) {
        if (x >= 1) {
            return x * x;
        }
        else { // x < 1
            return x;
        }
    }

    // Zadanie 2: Funkcja c(x).
    public double Task02FunctionC(double x) {
        if (x > 2) {
            return 2 + x;
        }
        else if (x == 2) {
            return 8;
        }
        else { // x < 2
            return x - 4;
        }
    }
    // Koniec zadania 2.

    // Zadanie 3: Porządkowanie liczb.
    public void Task03(double x, double y, double z) {
        double temp;
        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }

        if (y > z) {
            temp = y;
            y = z;
            z = temp;
        }

        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }

        System.out.println("Liczby posortowane od najmniejszej do największej:");
        System.out.println(x + " <= " + y + " <= " + z);
    }
    // Koniec zadania 3.

    // Zadanie 4: Warunki logiczne (deszcz i autobus).
    public void Task04(boolean isRaining, boolean isBusAtStop) {
        if (isRaining && isBusAtStop) {
            System.out.println("Weź parasol.");
            System.out.println("Dostaniesz się na uczelnie.");
        }
        else if (isRaining && !isBusAtStop) {
            System.out.println("Nie dostaniesz się na uczelnię.");
        }
        else if (!isRaining && isBusAtStop) {
            System.out.println("Dostaniesz się na uczelnie.");
            System.out.println("Miłego dnia i pięknej pogody.");
        }
        else if (!isRaining && !isBusAtStop) {
            System.out.println("Taka opcja nie istnieje.");
        }
    }
    // Koniec zadania 4.

    // Zadanie 5: Warunki logiczne (zniżka i premia).
    public void Task05(boolean hasDiscount, boolean hasBonus) {
        if (!hasDiscount || hasBonus) {
            System.out.println("Możesz kupić samochód!");
            if (!hasDiscount) {
                System.out.println("Zniżki na samochód nie ma.");
            }
        }

        if (!hasDiscount || !hasBonus) {
            System.out.println("Zakup samochodu trzeba odłożyć na później...");
            if (!hasDiscount) {
                System.out.println("Zniżki na samochód nie ma.");
            }
        }

        if (hasDiscount || hasBonus) {
            System.out.println("Możesz kupić samochód!");
        }
    }
    // Koniec zadania 5.

    // Zadanie 6: Kalkulator.
    public void Task06(int operation, double num1, double num2) {
        switch (operation) {
            case 1: // Dodawanie
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2: // Odejmowanie
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3: // Mnożenie
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4: // Dzielenie
                if (num2 == 0) {
                    System.out.println("Błąd: Nie można dzielić przez zero.");
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                }
                break;
            case 5: // Reszta z dzielenia
                if (num2 == 0) {
                    System.out.println("Błąd: Nie można dzielić przez zero.");
                } else {
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                }
                break;
        }
    }
}