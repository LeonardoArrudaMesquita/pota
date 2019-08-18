import java.util.Scanner;

/**
 * Recursividade
 */
public class Recursividade {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Exercício 1 
        System.out.println("Digite uma Base e um Expoente: ");
        System.out.println(potencial(sc.nextInt(), sc.nextInt()));
    }

    public static int potencial(int base, int expoente){
        return 1;
    }
}