package br.com.contabancaria.poo.Main;
import br.com.contabancaria.poo.Model.ContaBancaria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaBancaria contaBancaria1 = new ContaBancaria("Banco do Brasil", "Rivanildo Pires", 1, 3, 91232313213L);
        ContaBancaria contaBancaria2 = new ContaBancaria("Bradesco", "Thaiuam Ygor", 2, 4, 9302139281L);

        ContaBancaria[] contaBancaria = new ContaBancaria[2];

        contaBancaria[0] = contaBancaria1;
        contaBancaria[1] = contaBancaria2;

        Scanner input = new Scanner(System.in);

        int agencia = 0;
        int conta = 0;
        long cpf = 0;
        double transferencia;

        System.out.println("Bem-Vindo");
        System.out.println("Digite o numero de sua agencia: ");
        agencia = input.nextInt();

        System.out.println("Digite numero de sua conta: ");
        conta = input.nextInt();

        System.out.println("Digite seu cpf: ");
        cpf = input.nextLong();

        if (contaBancaria[0].numeroAgencia == agencia) {
            if (contaBancaria[0].numeroDaConta == conta) {
                if (contaBancaria[0].numeroDeCpf == cpf) {
                    System.out.println("Verificado!");
                    System.out.println("Para deposito digite o número: 1");
                    System.out.println("Para retirar digite o número: 2");
                    System.out.print("Qual opção deseja? ");
                    conta = input.nextInt();
                    if (conta == 1) {
                        System.out.println("Digite  o valor que deseja depositar?");
                        transferencia = input.nextDouble();
                        contaBancaria1.depositar(transferencia);
                        contaBancaria2.retirar(transferencia);
                        System.out.printf("Seu valor em conta é %.2f\n", contaBancaria1.valorEmConta);
                        System.out.printf("O valor restante na outra conta é %.2f", contaBancaria2.valorEmConta);
                        System.out.printf("Operação Realizada!");
                    } else if (conta == 2) {
                        System.out.println("Digite o valor retirar?");
                        transferencia = input.nextDouble();
                        contaBancaria2.depositar(transferencia);
                        contaBancaria1.retirar(transferencia);
                        System.out.printf("Seu valor em conta é %.2f\n", contaBancaria2.valorEmConta);
                        System.out.printf("O valor restante na outra conta é %.2f", contaBancaria1.valorEmConta);
                        System.out.printf("Operação Realizada!");}}}}
        else if (contaBancaria[1].numeroAgencia == agencia) {
            if (contaBancaria[1].numeroDaConta == conta) {
                if (contaBancaria[1].numeroDeCpf == cpf) {
                    if (conta == 1) {
                        System.out.println("Digite  o valor?");
                        transferencia = input.nextDouble();
                        contaBancaria2.depositar(transferencia);
                        contaBancaria1.retirar(transferencia);
                        System.out.printf("Seu valor em conta é %.2f\n", contaBancaria2.valorEmConta);
                        System.out.printf("O valor restante na outra conta é %.2f", contaBancaria1.valorEmConta);
                        System.out.printf("Operação Realizada!");

                    } else if (conta == 2) {
                        System.out.println("Digite o valor?");
                        transferencia = input.nextDouble();
                        contaBancaria1.depositar(transferencia);
                        contaBancaria2.retirar(transferencia);
                        System.out.printf("Seu valor em conta é %.2f\n", contaBancaria1.valorEmConta);
                        System.out.printf("O valor restante na outra conta é %.2f", contaBancaria2.valorEmConta);
                        System.out.printf("Operação realizada!");}}}}}}
