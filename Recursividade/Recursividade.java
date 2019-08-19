import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Recursividade
 */
public class Recursividade {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();        
        
        sb.append("Escolha uma operação:\n");
        sb.append("1 - Potência\n");
        sb.append("2 - Fatorial\n");
        sb.append("3 - Fibonacci\n");
        sb.append("4 - Maior elemento em um Array\n");
        sb.append("0 - Sair\n");
        sb.append("-----------------------------------");

        int opcao;

        do {
            System.out.println(sb);
            opcao = sc.nextInt();    
            
            switch (opcao) {
                
                // Exercício 1 
                case 1:                    
                    System.out.println("Digite uma Base e um Expoente: ");
                    System.out.println("Potência: " + potencia(sc.nextInt(), sc.nextInt()));
                    break;
            
                // Exercício 2
                case 2:                    
                    System.out.println("Digite o fatorial: ");
                    System.out.println("Fatorial: " + fatorial(sc.nextInt()));
                
                case 3:
                    System.out.println("Digite o nº termo: ");
                    System.out.println("Fibonacci: " + fibonacci(sc.nextInt()));

                case 4:
                    System.out.println("Digite o tamanho do Array: ");
                    System.out.println("Maior elemento: " + maiorElemento(sc.nextInt()));

                // Sair
                case 0:                
                    System.out.println("Saindo...");

                default:
                    break;                
            }
        } while (opcao != 0);        
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

    static int anterior = 0;
    static int atual = 0;
    static int soma = 0;

    // Exercício 3
    public static String fibonacci(int n){
        
        if(n == 0){
            return "";
        }               
        
        if (atual == 0) {
            atual = 1;
            return "0, 1, " + fibonacci(--n);
        }
        
        soma = anterior + atual;                
        anterior = atual;        
        atual = soma;

        return soma + ", " + fibonacci(n - 1); 
    }
    
    // Exercício 4
    public static int maiorElemento(int tamanho){        

        int[] arr = new int[tamanho];

       if(arr[arr.length] == "" ){
            for (int i = 0; i < tamanho; i++) {
                arr[i] = sc.nextInt();
            }
       }

    }
}