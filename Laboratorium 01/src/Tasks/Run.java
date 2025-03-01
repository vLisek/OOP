package Tasks;

import java.util.Random;

public class Run {
    TasksLab01 tasksLab01 = new TasksLab01();
    InputData inputData = new InputData();
    Random random = new Random();

    public void RunMain() {
        Menu();
    }

    private void Menu() {
        while (true) {
            System.out.println("\nWszystkie wykonane zadania z pierwszego laboratorium:");
            System.out.println("1. Zadanie 1.");
            System.out.println("2. Zadanie 2.");
            System.out.println("3. Zadanie 3.");
            System.out.println("4. Zadanie 4.");
            System.out.println("5. Zadanie 5.");
            System.out.println("6. Zadanie 6.");
            System.out.println("7. Zadanie 7.");
            System.out.println("8. Wyjście.");
            System.out.print("Wybierz zadanie: ");

            int choose = inputData.InputInt();
            switch (choose) {
                case 1:
                    Task001Run();
                    break;
                case 2:
                    Task002Run();
                    break;
                case 3:
                    Task003Run();
                    break;
                case 4:
                    Task004Run();
                    break;
                case 5:
                    Task005Run();
                    break;
                case 6:
                    Task006Run();
                    break;
                case 7:
                    Task007Run();
                    break;
                case 8:
                    tasksLab01.CloseProgram();
                    return;
                default:
                    System.out.println("Błędne dane. Wybierz ponownie.");
                    continue;
            }
            System.out.println("\nNaciśnij Enter, aby powrócić do menu...");
            new java.util.Scanner(System.in).nextLine(); // Czeka na naciśnięcie Enter
        }
    }

    private void Task001Run() {
        System.out.println("\nProgram, który wyświetli, wprowadzone przez użytkownika, imię oraz wiek.");
        System.out.print("Podaj imię: ");
        String name = inputData.InputString();

        System.out.print("Podaj wiek: ");
        int age = inputData.InputInt();

        System.out.println(tasksLab01.Task001(name, age));
    }

    private void Task002Run() {
        System.out.println("\nProgram, który wypisze sumę, różnice, iloczyn oraz iloraz.");
        System.out.print("Podaj pierwszą liczbę: ");
        double value1 = inputData.InputDouble();

        System.out.print("Podaj drugą liczbę: ");
        double value2 = inputData.InputDouble();


        tasksLab01.Task002(value1, value2);
    }

    private void Task003Run() {
        System.out.println("\nProgram, który sprawdzi czy wprowadzona liczba jest parzysta.");
        System.out.print("Podaj liczbę całkowitą: ");
        int number = inputData.InputInt();

        if(tasksLab01.Task003(number)) {
            System.out.println("Liczba " + number + " jest parzysta.");
        }
        else {
            System.out.println("Liczba " + number + " nie jest parzysta.");
        }
    }

    private void Task004Run() {
        System.out.println("\nProgram, który sprawdza czy wprowadzona liczba jest podzielna przez 3 i 5.");
        System.out.print("Podaj liczbę: ");
        int number = inputData.InputInt();

        if(tasksLab01.Task004(number)) {
            System.out.println("Liczba " + number + " jest podzielna przez 3 i 5.");
        }
        else {
            System.out.println("Liczba " + number + " nie jest podzielna przez 3 i 5.");
        }
    }

    private void Task005Run() {
        System.out.println("\nProgram, który podnosi wprowadzoną liczbę do potęgi 3.");
        System.out.print("Podaj liczbę: ");
        int number = inputData.InputInt();

        System.out.println("Liczba " + number + " podniesiona do potęgi 3 = " + tasksLab01.Task005(number));
    }

    private void Task006Run() {
        System.out.println("\nProgram, który zwraca pierwiastek kwadratowy podanej przez użytkownika liczby.");
        System.out.println("Podaj liczbę: ");
        double number = inputData.InputDouble();

        System.out.println("Pierwiastek kwadratowy liczby " + number + " = " + tasksLab01.Task006(number));
    }

    private void Task007Run() {
        System.out.println("\nProgram, który sprawdza, czy z trzech losowych liczb z podanego przedziału można zbudować trójkąt prostokątny.");
        System.out.print("Podaj minimum przedziału: ");
        int limit1 = inputData.InputInt();

        System.out.print("Podaj maksimum przedziału: ");
        int limit2 = inputData.InputInt();

        System.out.println("3 losowe liczby z przedziału [" + limit1 + ", " + limit2 + "]:");
        int a = RandomInt(limit1, limit2);
        int b = RandomInt(limit1, limit2);
        int c = RandomInt(limit1, limit2);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        if (tasksLab01.Task007(a, b, c)) {
            System.out.println("Z wylosowanych odcinków można zbudować trójkąt prostokątny.");
        }
        else {
            System.out.println("Z wylosowanych odcinków nie można zbudować trójkąta prostokątnego!");
        }
    }

    private int RandomInt(int x, int y) {
        return (random.nextInt(y - x + 1) + x);
    }
}
