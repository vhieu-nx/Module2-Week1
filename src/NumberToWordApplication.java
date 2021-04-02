import java.util.Scanner;

public class NumberToWordApplication {
    public static void main(String[] args) {
        System.out.println("Mời nhập số:");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if (0 <= number && number < 1000) {
            if (number < 10) {
                String donvi = "";
                switch (number) {
                    case 0:
                        donvi = " zero";
                    case 1:
                        donvi = " one";
                        break;
                    case 2:
                        donvi = " two";
                        break;
                    case 3:
                        donvi = " three";
                        break;
                    case 4:
                        donvi = " four";
                        break;
                    case 5:
                        donvi = " five";
                        break;
                    case 6:
                        donvi = " six";
                        break;
                    case 7:
                        donvi = " seven";
                        break;
                    case 8:
                        donvi = " eight";
                        break;
                    case 9:
                        donvi = " night";
                        break;
                }
                System.out.println(donvi);
            }else if (number < 20){
                String docso;

                switch (number % 10){
                    case 0:
                        docso = "teen";
                        break;
                    case 1:
                        docso = "elevent";
                        break;
                    case 2:
                        docso = "twelve";
                        break;
                    case 3:
                        docso = "thirteen";
                        break;
                    case 4:
                        docso = "fourteen";
                        break;
                    case 5:
                        docso = "fifteen";
                        break;
                    case 6:
                        docso = "sixteen";
                        break;
                    case 7:
                        docso = "seventeen";
                        break;
                    case 8:
                        docso = "eighteen";
                        break;
                    case 9:
                        docso = "nineteen";
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + number % 10);
                }
                System.out.println(docso);
            }else if (20 <= number && number < 100){
                String hangchuc="";
                String donvi="";
                switch (number % 10){
                    case 0:
                        donvi = "";
                        break;
                    case 1:
                        donvi = " one";
                        break;
                    case 2:
                        donvi = " two";
                        break;
                    case 3:
                        donvi = " three";
                        break;
                    case 4:
                        donvi = " four";
                        break;
                    case 5:
                        donvi = " five";
                        break;
                    case 6:
                        donvi = " six";
                        break;
                    case 7:
                        donvi = " seven";
                        break;
                    case 8:
                        donvi = " eight";
                        break;
                    case 9:
                        donvi = " nine";
                        break;
                }
//                System.out.println(donvi);
                switch (number / 10){
                    case 2:
                        hangchuc = "twenty";
                        break;
                    case 3:
                        hangchuc = "thirty";
                        break;
                    case 4:
                        hangchuc = "forty";
                        break;
                    case 5:
                        hangchuc = "fifty";
                        break;
                    case 6:
                        hangchuc = "sixty";
                        break;
                    case 7:
                        hangchuc = "seventy";
                        break;
                    case 8:
                        hangchuc = "eighty";
                        break;
                    case 9:
                        hangchuc = "ninety";
                        break;

                }
                System.out.println(hangchuc + donvi);
            }
            else if (number >= 100){
                String hangtram = "";
                String hangdonvi = "";
                String hangchuc = "";
                switch (number / 100){
                    case 1:
                        hangtram = "Onehundred";
                        break;
                    case 2:
                        hangtram = "Twohundred";
                        break;
                    case 3:
                        hangtram = "Threehundred";
                        break;
                    case 4:
                        hangtram = "Fourhundred";
                        break;
                    case 5:
                        hangtram = "Fivehundred";
                        break;
                    case 6:
                        hangtram = "Sixhundred";
                        break;
                    case 7:
                        hangtram = "Sevenhundred";
                        break;
                    case 8:
                        hangtram = "Eighthundred";
                        break;
                    case 9:
                        hangtram = "Ninehundred";
                        break;
                }
                switch ((number % 100) % 10){
                    case 0:
                        hangdonvi = "";
                        break;
                    case 1:
                        hangdonvi = " one";
                        break;
                    case 2:
                        hangdonvi = " two";
                        break;
                    case 3:
                        hangdonvi = " three";
                        break;
                    case 4:
                        hangdonvi = " four";
                        break;
                    case 5:
                        hangdonvi = " five";
                        break;
                    case 6:
                        hangdonvi = " six";
                        break;
                    case 7:
                        hangdonvi = " seven";
                        break;
                    case 8:
                        hangdonvi = " eight";
                        break;
                    case 9:
                        hangdonvi = " nine";
                        break;
                }
                switch ((number % 100) / 10){
                    case 0:
                        hangchuc = "";
                        break;
                    case 1:
                        hangchuc = "";
                        switch ((number % 100) % 10){
                            case 0:
                                hangdonvi = " teen";
                                break;
                            case 1:
                                hangdonvi = " eleven";
                                break;
                            case 2:
                                hangdonvi = " twelve";
                                break;
                            case 3:
                                hangdonvi = " thirteen";
                                break;
                            case 4:
                                hangdonvi = " fourteen";
                                break;
                            case 5:
                                hangdonvi = " fifteen";
                                break;
                            case 6:
                                hangdonvi = " sixteen";
                                break;
                            case 7:
                                hangdonvi = " seventeen";
                                break;
                            case 8:
                                hangdonvi = " eighteen";
                                break;
                            case 9:
                                hangdonvi = " nineteen";
                                break;
                        }
                        break;
                    case 2:
                        hangchuc = " twenty";
                        break;
                    case 3:
                        hangchuc = " thirty";
                        break;
                    case 4:
                        hangchuc = " forty";
                        break;
                    case 5:
                        hangchuc = " fifty";
                        break;
                    case 6:
                        hangchuc = " sixty";
                        break;
                    case 7:
                        hangchuc = " seventy";
                        break;
                    case 8:
                        hangchuc = " eighty";
                        break;
                    case 9:
                        hangchuc = " ninety";
                        break;

                }
                System.out.println(hangtram + hangchuc + hangdonvi);
            }
        }
    }
}


