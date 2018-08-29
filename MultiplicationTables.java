import java.util.Scanner;
import static java.lang.System.out;

public class MultiplicationTables {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.println("Welcome to Multiplication Tables");

        out.println("How large would you like to see them? (20 max)?");
        int size = sc.nextInt();
        int firstN = 0;

        while (firstN != (1+size)) {

            for (int counter = 0; counter <= size; counter++){

                out.println(firstN + " * "+ counter + " = " + (firstN * counter));
            }
            firstN++;
       }

    }
}