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
    public static void menu (){
        System.out.println("Bem vindo ao sistema de Faturas Você em Divída!");
        System.out.println("Digite 1 para cadastrar um consumidor");
        System.out.println("Digite 2 para cadastrar uma fatura");
        System.out.println("Digite 3 para sair do sistema");
    }

    //percorrer lista para mostrar o tipo de consumidor
    public static void menuTipoConsumidor (){
        List<TipoConsumidor> consumidores = ServiçoConsumidor.mostrarTipos();
        System.out.println("Tipos disponivéis: ");

        for (TipoConsumidor consumidorReferencia: consumidores){
            System.out.println(consumidorReferencia);
        }
    }

    //recebendo informações do consumidor
    public static Consumidor cadastrarConsumidor () throws Exception{
        String nome = capturarDados("Informe o nome do consumidor").nextLine();
        String email = capturarDados("Informe o email do consumidor").nextLine();
        //chamo o metodo pra mostrar os tipos
        menuTipoConsumidor();
        //depois que apresentar o menu pego a opção escolhida
        String tipoConsumidor = capturarDados("Informe seu tipo").nextLine();
        return ServiçoConsumidor.cadastrarConsumidor(nome, email,tipoConsumidor);

    }
    //cadastrar fatura

    public static Fatura cadastrarFatura() throws Exception {
        String email = capturarDados("Informe o email do consumidor: ").nextLine();
        double valorDaFatura = capturarDados("Informe o valor da fatura: ").nextDouble();
        String dataDeVencimento = capturarDados("Informe a data de vencimento: ").nextLine();

        Fatura fatura = ServiçoFatura.cadastrarFatura(email,valorDaFatura,dataDeVencimento);

        return fatura;
    }
}
