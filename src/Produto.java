public class Produto {
    
  private String nome;
  private double preco;
  private Data dataValidade;

  public Produto(String nome, double preco, Data dataValidade){
    this.nome = nome;
    this.preco = preco;
    this.dataValidade = dataValidade;
  }

  public String getNome(){
    return nome;
  }
      
  public void setNome(String nomeProduto){
    this.nome = nomeProduto;
  }

  public double getPreco(){
    return preco;
  }
      
  public void setPreco(double preco){
    this.preco = preco;
  }

  public Data getDataValidade(){
    return dataValidade;
  }
    
  public void setDataValidade(Data dataValidade){
    this.dataValidade = dataValidade;
  }

  public String toString() {
    return "Nome do produto: " + nome +
    "\nPreço do produto: " + preco +
    "\nData de validade: " + dataValidade ;
  }

  public boolean estaVencido(Data dataAtual){
    int diaValidade = dataValidade.getDia();
    int mesValidade = dataValidade.getMes();
    int anoValidade = dataValidade.getAno();

    int diaAtual = dataAtual.getDia();
    int mesAtual = dataAtual.getMes();
    int anoAtual = dataAtual.getAno();

    if (anoValidade < anoAtual || (anoValidade == anoAtual && mesValidade < mesAtual)
      || (anoValidade == anoAtual && mesValidade == mesAtual && diaValidade < diaAtual)) {
       
      return true;
    } else {
      return false;
    }

  }
}