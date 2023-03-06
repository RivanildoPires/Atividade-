package br.com.contabancaria.poo.Model;

public class ContaBancaria {
    public String nomeInstituiçao;
    public String nomeTitular;
    public int numeroAgencia;
    public int numeroDaConta;
    public long numeroDeCpf;
    public double valorEmConta = 1000;

    public ContaBancaria(String nomeInstitucaoFinaceira,String nomeTitular, int numeroAgencia, int numeroDaConta, long numeroDeCpf ){
        this.nomeInstituiçao = nomeInstitucaoFinaceira;
        this.nomeTitular = nomeTitular;
        this.numeroAgencia = numeroAgencia;
        this.numeroDaConta = numeroDaConta;
        this.numeroDeCpf = numeroDeCpf;


    }
    public void depositar(double valor){this.valorEmConta += valor;}
    public void retirar(double valor){this.valorEmConta -= valor;}}




