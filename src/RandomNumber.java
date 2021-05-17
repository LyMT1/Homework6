import java.util.Random;

import java.util.Random;

public class RandomNumber {
    Random generator = new Random();
    NGiaiThua nGiaiThua = new NGiaiThua();
    SoNguyenTo soNguyenTo = new SoNguyenTo();

    void randomNumber(){
        int n = generator.nextInt(10);
        System.out.println("Chọn ngẫu nhiên số n = " + n);
        System.out.println("Kiểm tra n có phải số nguyên tố: " + soNguyenTo.checkPrimeNumberForLoop(n));
        nGiaiThua.tinhGiaithua(n);
        System.out.print("n! = " + nGiaiThua.tinhGiaithua(n) + "\t");
    }
}
