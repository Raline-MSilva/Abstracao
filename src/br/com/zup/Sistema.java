package br.com.zup;

import java.util.Scanner;

public class Sistema{
    private static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner (System.in);
    }

    public static void menu(){
        System.out.println("BEM VINDE A IMOBILIARIA MORADA PARA LUZ");
        System.out.println("Digite 1 - Para cadastrar um imóvel. ");
        System.out.println("Digite 2 - Para exibir os imóveis");
    }

    public  static Imovel cadastrarImovel(Imovel novoImovel){
        String endereco = capturarDados("Digite o endereço do imóvel: ").nextLine();
        double valorDoAluguel =  capturarDados("Informe o valor do Aluguel R$: ").nextDouble();

        Imovel imovel = new Imovel(endereco, valorDoAluguel);
        return imovel;
    }


}
