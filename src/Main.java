//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

class Die_Roller {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean keepPlaying = true;

        while (keepPlaying) {
            System.out.printf("%-6s %-5s %-5s %-5s %-3s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            int rollCount = 0;
            boolean isTriple = false;

            while (!isTriple) {
                rollCount++;

                int die1 = rand.nextInt(6) + 1;
                int die2 = rand.nextInt(6) + 1;
                int die3 = rand.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-6d %-5d %-5d %-5d %-3d%n", rollCount, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    isTriple = true;
                }
            }

            System.out.print("\nDo you want to roll again? (y/n): ");
            String choice = scanner.next().trim().toLowerCase();
            if (!choice.startsWith("y")) {
                keepPlaying = false;
                System.out.println("Thanks for playing!");
            }
        }

        scanner.close();
    }
}




