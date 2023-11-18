import java.util.Scanner;
public class Mukemmel_Sayi {
    public void calistir() {
        /*Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir*/
        Scanner input = new Scanner(System.in);
        System.out.println("sayı girin:");
        int x = input.nextInt();
        int toplam=0;
        for(int i=1;i<x;i++){
            if(x%i==0){
                toplam+=i;
            }
        }
        if(toplam==x){
            System.out.println(x+" mükemmel bir sayıdır.");
        }
        else System.out.println(x+" mükemmel bir sayı değildir.");
    }
}
