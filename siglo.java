import java.util.Scanner;

public class siglo {
    public static int siglo(int anho){
        return (anho-1)/100+1;
    }
    public static int primer_anho(int siglo){
        return (siglo-1)*100+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un año n: ");
        int n = sc.nextInt();
        int s = siglo(n);
        int p = primer_anho(s);
        System.out.println("El año" +n+" pertenece al siglo "+s);
        System.out.println("El primer año del siglo "+s+" es: "+p);
        sc.close();
    }
}
