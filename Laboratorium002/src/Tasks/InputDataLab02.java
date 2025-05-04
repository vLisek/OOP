package Tasks;

import java.util.Scanner;

public class InputDataLab02 {
    private final Scanner scanner;

    public InputDataLab02(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getInt(String prompt) {
        int value = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.print(prompt);
                value = Integer.parseInt(scanner.nextLine());
                isValid = true;
            }

            catch (NumberFormatException e) {
                System.out.println("Błąd: Wprowadź poprawną liczbę całkowitą.");
            }
        }

        return value;
    }

    public double getDouble(String prompt) {
        double value = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.print(prompt);
                value = Double.parseDouble(scanner.nextLine());
                isValid = true;
            }

            catch (NumberFormatException e) {
                System.out.println("Błąd: Wprowadź poprawną liczbę.");
            }
        }

        return value;
    }

    public boolean getBoolean(String prompt) {
        boolean value = false;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("true") || input.equals("false")) {
                value = Boolean.parseBoolean(input);
                isValid = true;
            } else {
                System.out.println("Błąd: Wprowadź true lub false.");
            }
        }

        return value;
    }
}