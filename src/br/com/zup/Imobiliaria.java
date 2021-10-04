package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    List<Imovel> imovels = new ArrayList<>();

    public Imobiliaria() {

    }

    public List<Imovel> getImovels() {
        return imovels;
    }

    public void addImovel (Imovel novoImovel){
        imovels.add(novoImovel);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\tImovels: " + imovels);
        return retorno.toString();
    }
}
