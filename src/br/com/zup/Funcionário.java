package br.com.zup;

public class Funcionário extends Pessoa{
    private String ctps;

    public Funcionário() {

    }

    public Funcionário(String nome, String cpf, String telefone, String ctps) {
        super(nome, cpf, telefone);
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
        retorno.append("\tCTPS: " + ctps);
        return retorno.toString();
    }
}
