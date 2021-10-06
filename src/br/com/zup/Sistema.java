package br.com.zup;


import java.util.Scanner;

public class Sistema {
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //percorrer lista de imoveis e moradores
    private static boolean autenticarCpf(Imobiliaria imobiliaria, Morador morador) {
        String cpf = morador.getCpf();
        for (Imovel listaDeImoveis : imobiliaria.getImovels()) {
            //vou pegar dentro da imobiliaria minha lista de imoveis.
            for (Morador listaDeMoradores : listaDeImoveis.getMoradores()) {
                //pegar meus moradores dentro da lista de imoveis
                if (listaDeMoradores.getCpf().equals(cpf)) {
                    // sendo igual, cpf ja cadastrado.
                    return true;
                }
            }
        }
        return false;
    }

    public static void menu() {
        System.out.println("BEM VINDE A IMOBILIARIA MORADA PARA LUZ");
        System.out.println("Digite 1 - Para cadastrar um imóvel. ");
        System.out.println("Digite 2 - Para exibir os imóveis");
        System.out.println("Digite 3 - Para sair da Imobiliaria");
    }

    public static Morador receberMoradores() {
        String nome = capturarDados("Digite o nome do morador: ").nextLine();
        String cpf = capturarDados("Digite o cpf do morador: ").nextLine();
        double renda = capturarDados("Digite o salario do morador: ").nextDouble();

        Morador morador1 = new Morador(nome, cpf, renda);
        return morador1;
        //Colhendo dados para cadastro
    }
    //refatoração
    public static void cadastrarMoradores(Imobiliaria imobiliaria, Imovel imovel){
        int qntMoradores = capturarDados("Informe quantos moradores deseja adicionar:").nextInt();
        int contadorDeMoradores = 0;

        while (contadorDeMoradores < qntMoradores){
            Morador morador = receberMoradores();
            boolean cpfExistente = autenticarCpf(imobiliaria, morador);

            if (cpfExistente == true){
                System.out.println("CPF já existe no sistema!");
            }else {
                imovel.addMorador(morador);
                contadorDeMoradores ++;
            }
        }

    }


}


