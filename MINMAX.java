import java.util.Scanner;

public class MINMAX {
    public void calistir() {
        /*
    * Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
En küçük sayı: -22*/
        Scanner input = new Scanner(System.in);
        System.out.println("kaç sayı gireceksiniz:");
        int x = input.nextInt();
        if (x <= 0) {
            System.out.println("Lütfen geçerli bir pozitif sayı girin.");
            return;
        }
        int max=0;
        int min=0;
        for(int i=1;i<=x;i++){
            System.out.print( i +". sayı: ");           int currentnumber = input.nextInt();
            if (currentnumber < min) {
                min = currentnumber;
            }

            if (currentnumber > max) {
                max = currentnumber;
            }
        }
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);

    }

}
