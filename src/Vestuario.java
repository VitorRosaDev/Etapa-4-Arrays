public class Vestuario extends Loja {

    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int tamanhoEstoqu) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoqu);
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int tamanhoEstoqu, boolean produtosImportados){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, tamanhoEstoqu);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados(){
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }

    public String toString() {
        super.toString();
        return "\nProdutos Importados: " + produtosImportados ;
      }
    
}
