package LearnBF;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("\nHello in SMALL CALCULATOR!");

        do {
            System.out.println("\nSelect the option!");
            for (int x = 0; x < Operations.values().length; x++) {
                if (x == Operations.values().length - 1) {
                    System.out.println(Operations.values()[x] + "\n");
                    break;
                }
                System.out.println(x + ". " + Operations.values()[x]);
            }

            System.out.print("Choose number of the operation or press Enter to EXIT: ");

            //TODO Why if loop work incorrectly??
            String choiceStr = scanner.nextLine();
            if (choiceStr.length() == 0) break;

            Double choice = Double.parseDouble(choiceStr);
            int choiceInt = choice.intValue();

            switch (choiceInt) {
                case 0: {
                    System.out.print("\nYou've chosen " + Operations.values()[choiceInt] + "\n");
                    System.out.print("Please give me first integer number: ");
                    Integer a = scanner.nextInt();
                    System.out.print("Please give me second integer number: ");
                    Integer b = scanner.nextInt();
                    int result = a + b;
                    System.out.print("SUM equals: " + result + " !\n");
                    break;
                }
                case 1: {
                    System.out.print("\nYou've chosen " + Operations.values()[choiceInt] + "\n");
                    System.out.print("Please give me first integer number: ");
                    Integer a = scanner.nextInt();
                    System.out.print("Please give me second integer number: ");
                    Integer b = scanner.nextInt();
                    int result = a - b;
                    System.out.print("DIFFERENCE equals: " + result + " !\n");
                    break;
                }
                case 2: {
                    System.out.print("\nYou've chosen " + Operations.values()[choiceInt] + "\n");
                    System.out.print("Please give me first integer number: ");
                    Integer a = scanner.nextInt();
                    System.out.print("Please give me second integer number: ");
                    Integer b = scanner.nextInt();
                    int result = a * b;
                    System.out.print("PRODUCT equals: " + result + " !\n");
                    break;
                }
                case 3: {
                    System.out.print("\nYou've chosen " + Operations.values()[choiceInt] + "\n");
                    System.out.print("Please give me first integer number: ");
                    Integer a = scanner.nextInt();
                    System.out.print("Please give me second integer number: ");
                    Integer b = scanner.nextInt();
                    double result = (double) a / b;
                    System.out.print("QUOTIENT equals: " + result + " !\n");
                    break;
                }
            }

        } while (true);
    }

}


