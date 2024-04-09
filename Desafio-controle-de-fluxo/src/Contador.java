import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
        System.out.println("Insira o primeiro número" );
        int parametro1 = scanner.nextInt();

        System.out.println("Insira o segundo número" );
        int parametro2 = scanner.nextInt();
        
        try {
            contar(parametro1, parametro2);
            
            System.out.println("Digite o primeiro número: " + parametro1);
            int numero = scanner.nextInt();

            System.out.println("Digite o segundo número: " + parametro2);
            int numero2 = scanner.nextInt();
            
        } catch(ParametrosInvalidoExceptions e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidoExceptions {
        if (parametro1 >= parametro2) {
            throw new ParametrosInvalidoExceptions("O segundo número tem que ser maior que o primeiro número");
        }

        int contagem = parametro2 - parametro1;
        for(int contar = 0; contagem < contagem ; ){
            System.out.println("A contagem é " + contagem);


        }
        System.out.println(contagem);
    }
}

class ParametrosInvalidoExceptions extends Exception {
    public ParametrosInvalidoExceptions(String mensagem) {
        super(mensagem);
    }
}