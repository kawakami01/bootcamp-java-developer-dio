import java.util.Scanner;

public class Contador {
    public static void main (String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int primeiroParametro = scanner.nextInt();
        System.out.println("Dgite o segundo parâmetro: ");
        int segundoParametro = scanner.nextInt();

        try{
            contar(primeiroParametro, segundoParametro);
        } catch(ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        scanner.close();
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro > segundoParametro){
            throw new ParametrosInvalidosException();
        }

        for (int i=1; i<segundoParametro-primeiroParametro+1; i++ ){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
