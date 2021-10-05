package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("BEM VINDE A IMOBILIARIA MORADA PARA LUZ");
        System.out.println("Digite 1 - Para cadastrar um imóvel. ");
        System.out.println("Digite 2 - Para exibir os imóveis");
        System.out.println("Digite 3 - Para sair da Imobiliaria");
    }


    public static Morador cadastrarMoradores() {
        String nome = capturarDados("Digite o nome do morador: ").nextLine();
        String cpf = capturarDados("Digite o cpf do morador: ").nextLine();
        double renda = capturarDados("Digite o salario do morador: ").nextDouble();

        Morador morador1 = new Morador(nome, cpf, renda);
        return morador1;
    }

    public static Funcionário cadastrarFuncionario() {
        String nome = capturarDados("Digite o nome do Funcionário: ").nextLine();
        String cpf = capturarDados("Informe o CPF do funcionario: ").nextLine();
        String ctps = capturarDados("Informe a CTPS: ").nextLine();

        Funcionário funcionário1 = new Funcionário(nome, cpf, ctps);
        return funcionário1;
    }

    public static List listaDeMoradores() {
        List<Morador> moradores = new ArrayList<>();
        System.out.println("------------------------");
        moradores.add(cadastrarMoradores());
        return moradores;
    }
    public static List listaDeImoveis(){
        List <Imovel> imovels = new ArrayList<>();
        System.out.println("--------------------------");
        imovels.add(cadastrarImovel());
        return imovels;
    }


    public static Imovel cadastrarImovel() {
        String endereco = capturarDados("Digite o endereço do imóvel: ").nextLine();
        double valorDoAluguel = capturarDados("Informe o valor do Aluguel R$: ").nextDouble();

        Imovel imovel1 = new Imovel(endereco, valorDoAluguel, cadastrarFuncionario(), listaDeMoradores());
        return imovel1;
    }

    public static void Executar() {
        boolean menu = true;
        Imobiliaria imobiliaria = new Imobiliaria(listaDeImoveis());

        while (menu) {
            menu();

            int opcaoDesejada = capturarDados("Digite a opção que Deseja: ").nextInt();

            if (opcaoDesejada == 1) {
                imobiliaria.addImovel(cadastrarImovel());
            } else if (opcaoDesejada == 2) {
                System.out.println(imobiliaria);
            } else if (opcaoDesejada == 3) {
                menu = false;
                System.out.println("Cê saiu da imobiliaria");
            }
        }

    }

}
