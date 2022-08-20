import java.util.Scanner;

public class Notlar {
    public static void main(String[] args) {
        //TODO: Klavyeden girilen vize ve final notlarının ortalamasını ve harf notunu bulan bir program yazınız.
        /*
            Vize Notu :
            Final Notu :

            Formül: not=Vize Notu x 0.4 + Final Notu x 0.6
            Harfler:
                A 90-100
                B 80-89
                C 70-79
                D 60-69
                F 0-59

            Örnek Ekran Çıktısı:

            Not : 80 [B]

         */
        Scanner input=new Scanner(System.in);
        int notSayisi=2;
        int not1;
        int not2;
        double toplam=0;
        double ortalama;
        for (int i = 0; i < notSayisi; i++) {
            System.out.println("Vize notu:");
            not1=input.nextInt();
            System.out.println("Final Notu:");
            not2=input.nextInt();
            toplam=not1+not2;

            ortalama=toplam/notSayisi;
            System.out.println("Not Ortalamasi="+ortalama);


            char notHarf=ortalama<60?'F':ortalama<70?'D':ortalama<80?'C':ortalama<90?'B':ortalama<100?'A':'G';
            System.out.println(ortalama+"--->"+notHarf);


        }





    }

}
