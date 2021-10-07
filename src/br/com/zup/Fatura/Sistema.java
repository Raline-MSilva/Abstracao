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

    //recebendo informações do consumidor
    public static void cadastrarConsumidor (){
        String nome = capturarDados("Informe o nome do consumidor").nextLine();
        String email = capturarDados("Informe o email do consumidor").nextLine();
    }
    //percorrer lista para mostrar o tipo de consumidor
    public static void menuTipoConsumidor (){
        List<TipoConsumidor> consumidores = ServiçoConsumidor.mostrarTipos();
    }
}
