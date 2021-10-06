package br.com.zup;

public class Morador extends Pessoa{
    private double renda;

    public Morador() {

    }

    public Morador(String nome, String cpf) {
        super(nome, cpf);
    }

    public Morador(String nome, String cpf, double renda) {
        super(nome, cpf);
        this.renda = renda;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(super.toString());
        retorno.append("\nRenda: " + renda);
        return retorno.toString();
    }
}
