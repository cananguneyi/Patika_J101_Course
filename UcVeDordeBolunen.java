import java.util.Scanner;

public class UcVeDordeBolunen {
    public void calistir(){
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı Gir ");
        int x,i=1,sayac=0,toplam=0;
        x = input.nextInt();
        while(i<=x){
            if(i%3==0 && i%4==0){
                System.out.println(+ i);
                toplam+=i;
                sayac++;
            }
            i++;
        }
        if(sayac>0){
            System.out.println("Ortalama: "+ toplam/sayac);
        }
        else {
            System.out.println("Üçe ve dörde tam bölünen sayı bulunamadı.");
        }
    }
}
