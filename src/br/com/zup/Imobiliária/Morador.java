package br.com.zup.Imobiliária;

public class Morador extends Pessoa {
    private String email;
    private double renda;

    public Morador() {
    }

    public Morador(String nome, String cpf) {
        super(nome, cpf);
    }

    public Morador(String nome, String cpf, String email, double renda) {
        super(nome, cpf);
        this.email = email;
        this.renda = renda;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(super.toString());
        retorno.append("\nRenda: " + renda);
        return retorno.toString();
    }
}
