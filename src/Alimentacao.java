
public class Alimentacao extends Loja {

    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, Data dataAlvara, int tamanhoEstoque){
        super(nome, quantidadeFuncionarios, endereco, dataAlvara, tamanhoEstoque);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara(){
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }

    public String toString() {
        super.toString();
        return "\nData de Alvará: " + dataAlvara ;
      }
    
}
