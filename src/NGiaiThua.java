import java.util.Scanner;

public class NGiaiThua {
    Scanner scanner = new Scanner(System.in);

    void nGiaiThua(){
        System.out.println("Bài 3 - Chương trình tính n!");
        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        System.out.print(tinhGiaithua(n) + "\t");

    }

    int tinhGiaithua(int n) {
        int giai_thua = 1;
        if (n == 0 || n == 1) {
            return giai_thua;
        } else {
            for (int i = 2; i <= n; i++) {
                giai_thua *= i;
            }
            return giai_thua;
        }
    }
}
