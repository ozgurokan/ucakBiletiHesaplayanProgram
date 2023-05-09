import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double perKM = 0.10, km, total;
        int type, age;

        Scanner input = new Scanner(System.in);

        System.out.print("Yolculuk Mesafesini Kilometre Cinsinden Giriniz: ");
        km = input.nextInt();

        System.out.print("Lütfen Yaşınızı Giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        type = input.nextInt();

        total = km * perKM;

        if ((age > 0) && (age <= 12)) {
            total -= total * 0.5;
        } else if ((age > 12) && (age <= 24)) {
            total -= total * 0.1;
        } else if ((age >= 65)) {
            total -= total * 0.3;
        }
        if(age>0 && km>0){
            switch (type) {
                case 1:
                    System.out.println("Toplam Tutar = " + total);
                    break;
                case 2:
                    total -= total * 0.2;
                    System.out.println("Toplam Tutar = " + (2 * total));
                    break;
                default:
                    System.out.println("Yolculuk Tipi sadece 1 ve 2 olarabilir. Tekrar Deneyiniz.");
            }
        }else{
            System.out.println("Geçerli Değerler giriniz...");
        }

    }
}