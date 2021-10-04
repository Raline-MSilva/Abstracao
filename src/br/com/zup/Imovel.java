package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private String endereçoImovel;
    private double valorAluguel;
    private Funcionário funcionárioResponsavel;
    List<Morador> moradores = new ArrayList<>();

    public Imovel() {

    }

    public Imovel(String endereçoImovel, double valorAluguel, Funcionário funcionárioResponsavel, List<Morador> moradores) {
        this.endereçoImovel = endereçoImovel;
        this.valorAluguel = valorAluguel;
        this.funcionárioResponsavel = funcionárioResponsavel;
        this.moradores = moradores;
    }

    public String getEndereçoImovel() {
        return endereçoImovel;
    }

    public void setEndereçoImovel(String endereçoImovel) {
        this.endereçoImovel = endereçoImovel;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public Funcionário getFuncionárioResponsavel() {
        return funcionárioResponsavel;
    }

    public List<Morador> getMoradores() {
        return moradores;
    }

    public void addMorador(Morador novoMorador) {
        moradores.add(novoMorador);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\tEndereço do Imóvel: " + endereçoImovel);
        retorno.append("\tValor do Aluguel: " + valorAluguel);
        retorno.append("\tFuncionário Responsável: " + funcionárioResponsavel);
        retorno.append("\tmoradores=" + moradores);
        return retorno.toString();
    }
}
