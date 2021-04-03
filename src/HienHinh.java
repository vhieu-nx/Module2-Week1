import java.util.Scanner;
public class HienHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, bottom-left, bottom-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The rectangle");
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("*");
                        }
                        System.out.print("*");
                    }
                    choice = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Top left");
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    System.out.println("Top right");
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("*");
                    }

                    System.out.println("Bottom left");
                    for (int i = 1; i < 7; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    System.out.println("Bottom right");
                    for (int i = 0; i < 7; i++) {
                        for (int j = i; j < 6; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    choice = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("The isosceles triangle");
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                    }
                    choice = scanner.nextInt();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
                    choice = scanner.nextInt();
            }
        }

    }
}
