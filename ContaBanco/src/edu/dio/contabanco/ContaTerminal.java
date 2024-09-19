package edu.dio.contabanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nome;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o NÚMERO DA CONTA!");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da AGÊNCIA!");
        agencia = scanner.next();
        System.out.println("Por favor, digite seu NOME!");
        nome = scanner.next();
        System.out.println("Por favor, digite o SALDO!");
        saldo = scanner.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, "+
        "sua agência é "+agencia+", conta "+numero+" e seu saldo R$"+saldo+" já está disponível para saque");
    }
}
