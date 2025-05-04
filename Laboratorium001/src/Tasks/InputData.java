package Tasks;
import java.util.Scanner;


public class InputData {
    Scanner input = new Scanner(System.in);

    protected int InputInt() {
        return input.nextInt();
    }

    protected float InputFloat() {
        return input.nextFloat();
    }

    protected double InputDouble() {
        return input.nextDouble();
    }

    protected String InputString() {
        return input.next();
    }

    protected boolean InputBoolean() {
        return input.nextBoolean();
    }
}
