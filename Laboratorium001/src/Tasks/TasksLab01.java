package Tasks;

public class TasksLab01 {
    protected String Task001(String name, int age) {
        return "Imię: " + name + ", wiek: " + age + ".";
    }

    public void Task002(double value01, double value02) {
        double sum = value01 + value02;
        double difference = value01 - value02;
        double product = value01 * value02;
        double quotient = 1;

        System.out.println("Suma: " + sum + ".");
        System.out.println("Różnica: " + difference + ".");
        System.out.println("Iloczyn: " + product + ".");
        if (value02 != 0){
            quotient = value01/value02;
            System.out.println("Iloraz: " + quotient + ".");
        }
        else {
            System.out.println("Nie można dzielić przez zero!");
        }
    }

    public boolean Task003(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public boolean Task004(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return true;
        }
        return false;
    }

    public int Task005(int number) {
        return (number * number * number);
    }

    public double Task006(double number) {
        return (Math.sqrt(number));
    }

    public boolean Task007(int a, int b, int c) {
        if ((a + b) > c && (a + c) > b && (c + b) > a) {
            int aSquared = a * a;
            int bSquared = b * b;
            int cSquared = c * c;
            if ((aSquared + bSquared) == cSquared || (aSquared + cSquared) == bSquared || (bSquared + cSquared) == aSquared) {
                return true;
            }
        }
        return false;
    }

    public void CloseProgram() {
        System.out.println("Dziękuję za skorzystanie z programu! :)");
    }
}
