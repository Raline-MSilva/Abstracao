package br.com.zup;

public interface ModeloSistema {
    public  abstract void cadastrarImovel(Imovel novoImovel);
    public  abstract void cadastrarMorador(Morador novoMorador);
    public  abstract void removerMorador(Morador moradorRemovido);
    public  abstract void cadastrarFuncionario(Funcionário funcionárioResponsavel);
    public  abstract void mostrarImovel ();
}
