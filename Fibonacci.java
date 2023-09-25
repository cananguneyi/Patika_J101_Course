import java.util.Scanner;

public class Fibonacci {
    public void calistir() {
        Scanner input = new Scanner(System.in);
        int x,y,i,z;
        x=0;
        y=1;
        System.out.print("Fibonacci serisinin eleman sayısı kaç olsun?: ");
        z = input.nextInt();
        System.out.print("Fibonacci: ");
        System.out.print(x +" "+y);
        for(i=1;i<(z-1);i++){
            int t=x+y;
            System.out.print(" "+t);
            x=y;
            y=t;
        }

    }
}
