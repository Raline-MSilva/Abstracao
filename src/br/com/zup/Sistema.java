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


    public static Morador cadastrarMoradores(){
        String nome = capturarDados("Digite seu nome: ").nextLine();
        String cpf = capturarDados("Digite seu cpf: ").nextLine();
        String telefone = capturarDados("Digite o seu telefone: ").nextLine();
        double renda = capturarDados("Digite o salario: ").nextDouble();

        Morador morador1 = new Morador(nome, cpf, telefone, renda);
        return morador1;
    }
    public static Funcionário cadastrarFuncionario(){
        String nome = capturarDados("Digite o nome do Funcionário: ").nextLine();
        String cpf = capturarDados("Informe o CPF: ").nextLine();
        String telefone = capturarDados("Informe o telefone do funcionário: ").nextLine();
        String ctps = capturarDados("Informe a CTPS: ").nextLine();

        Funcionário funcionário1 = new Funcionário(nome, cpf, telefone,ctps);
        return funcionário1;
    }
    public  static Imovel cadastrarImovel(){
        String endereco = capturarDados("Digite o endereço do imóvel: ").nextLine();
        double valorDoAluguel =  capturarDados("Informe o valor do Aluguel R$: ").nextDouble();

        Imovel imovel = new Imovel(endereco, valorDoAluguel,  cadastrarFuncionario());
        return imovel;
    }
    public static void Executar(){
        boolean menu = true;
        Imobiliaria imobiliaria = new Imobiliaria();

        while (menu){
            menu();

            int opcaoDesejada = capturarDados("Digite a opção que Deseja: ").nextInt();

            if (opcaoDesejada == 1){
               imobiliaria.addImovel(cadastrarImovel());
            } else if (opcaoDesejada == 2){
                menu = false;
                System.out.println("Cê saiu do sistema");
            }
        }

    }

}
