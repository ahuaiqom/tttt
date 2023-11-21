import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int angkaRandom = random.nextInt(100) + 1;
        int tebakan;
        int jumlahTebakan = 0;
        boolean tebakanBenar = false;

        System.out.println("Selamat datang di permainan Tebak Angka!");
        System.out.println("Saya telah memilih sebuah angka antara 1 sampai 100.");

        do {
            System.out.print("Tebak angka: ");
            tebakan = scanner.nextInt();
            jumlahTebakan++;

            if (tebakan == angkaRandom) {
                tebakanBenar = true;
            } else if (tebakan < angkaRandom) {
                System.out.println("Angka terlalu kecil. Coba lagi.");
            } else {
                System.out.println("Angka terlalu besar. Coba lagi.");
            }
        } while (!tebakanBenar);

        System.out.println("Selamat! Anda menebak angka dengan benar setelah " + jumlahTebakan + " kali tebakan.");
        scanner.close();
    }
}