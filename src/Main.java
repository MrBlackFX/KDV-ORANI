import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar;
        double kdvOrani = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutarini Giriniz: ");
        tutar = input.nextDouble();
        if(tutar>0){
            if(tutar>1000){
                kdvOrani=0.8;

            }else{
                kdvOrani=0.18;
            }
        }else{
            System.out.println("Hatali Tutar Girdiniz !!!");
            return;
        }
        
        double kdvTutari = tutar * kdvOrani;
        double kdvliTutar = kdvTutari + tutar;
        System.out.println("KDV orani: " +kdvOrani);
        System.out.println("KDV Tutari: ");
        System.out.println(kdvliTutar);

    }
}