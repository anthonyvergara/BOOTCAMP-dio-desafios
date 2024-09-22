import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Insira o segundo número: ");
        int numero2 = scanner.nextInt();

        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            e.errorMsg();
        }
    }

    public static void contar(int numero1, int numero2) throws ParametrosInvalidosException{
        if(numero1 > numero2)
            throw new ParametrosInvalidosException();

        int numeroInteracoes = numero2 - numero1;

        for(int i = 1; i<=numeroInteracoes; i++){
            System.out.println("Imprimindo o numero: "+i);
        }
    }
}
