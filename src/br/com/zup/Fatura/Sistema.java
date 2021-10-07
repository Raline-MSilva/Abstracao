package br.com.zup.Fatura;

import java.util.Scanner;

public class Sistema {
    //Obter dados do usuário

    private static Scanner capturarDados(String mensagem) {
        Scanner capturarDados = new Scanner(System.in);
        System.out.println(mensagem);
        return capturarDados;
    }
}
