import java.util.Scanner;

/**
 * Contador
 */
public class Contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int numero1;
        int numero2;
        System.out.println("**************************");
        System.out.println("BEM VINDO AO SEU CONTADOR!");
        System.out.println("**************************");

        System.out.println("DIGITE SEU PRIMEIRO NUMERO:");
        numero1 = sc.nextInt();
        System.out.println("DIGITE SEU SEGUNDO NUMERO:");
        numero2 = sc.nextInt();

        System.out.println("--- AGUARDE UM MOMENTO ---");
        System.out.println("--- ESTAMOS FAZENDO A CONTAGEM ---");

        try (contar numero1 +numero2) {
        catch ParametrosInvalidosException{
            System.out.println("ERRO NA CONTAGEM, TENTE NOVAMENTE!");
        }
    }











    }
}