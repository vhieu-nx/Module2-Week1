import java.util.Scanner;

public class Prime {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        showAll(n);


//        while (dem < n) {
//            if (isPrimeNumber(i)) {
//                System.out.print(i + " ");
//                dem++;
//            }
//            i++;
//        }
    }

    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void showAll (int n){
        int dem = 0; // đếm số số nguyên tố
        int i = 2;   // tìm số nguyên tố bắt dầu từ số
        while (dem <n){
            if (isPrimeNumber(i)) {
                System.out.println(i);
                dem++;}
            i++;
        }
    }
}
