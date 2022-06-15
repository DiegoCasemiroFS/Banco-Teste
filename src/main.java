import banco.Conta;
import banco.Cliente;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner leitorDeEntrada = new Scanner(System.in);
        Integer respostaCliente = 1;

        System.out.println("Banco Digital!\n");
        System.out.println("Criando sua conta corrente");

        Cliente novoUsuario1 = new Cliente();
        System.out.println("Digite seu nome");
        novoUsuario1.setNome(leitorDeEntrada.next());
        System.out.println("Digite seu CPF");
        novoUsuario1.setCpf(leitorDeEntrada.nextInt());

        System.out.println("Criando uma nova conta corrente");

        Cliente novoUsuario2 = new Cliente();
        System.out.println("Digite seu nome");
        novoUsuario2.setNome(leitorDeEntrada.next());
        System.out.println("Digite seu CPF");
        novoUsuario2.setCpf(leitorDeEntrada.nextInt());

        Conta novaConta1 = new Conta(novoUsuario1);
        novoUsuario1.setContaBancaria(novaConta1);

        Conta novaConta2 = new Conta(novoUsuario2);
        novoUsuario2.setContaBancaria(novaConta2);

        System.out.println("Seja bem-Vindo!");
        System.out.println("Informe seu CPF");
        Integer cpfRecebido = leitorDeEntrada.nextInt();

        do{
            System.out.println("Selecione a opção:");
            System.out.println("\n\n1- Sacar");
            System.out.println("\n\n2- Depositar");
            System.out.println("\n\n3- Transferir");
            respostaCliente = leitorDeEntrada.nextInt();

            switch (respostaCliente) {
                case 1 -> {
                    System.out.println("Favor informar o valor que deseja sacar");
                    if (cpfRecebido == novoUsuario1.getCpf()) {
                        novaConta1.sacar(leitorDeEntrada.nextDouble());
                    } else if (cpfRecebido == novoUsuario2.getCpf()) {
                        novaConta2.sacar(leitorDeEntrada.nextDouble());
                    }
                }
                case 2 -> {
                    System.out.println("Favor informar o valor que deseja depositar");
                    if (cpfRecebido == novoUsuario1.getCpf()) {
                        novaConta1.depositar(leitorDeEntrada.nextDouble());
                    } else if (cpfRecebido == novoUsuario2.getCpf()) {
                        novaConta2.depositar(leitorDeEntrada.nextDouble());
                    }
                }
                case 3 -> {
                    System.out.println("Favor informar o valor que deseja transferir");
                    if (cpfRecebido == novoUsuario1.getCpf()) {
                        novaConta1.transfere(leitorDeEntrada.nextDouble(), novaConta2);
                    } else if (cpfRecebido == novoUsuario2.getCpf()) {
                        novaConta2.transfere(leitorDeEntrada.nextDouble(), novaConta1);
                    }
                }
            }
            System.out.println("Deseja fazer outra operacao 1 para sim, 2 para nao ?");
            respostaCliente = leitorDeEntrada.nextInt();
        } while (respostaCliente == 1);

        novaConta1.consultaConta();
        novaConta2.consultaConta();
    }


}