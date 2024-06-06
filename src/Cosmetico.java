
public class Cosmetico extends Loja {

    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao, int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }

    public Cosmetico(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, double taxaComercializacao, int tamanhoEstoque){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, tamanhoEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao(){
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    }

    public String toString() {
        super.toString();
        return "\nTaxa de Comercialização: " + taxaComercializacao ;
      }
    
}
