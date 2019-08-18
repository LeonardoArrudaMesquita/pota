import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Recursividade
 */
public class Recursividade {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        do {
            
            StringBuilder sb = new StringBuilder();

            sb.append("Escolha uma operação: ");
            sb.append("1 - Potência");
            sb.append("2 - Fatorial");

        } while (opcao != 0);

        // Exercício 1 
        // System.out.println("Digite uma Base e um Expoente: ");
        // System.out.println("Potência: " + potencia(sc.nextInt(), sc.nextInt()));

        // Exercício 2
        System.out.println("Digite uma número para o fatorial: ");
        System.out.println("Fatorial: " + fatorial(sc.nextInt()));
    }

    // Exercício 1
    public static double potencia(int base, int expoente)
    {        
        if (expoente == 0) 
        {
            return 1;
        }
        else if (expoente < 0) 
        {
            return 1 / base * potencia(base, -(-expoente - 1));
        }
        else
        {
            return base * potencia(base, expoente - 1);            
        }        
    }

    // Exercício 2
    public static int fatorial(int n)
    {
        if (n == 1) {
            return 1;
        }

        return n * fatorial(n - 1);
    }    
}