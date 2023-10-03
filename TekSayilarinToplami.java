
//*
// Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
// girilen değerlerden
// çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/


import java.util.Scanner;

public class TekSayilarinToplami {
    public void calistir() {
        Scanner input = new Scanner(System.in);
        int x;
        int total=0;
        do{
            System.out.print("Bir sayı girin:");
            x = input.nextInt();

            if(x%2==0 && x%4==0)
            {

                total+=x;
            }
        }
        while(x%2==0);

        System.out.print("Toplam :" +total);
    }

}
