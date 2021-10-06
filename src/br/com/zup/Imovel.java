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

    public Imovel(String endereçoImovel, double valorAluguel, Funcionário funcionárioResponsavel) {
        this.endereçoImovel = endereçoImovel;
        this.valorAluguel = valorAluguel;
        this.funcionárioResponsavel = funcionárioResponsavel;
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
    /*public void excluirMorador(String endereçoImovel) {
        Morador moradorSerDeletado = null;

        for (Morador referencia: moradores) {
            if (referencia.getCpf().equals(endereçoImovel)){
                moradorSerDeletado = referencia;
                System.out.println("Morador encontrado e deletado!");
            }
        }
        moradores.remove(moradorSerDeletado);
         */

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nEndereço do Imóvel: " + endereçoImovel);
        retorno.append("\nValor do Aluguel R$: " + valorAluguel);
        retorno.append("\n---------------------------------------------");
        retorno.append("\nFuncionário Responsável: " + funcionárioResponsavel);
        retorno.append("\n------------------------------------------------------");
        retorno.append("\nQuantidade de moradores: " + moradores.size());
        retorno.append("\nmoradores" + moradores);
        return retorno.toString();
    }
}
