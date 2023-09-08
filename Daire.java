import java.util.Scanner;

public class Daire {
    public void calistir() {
        /*/Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

                Alan Formülü : π * r * r;

        Çevre Formülü : 2 * π * r;

        Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

                Formül : (𝜋 * (r*r) * 𝛼) / 360*/
        System.out.println("yarıçapını gir" );
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        System.out.println("açıyı gir" );
        int y = input.nextInt();
        double pi= 3.14;
        double x= Math.pow(r,2);
        double totalalan = pi * x;
        double alan = (totalalan*y)/360;
        System.out.println("alan: " + alan);

}}
