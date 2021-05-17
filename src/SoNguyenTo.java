import java.util.Scanner;

public class SoNguyenTo {
    Scanner scanner = new Scanner(System.in);

    void SoNguyenTo1() {
        System.out.println("Bài 1 - Chương trình liệt kê n số nguyên tố đầu tiên");
        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        //Cách 1: Vòng lặp for
        int count = 0;
        for (int i = 0; count < n; i++) {
            if (checkPrimeNumberForLoop(i)) {
                System.out.print(i + "\t");
                count++;
            }
        }

        //Cách 2: Vòng lặp while
//        int count = 0;
//        int i = 0;
//        while (count < n) {
//            if (checkPrimeNumberWhileLoop(i)) {
//                System.out.print(i + "\t");
//                count++;
//            }
//            i++;
//        }
//
//        //Cách 3: Vòng lặp do while
//        int count = 0;
//        int i = 0;
//        do {
//            if (checkPrimeNumberDoWhileLoop(i)) {
//                System.out.print(i + "\t");
//                count++;
//            }
//            i++;
//        } while (count < n);
    }

    void SoNguyenTo2() {
        System.out.println("Bài 2 - Chương trình liệt kê các số nguyên tố nhỏ hơn n");
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        int count = 0;
        int i = 0;
        while (i < n) {
            if (checkPrimeNumberWhileLoop(i)) {
                System.out.print(i + "\t");
                count++;
            }
            i++;
        }
        System.out.println("\nCó tất cả " + count + " số nguyên tố trong phạm vi từ 0 - " + n);
    }

    //Kiểm tra số nguyên tố
    boolean checkPrimeNumberForLoop(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    boolean checkPrimeNumberWhileLoop(int n) {
        if (n < 2) {
            return false;
        }
        int i = 2;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    boolean checkPrimeNumberDoWhileLoop(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        }
        int squareRoot = (int) Math.sqrt(n);
        int i = 2;
        do {
            if (n % i == 0) {
                return false;
            }
            i++;
        } while (i <= squareRoot);
        return true;
    }

}
