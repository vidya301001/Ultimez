import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for pizza types and their slice counts
        final int[] pizzaSizes = {1, 4, 6, 8};
        final String[] pizzaNames = {"Small", "Regular", "Medium", "Large"};

        // Get the number of party attendees
        System.out.print("Enter the number of party attendees: ");
        int attendees = scanner.nextInt();

        // Calculate the total number of slices needed
        int totalSlicesNeeded = attendees * 2; // Assuming each person gets 2 slices

        // Calculate the minimum number of each pizza type needed
        int[] pizzaCount = new int[pizzaSizes.length];
        for (int i = 0; i < pizzaSizes.length; i++) {
            pizzaCount[i] = (totalSlicesNeeded + pizzaSizes[i] - 1) / pizzaSizes[i];
        }

        // Display the results
        System.out.println("Minimum number of each pizza type needed:");
        for (int i = 0; i < pizzaSizes.length; i++) {
            System.out.println(pizzaNames[i] + " Pizza: " + pizzaCount[i]);
        }

        scanner.close();
    }
}
