package br.com.zup.Fatura;

import java.util.ArrayList;
import java.util.List;

public class ServiçoConsumidor {
    private static List<Consumidor> consumidores = new ArrayList<>();

    public static List<TipoConsumidor> mostrarTipos () {
        List<TipoConsumidor> consumidores = new ArrayList<>();

        //percorrer minha lista
        for (TipoConsumidor tipoReferencia: TipoConsumidor.values()){
            consumidores.add(tipoReferencia);
        }
        return consumidores;
    }
}
