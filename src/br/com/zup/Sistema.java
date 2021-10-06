package br.com.zup;


import java.util.Scanner;

public class Sistema {
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //percorrer lista de imoveis e moradores. Usando dois for each
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
        System.out.println("Digite 3 - Para remover um morador pelo CPF");
        System.out.println("Digite 4 - Para sair da Imobiliária");
    }

    //aqui recebemos só um morador
    public static Morador receberMoradores() {
        String nome = capturarDados("Digite o nome do morador: ").nextLine();
        String cpf = capturarDados("Digite o cpf do morador: ").nextLine();
        String email = capturarDados("Digite o email do morador.").nextLine();
        double renda = capturarDados("Digite o salario do morador: ").nextDouble();

        Morador morador1 = new Morador(nome, cpf, email, renda);
        return morador1;
        //Colhendo dados para cadastro
    }

    //refatoração// cadastrar mais de um morador.
    public static void cadastrarMoradores(Imobiliaria imobiliaria, Imovel imovel) {
        int qntMoradores = capturarDados("Informe quantos moradores deseja adicionar:").nextInt();
        int contadorDeMoradores = 0;

        while (contadorDeMoradores < qntMoradores) {
            //instancio um morador.
            Morador morador = receberMoradores();
            //verifico o cpf dentro da imobiliaria.
            boolean cpfExistente = autenticarCpf(imobiliaria, morador);
            // se houver cpf iguais, não cadastro, se não houver, cadastro.
            if (cpfExistente == true) {
                System.out.println("CPF já existe no sistema!");
            } else {
                imovel.addMorador(morador);
                contadorDeMoradores++;
            }
        }

    }

    //removendo morador
    public static String excluirMoradorPorCpf(Imobiliaria imobiliaria) {
        //pedindo o cpf do morador a ser excluído
        String cpf = capturarDados("Informe o CPF do morador a ser excluído").nextLine();
        // for para percorrer a lista de moradores dentro dos imoveis e verificar o cpf
        for (Imovel listaDeImoveis : imobiliaria.getImovels()) {
            for (Morador listaDeMoradores : listaDeImoveis.getMoradores()) {
                // se o cpf digitado for igual ao já existente no sistema
                if (listaDeMoradores.getCpf().equals(cpf)) {
                    listaDeImoveis.getMoradores().remove(listaDeMoradores);
                    return "Morador removido";
                }
            }
        }
        return "Morador não cadastrado no sistema";
    }

    public static Funcionário cadastrarFuncionario() {
        String nome = capturarDados("Digite o nome do Funcionário: ").nextLine();
        String cpf = capturarDados("Informe o CPF do funcionario: ").nextLine();
        String ctps = capturarDados("Informe a CTPS: ").nextLine();

        Funcionário funcionário1 = new Funcionário(nome, cpf, ctps);
        return funcionário1;
    }

    public static Imovel cadastrarImovel() {
        String endereco = capturarDados("Digite o endereço do imóvel: ").nextLine();
        double valorDoAluguel = capturarDados("Informe o valor do Aluguel R$: ").nextDouble();

        Imovel imovel1 = new Imovel(endereco, valorDoAluguel, cadastrarFuncionario());
        return imovel1;
    }

    public static void Executar() {
        boolean menu = true;
        Imobiliaria imobiliaria = new Imobiliaria();

        while (menu) {
            menu();

            int opcaoDesejada = capturarDados("Digite a opção que Deseja: ").nextInt();
            if (opcaoDesejada == 1) {
                Imovel imovel = cadastrarImovel();
                imobiliaria.addImovel(imovel);
                //cadastrar moradores na imobiliaria e imovel
                cadastrarMoradores(imobiliaria, imovel);
            } else if (opcaoDesejada == 2) {
                System.out.println(imobiliaria);

            } else if (opcaoDesejada == 3) {
                //excluir um morador que ta dentro da imobiliaria
                String remover = excluirMoradorPorCpf(imobiliaria);
                //exibir a remoção
                System.out.println(remover);

            } else if (opcaoDesejada == 4) {
                menu = false;
                System.out.println("Cê saiu da imobiliaria");
            }
        }
    }
}


