package br.com.zup;

public class Morador extends Pessoa{
    private double renda;

    public Morador() {

    }

    public Morador(String nome, String cpf, String telefone, double renda) {
        super(nome, cpf, telefone);
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
        retorno.append("\tRenda: " + renda);
        return retorno.toString();
    }
}
