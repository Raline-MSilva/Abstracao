package br.com.zup.Fatura;

public class Main {
    public static void main(String[] args) {
        try {

            Sistema.cadastrarConsumidor();
            Sistema.cadastrarFatura();
            //ServiçoConsumidor.listarConsumidores();

        }catch (Exception deuErro){
            System.out.println(deuErro.getMessage());
        }
    }
}
