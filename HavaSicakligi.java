import java.util.Scanner;

public class HavaSicakligi {
    public void calistir(){
        int x;
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Hava Sıcaklığını Gir ");
            x = input.nextInt();
            if (x < 5) {
                System.out.println("Kayak Yap");
            } else if (5 < x && x < 15) {
                System.out.println("Sinemaya Git");
            } else if (15 < x && x < 25) {
                System.out.println("Pikniğe Git");
            } else if (x > 25) {
                System.out.println("Yüzmeye Git");
            }
        }
    }
}
/*Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/