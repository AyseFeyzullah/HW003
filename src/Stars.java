import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        //TODO: Klavyeden girilen sayı kadar yıldızı ekrana tablo halinde yazan bir program yazınız.
        /*
            Ekran:
            Yıldız Adedi:
            Sütun Adedi :


            Örnek;
            Yıldız Adedi: 54
            Sütun Adedi : 12
            *	*	*	*	*	*	*	*	*	*	*	*
            *	*	*	*	*	*	*	*	*	*	*	*
            *	*	*	*	*	*	*	*	*	*	*	*
            *	*	*	*	*	*	*	*	*	*	*	*
            *	*	*	*	*	*
         */
        Scanner input=new Scanner(System.in);
        int yildizAdedi;
        int sutunAdedi;
        System.out.println("Yildiz Adedi:");
        yildizAdedi=input.nextInt();
        System.out.println("Sutun Adedi:");
        sutunAdedi=input.nextInt();

        for (int i = 1; i <=yildizAdedi; i++) {
            System.out.print("*\t");
            if(i%sutunAdedi==0){
                System.out.println("*\n");
            }


        }
    }


}
