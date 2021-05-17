import java.util.Scanner;

public class Fibonacci {
    Scanner scanner = new Scanner(System.in);

    void fibonacci1() {
        System.out.println("Bài 2 - Chương trình liệt kê n số fibonacci đầu tiên");
        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        //Cách 1: Vòng lặp for
        int count = 0;
        for (int i = 0; count < n; i++) {
            System.out.print(fibonacciForLoop(i) + "\t");
            count++;
        }
//
//        //Cách 2: Vòng lặp while
//        int count = 0;
//        int i = 0;
//        while (count < n) {
//            System.out.print(fibonacciWhileLoop(i) + "\t");
//            count++;
//            i++;
//        }
//
//        //Cách 3: Vòng lặp do while
//        int count = 0;
//        int i = 0;
//        do {
//            System.out.print(fibonacciDoWhileLoop(i) + "\t");
//            count++;
//            i++;
//        } while (count < n);
    }

    int fibonacciForLoop(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

    int fibonacciWhileLoop(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            int i = 2;
            while (i < n) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
                i++;
            }
        }
        return fn;
    }

    int fibonacciDoWhileLoop(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            int i = 2;
            do {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
                i++;
            } while (i < n);
        }
        return fn;
    }

}
