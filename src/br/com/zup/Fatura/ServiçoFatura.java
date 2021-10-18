package br.com.zup.Fatura;

import java.util.ArrayList;
import java.util.List;

public class ServiçoFatura {
    private static List<Fatura> faturas = new ArrayList<>();

    //cadastrar fatura
    public static Fatura cadastrarFatura(String email, double valor, String dataDeVencimento) throws Exception {
        Consumidor consumidor = ServiçoConsumidor.pesquisarConsumidor(email);
        Fatura fatura = new Fatura(consumidor, valor, dataDeVencimento);
        faturas.add(fatura);
        return fatura;
    }

    //pesquisar fatura por email
    public static List<Fatura> pesquisarFaturasPorEmail(String email) throws Exception {
        List<Fatura> faturasConumidores = new ArrayList<>();
        for (Fatura faturaReferencia : faturas) {
            if (faturaReferencia.getConsumidor().getEmail().equals(email)) {
                faturasConumidores.add(faturaReferencia);

            }
        }
        return faturasConumidores;
    }

    public static void exibirFaturas() {
        System.out.println("Quantidade de faturas: " + faturas.size());
        for (Fatura faturaReferencia : faturas) {
            System.out.println(faturaReferencia);
        }
    }
}
