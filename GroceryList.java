import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String item1;
        String item2;
        String item3;

        out.println("Please list three items on your grocery shopping list: ");

        out.println("Item 1: ");
        item1 = keyboard.nextLine();

        out.println("Item 2: ");
        item2 = keyboard.nextLine();

        out.println("Item 3: ");
        item3 = keyboard.nextLine();

        int count1;
        int count2;
        int count3;

        out.println("Now, please enter the quantity of each item");


        out.println("How many " + item1 + "?");
        count1 = keyboard.nextInt();

        out.println("How many " + item2 + "?");
        count2 = keyboard.nextInt();

        out.println("How many " + item3 + "?");
        count3 = keyboard.nextInt();

        float cost1;
        float cost2;
        float cost3;
        float total;

        out.println("Now, please enter the cost of each item.");

        out.println("Cost of " + item1 + ":");
        cost1 = keyboard.nextFloat();

        out.println("Cost of " + item2 + ":");
        cost2 = keyboard.nextFloat();

        out.println("Cost of " + item3 + ":");
        cost3 = keyboard.nextFloat();

        total = (count1 * cost1) + (count2 * cost2) + (count3 * cost3);

        out.println("Calculating your grocery bill.");
        out.print("Your total cost is $");
        out.printf("%.2f", total);

    }
}
