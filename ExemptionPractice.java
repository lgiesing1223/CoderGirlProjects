import java.util.Scanner;
import static java.lang.System.out;

public class ExemptionPractice {
    public static void runtimePractice() {
        boolean done = false;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                out.println("Enter first number: ");
                double a = sc.nextDouble();
                out.println("Enter second number: ");
                double b = sc.nextDouble();
                out.println(a + " divided by " + b + " is " + a / b);
                done = true;
            } catch (Exception e) {
                out.println("You can't do that. Try again.");
                e.printStackTrace();
            }
        } while (!done);
    }

    public static void exceptionPractice() {
        boolean done = false;
        Scanner sc = new Scanner(System.in);
        out.println("Enter a whole number between 1 and 10: ");

        do {
            try {
                int a = sc.nextInt();
                if (a < 1 || a > 10) throw new Exception();
                done = true;
                out.println("You entered: " + a);
            } catch (Exception e) {
                out.println("Numbers not in range. Try again.");
                e.printStackTrace();
            }
        } while(!done);
    }

    public static void main (String[]args){
        runtimePractice();
        out.println();
        exceptionPractice();
        }

    }

