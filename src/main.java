import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double Pi,Alan,Çevre,Dilim;
        int r,a;
        System.out.print("Dairenin Yarıçapını Giriniz : " );
        Pi= 3.14;
        Scanner Veri= new Scanner(System.in);
        r= Veri.nextInt();
        System.out.print("Daire Diliminin Açısını Giriniz : ");
        a= Veri.nextInt();
        Alan= Pi * r * r;
        Çevre= 2 * Pi * r;
        System.out.println("Dairenin Alanı: " + Alan);
        System.out.println("Dairenin Çevresi: " + Çevre);
        Dilim= (Pi * (r*r) * a) / 360;
        System.out.println("Daire Diliminin Alanı : " + Dilim);

    }
}
