package banco;

import java.util.Random;

public class Conta {

    private Double saldo = 0.0;
    private Integer agencia;
    private Integer conta;
    private Cliente titular;

    public void abrirConta(Cliente titular){

        Random aleatorio = new Random();

        Integer nrAgencia = aleatorio.nextInt(9999);
        this.agencia = nrAgencia;

        Integer nrConta = aleatorio.nextInt(999999);
        this.conta = nrConta;

        this.titular = titular;

        System.out.println("Parabens " + titular.getNome() + ", sua conta foi aberta com sucesso!\n");
        System.out.println("Sua agencia e conta sao " + nrAgencia + " e " + nrConta + "\n");
    }

    public Conta(Cliente titular){
        abrirConta(titular);
    }

    public void consultaConta(){
        System.out.println("Agencia: " + agencia);
        System.out.println("ContaCC: " + conta);
        System.out.println("Dono CC: " + titular.getNome());
        System.out.println("Extrato: " + saldo);
        System.out.println("\n");
    }

    public void depositar (Double valor) {
        this.saldo = saldo + valor;
    }

    public void sacar (Double valor) {

        if (saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Voce nao possui saldo suficiente");
        }
    }

    public void transfere (Double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
        } else {
            System.out.println("Voce nao possui saldo suficiente");
        }
    }
}