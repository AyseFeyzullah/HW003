public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        //TODO: Klavyeden girilen Sıcaklık değerleri, diğer birime dönüştürülecektir.
        /*
            Örnek Menü Tasarımı:

            Sıcaklık Dönüşüm Uygulaması
            1. Santigrat - Fahrenheit
            2. Fahrenheit - Santigrat
            Seçim :
            -------------------------
            Formül: F=Cx1.8+32
                    C=(F-32)/1.8
             -----------------------
            Örnek;  F=30x1.8+32=86
                    C=(86-32)/1.8=30
            -------------------------
             Ekran Çıktısı:
             30 C --> 86 F
             86 F --> 30 C
         */


        System.out.println("86 F -->"+convertFahrenheitToCelcius(86) );
        System.out.println("32 C -->"+convertSntigratToCelcius(32));

    }
    public static double convertFahrenheitToCelcius(int grade){
        return (grade-32)/1.8;
    }
    public static double convertSntigratToCelcius(int grade){
        return (grade*1.8)+32;
    }


}
