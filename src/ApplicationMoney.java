import java.util.Scanner;

public class ApplicationMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD");
        usd = scanner.nextDouble();
        double result = usd * vnd;
        System.out.println("Gía trị VND " + result);
    }
}
