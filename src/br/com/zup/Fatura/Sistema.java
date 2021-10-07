package br.com.zup.Fatura;

import java.util.Scanner;

public class Sistema {
    //recebe dados do usuario
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu(){
        System.out.println("Seja bem vindo a empresa ficticia Universal");
        System.out.println("Digite 1 - para cadastrar um consumidor. ");
        System.out.println("Digite 2 - para cadastrar uma fatura. ");
        System.out.println("Digite 3 - consultar faturas de um consumidor");
        System.out.println("Digite 4 - para sair. ");
    }
}
