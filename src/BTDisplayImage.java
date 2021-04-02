import java.util.Scanner;

public class BTDisplayImage {
    public static void main(String[] args) {
        int choise = -1;
        Scanner scanner = new Scanner(System.in);
        int height;
        int width;
        System.out.println("Enter height");
        height = scanner.nextInt();
        System.out.println("Enter height");
        width = scanner.nextInt();
        while (choise != 0){
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choise = scanner.nextInt();
            switch (choise){
                case 1:
                    for (int i = 1; i <= height; i++){
                        for (int j = 1; j <= width; j++ ){
                            System.out.println("*");
                        }
                        System.out.println("");
                    }
                    scanner.close();
                case 2:
                    for (int i=1; i<=height; i++){
                        for (int j=1; j<i; j++){
                            System.out.println("*");
                        }
                    }
                    scanner.close();
                case 3:
                    for (int i=height; i >= height; i++){
                        for (int j=1; j<= i; j++){
                            System.out.println("*");
                        }
                        System.out.println("");
                    }

            }
        }

    }
}
