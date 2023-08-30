import java.util.Scanner;

public class Taksimetre {
    /*Taksimetre Programı
    Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

    Taksimetre KM başına 2.20 TL tutmaktadır.
    Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    Taksimetre açılış ücreti 10 TL'dir.*/

    public void calistir() {
        System.out.println("kaç kilometre gittin?" );
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        float b= a*((float)(2.20));
        float tutar=b+10;
        if(tutar<20){
            tutar=20;
            System.out.println("Ödeyeceğin miktar: 20 ");
        }else{
            System.out.println("Ödeyeceğin miktar:"+String.format("%.2f", tutar));
        }
    }
}
