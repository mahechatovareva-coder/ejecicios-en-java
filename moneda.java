import java.util.Scanner;

public class moneda {
    public static double conversionALas8AM(double P) {
        return P;
    }
    public static double conversionALMediodia(double P) {
        return P *0.9;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad P:");
        double P = sc.nextDouble();
        System.out.println("Cantidad a las 8:00 a.m.:"+ conversionALas8AM(P));
        System.out.println("Cantidad al mediodia (con disminucion del 10%):"+conversionALMediodia(P));
        sc.close();
    }
}
