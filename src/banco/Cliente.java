package banco;

public class Cliente {

    private String nome;
    private Integer cpf;
    private banco.Conta contaBancaria;

    public Cliente(String nome, Integer cpf){

        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public banco.Conta getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(banco.Conta contaBancaria) {
        this.contaBancaria = contaBancaria;
    }


}