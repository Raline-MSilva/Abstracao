package br.com.zup.Fatura;

public class Consumidor {
    private String nome;
    private String email;
    private TipoConsumidor consumidor;

    public Consumidor() {

    }

    public Consumidor(String nome, String email, TipoConsumidor consumidor) {
        this.nome = nome;
        this.email = email;
        this.consumidor = consumidor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoConsumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(TipoConsumidor consumidor) {
        this.consumidor = consumidor;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Nome: " + nome);
        retorno.append("\n Email: " + email);
        retorno.append("\n Tipo do Consumidor: " + consumidor);
        return retorno.toString();
    }
}
