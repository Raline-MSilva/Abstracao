package br.com.zup.Fatura;

public class Main {
    public static void main(String[] args) {
        boolean continuarMenu = true;

        while (continuarMenu) {
            try {
                continuarMenu = Sistema.Executar();

            } catch (Exception deuErro) {
                System.out.println(deuErro.getMessage());
            }
        }
    }
}
