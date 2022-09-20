public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Salamlar");
        String ortaMetin = "Ilginizi cheke bilir";
        System.out.println(ortaMetin);

        int a = 12;
        int b = 10;
        int sonuc = a * b;
        System.out.println(sonuc);

        double dollarDunen = 1.69;
        double dollarBugun = 1.69;

        String oxIstiqameti = "";

        if (dollarBugun < dollarDunen) {
            oxIstiqameti = "down.svg";
            System.out.println("Dollarin qiymeti dushmushdur" + " " + oxIstiqameti);

        } else if (dollarBugun > dollarDunen) {
            oxIstiqameti = "up.svg";
            System.out.println("Dollarin qiymeti qalxmishdir" + " " + oxIstiqameti);

        } else {
            oxIstiqameti = "equal.svg";
            System.out.println("Dollarin qiymeti deyishmemishdir" + " " + oxIstiqameti);
        }

        String[] mashinlar = { "BMW", "Mercedes", "Audi" };

        for (int i = 0; i < mashinlar.length; i++) {
            System.out.println(mashinlar[i]);
        }
    }
}
