import java.util.Random;
public class Conta {

    private double saldo;
    private float agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta() {
        setTotal(getTotal() + 1);
        System.out.println("essa eh a " + getTotal() + "a conta");
        Random agencia = new Random();
        float valorAgencia = agencia.nextFloat() * 10000;
        this.agencia = valorAgencia;
        Random numero = new Random();
        float valorNumero = numero.nextFloat() * 10000;
        this.agencia = valorNumero;
        System.out.println("agencia:" + valorAgencia + " e numero:" + valorNumero);
    }

    public void deposita (double valor) {
        this.saldo = saldo + valor;
    }

    public boolean saca (double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere (double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getAgencia() {
        return agencia;
    }

    public void setAgencia(float agencia) {
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    public static void setTotal(int total) {
        Conta.total = total;
    }
}
