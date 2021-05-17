import java.util.Scanner;

public class BaiTap5 {

    static void Bt5 ()
    {
        String chuoi;
        char kyTu = 'o';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        System.out.println("Index của tất cả ký tự ‘o’ trong chuỗi trên là: ");
        // duyệt từ đầu đến cuối chuỗi
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                System.out.println(i);
            }
        }
    }
}
