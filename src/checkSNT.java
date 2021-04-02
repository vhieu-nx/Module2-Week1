import java.util.Scanner;

public class checkSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số kiểm tra có phải là số nguyên tố hay không");
        int number = scanner.nextInt();
        if (number<=1) {
            System.out.println(number +" khong la SNT");
        }
        else if (number==2 || number==3) {
            System.out.println(number + " la snt");
        }
        else{
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(number) ; i++) {
                if (number % i == 0){
                    flag = false;
                    break;
                }
            }

            if (flag){
                System.out.println(number + " la snt");
            }
            else {
                System.out.println(number + " khong la snt");
            }
        }
    }
}
