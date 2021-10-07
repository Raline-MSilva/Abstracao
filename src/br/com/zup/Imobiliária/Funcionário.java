package br.com.zup.Imobiliária;

public class Funcionário extends Pessoa {
    private String ctps;

    public Funcionário() {

    }

    public Funcionário(String nome, String cpf) {
        super(nome, cpf);
    }

    public Funcionário(String nome, String cpf, String ctps) {
        super(nome, cpf);
        this.ctps = ctps;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }
    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(super.toString());
        retorno.append("\nCTPS: " + ctps);
        return retorno.toString();
    }
}
