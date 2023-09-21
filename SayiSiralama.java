import java.util.Scanner;

public class SayiSiralama {
    public void calistir(){
        /*Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.*/

        Scanner input = new Scanner(System.in);
        System.out.println("3 sayı Gir ");
        int x,y,z, max,mid,min;
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        if (x<=y && x<=z){
                min=x;
         if (y<=z){
                mid=y;
                max=z;}
         else{
             mid=z;
             max=y;
         }
        }
        else if (y<=z && y<=x){
               min=y;
           if (x<=z){
               mid=x;
               max=z;}
           else{
               mid=z;
               max=x;

           }
        }
        else {
               min=z;
           if(y<=x){
               mid=y;
               max=x;}
           else{
               mid=x;
               max=y;
           }
        }

        System.out.println("Sıralama sonucu: " + min + " < " + mid + " < " + max );

    }
}
