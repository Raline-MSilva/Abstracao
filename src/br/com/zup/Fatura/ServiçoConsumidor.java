package br.com.zup.Fatura;

import java.util.ArrayList;
import java.util.List;

public class ServiçoConsumidor {
    private static List<Consumidor> consumidores = new ArrayList<>();

    public static List<TipoConsumidor> mostrarTipos() {
        List<TipoConsumidor> consumidores = new ArrayList<>();

        //percorrer minha lista
        for (TipoConsumidor tipoReferencia : TipoConsumidor.values()) {
            consumidores.add(tipoReferencia);
        }
        return consumidores;
    }

    public static TipoConsumidor autenticarTipo(String consumidor) throws Exception {
        for (TipoConsumidor consumidorReferencia : TipoConsumidor.values()) {
            if (consumidor.equalsIgnoreCase(String.valueOf(consumidorReferencia))) {
                return consumidorReferencia;
            }
        }
        throw new Exception("Tipo não encontrado");
    }


    public static Consumidor cadastrarConsumidor(String nome, String email, String tipoConsumidor) throws Exception {
        //autenticar tipo pego do meu parâmetro
        TipoConsumidor consumidor = autenticarTipo(tipoConsumidor);

        Consumidor consumidor1 = new Consumidor(nome, email, consumidor);
        consumidores.add(consumidor1);
        return consumidor1;
    }

    //percorrer a lista e exibir
    public static void listarConsumidores() {
        System.out.println("Quantidade de consumidores: " + consumidores.size());
        for (Consumidor consumidor : consumidores) {
            System.out.println(consumidor);
        }
    }
}
