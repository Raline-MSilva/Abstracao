package br.com.zup.Fatura;

import java.util.ArrayList;
import java.util.List;

public class ServiçoFatura {
    private static List<Fatura> faturas = new ArrayList<>();

    public static Fatura cadastrarFatura(String email, double valor, String dataDeVencimento) throws Exception{
        //crio um consumidor para consultar o email
        Consumidor consumidor = ServiçoConsumidor.encontrarConsumidorPeloEmail(email);
        Fatura fatura = new Fatura(consumidor, valor, dataDeVencimento);
        faturas.add(fatura);
        return fatura;
    }
}
