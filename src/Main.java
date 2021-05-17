import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        SoNguyenTo soNguyenTo = new SoNguyenTo();
        Fibonacci fibonacci = new Fibonacci();
        NGiaiThua nGiaiThua = new NGiaiThua();
        RandomNumber randomNumber = new RandomNumber();
        BaiTap8 baiTap8 = new BaiTap8();
        BaiTap5 baiTap5 = new BaiTap5();
        BaiTap15 baiTap15 = new BaiTap15();

        System.out.println("**----------------------------------------------------**");

        System.out.println("Nhập số 1 - Chương trình liệt kê n số nguyên tố đầu tiên");
        System.out.println("Nhập số 2 - Chương trình liệt kê các số nguyên tố nhỏ hơn 100");
        System.out.println("Nhập số 3 - Chương trình liệt kê n số fibonacci đầu tiên");
        System.out.println("Nhập số 4 - Chương trình tính n!");
        System.out.println("Nhập số 5 - Random số n, kiểm tra n có phải số nguyên tố, tính n!");
        System.out.println("Nhập số 6 - Bài tập 5: In ra màn hình index của tất cả ký tự ‘o’ trong chuỗi");
        System.out.println("Nhập số 7 - Bài tập 8: Nhập vào một chuỗi và đếm số từ của chuỗi đó");
        System.out.println("Nhập số 8 - Bài tập 15: Đếm số lần ký tự ‘o’ xuất hiện trong chuỗi");


        System.out.println("\nNhập -1 để thoát chương trình");

        int number = -1;
        do {
            System.out.print("\nBạn muốn giải bài tập số: ");
            number = scanner.nextInt();
            if (number != -1) {
                switch (number) {
                    case 1:
                        soNguyenTo.SoNguyenTo1();
                        break;
                    case 2:
                        soNguyenTo.SoNguyenTo2();
                        break;
                    case 3:
                        fibonacci.fibonacci1();
                        break;
                    case 4:
                        nGiaiThua.nGiaiThua();
                        break;
                    case 5:
                        randomNumber.randomNumber();
                        break;
                    case 6:
                        baiTap5.Bt5();
                        break;
                    case 7:
                        baiTap8.Bt8();
                        break;
                    case 8:
                        baiTap15.Bt15();
                        break;
                    default:
                        System.out.println("Không có bài tập này. Hãy chọn từ 1 -> 4");
                        System.out.println("Nhập -1 để thoát chương trình");
                        break;
                }
            }
        } while (number >= 0);
    }
}
