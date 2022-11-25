import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        int type,age,distance;
        double price=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Gideceğiniz mesafeyi KM cinsinden girin: ");
        distance = input.nextInt();
        System.out.print("Yaşınızı girin: ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini girin (1: Tek Yön, 2: Gidiş Dönüş) : ");
        type = input.nextInt();

        price = distance*0.10;


        if ((age>0 && distance>0) && (type==1 || type==2) ){
            if (age<12){
                price=price/2;
            } else if (age>12 && age<24) {
                price= price - (price*0.10) ;
            } else if (age>65) {
                price=price - (price*0.30);
            }
            if(type==2){
                price=(price-(price*0.20))*2;
            }
            System.out.print("Bilet Tutarı: "+ price + " TL");

        }else{
            System.out.print("Hatalı Veri Girdiniz!");
        }

    }
}
