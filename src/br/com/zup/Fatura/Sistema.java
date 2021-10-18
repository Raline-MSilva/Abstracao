package br.com.zup.Fatura;

import java.util.List;
import java.util.Scanner;

public class Sistema {

    //Obter dados do usuário
    private static Scanner capturarDados(String mensagem) {
        Scanner capturarDados = new Scanner(System.in);
        System.out.println(mensagem);
        return capturarDados;
    }

    //criar menu
    public static void menu() {
        System.out.println("Bem vindo ao sistema de Faturas Você em Divída!");
        System.out.println("Digite 1 para cadastrar um consumidor");
        System.out.println("Digite 2 para Exibir a lista de consumidores");
        System.out.println("Digite 3 para Cadastrar uma Fatura");
        System.out.println("Digite 4 para pesquisar as faturas");
        System.out.println("Digite 5 para sair do sistema");
    }

    //percorrer lista para mostrar o tipo de consumidor
    public static void menuTipoConsumidor() {
        List<TipoConsumidor> consumidores = ServiçoConsumidor.mostrarTipos();
        System.out.println("Tipos disponivéis: ");

        for (TipoConsumidor consumidorReferencia : consumidores) {
            System.out.println(consumidorReferencia);
        }
    }

    //recebendo informações do consumidor
    public static Consumidor cadastrarConsumidor() throws Exception {
        String nome = capturarDados("Informe o nome do consumidor").nextLine();
        String email = capturarDados("Informe o email do consumidor").nextLine();
        //depois que apresentar o menu pego a opção escolhida
        menuTipoConsumidor();
        String tipoConsumidor = capturarDados("Informe seu tipo").nextLine();
        //chamo o metodo pra mostrar os tipos
        System.out.println("** Cadastro realizado**");
        ServiçoConsumidor.autenticarEmail(email);
        ServiçoConsumidor.verificarEmailExistente(email);

        return ServiçoConsumidor.cadastrarConsumidor(nome, email, tipoConsumidor);

    }
    //cadastrar faturas
    public static Fatura cadastrarFatura() throws Exception {
        String email = capturarDados("Informe o email do consumidor: ").nextLine();
        double valor = capturarDados("Informe o valor R$: ").nextDouble();
        String dataDeVencimento = capturarDados("Informe a data de vencimento: ").nextLine();
        System.out.println("--Fatura cadastrada--");
        return ServiçoFatura.cadastrarFatura(email,valor,dataDeVencimento);
    }

    public static List<Fatura> pesquisarFaturaPorEmail () throws Exception{
        String email = capturarDados("Digite o email do consumidor que deseja consultar: ").nextLine();
        ServiçoConsumidor.autenticarEmail(email);
        ServiçoFatura.exibirFaturas();
        List<Fatura> faturaPorEmail = ServiçoFatura.pesquisarFaturasPorEmail(email);
        return faturaPorEmail;
    }


    public static boolean Executar() throws Exception {
        boolean menu = true;
        while (menu) {

            menu();
            int opcaoDesejada = capturarDados("Digite a opção do menu que deseja: ").nextInt();

            if (opcaoDesejada == 1) {
                cadastrarConsumidor();
            } else if (opcaoDesejada == 2) {
                ServiçoConsumidor.listarConsumidores();
            } else if (opcaoDesejada == 3) {
                cadastrarFatura();
            } else if (opcaoDesejada == 4){
                pesquisarFaturaPorEmail();
            }
            else if (opcaoDesejada == 5) {
                menu = false;
            } else {
                System.out.println("Digite uma opção que esteja no menu!");
            }
        }
        return menu;

    }
}
