public class Loja{

  private String nome;
  private int quantidadeFuncionarios;
  private double salarioBaseFuncionario;
  private Endereco endereco;
  private Data dataFundacao;
  private Produto[] estoqueProdutos;
  
  public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanhoEstoque){
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.salarioBaseFuncionario = salarioBaseFuncionario;
    this.estoqueProdutos = new Produto[tamanhoEstoque];

  }
  
  public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int tamanhoEstoque) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.salarioBaseFuncionario = -1;
    this.estoqueProdutos = new Produto[tamanhoEstoque];
  }
    
  public String getNome(){
      return nome;
  }
    
  public void setNome(String nome){
    this.nome = nome;
  }
  
  public int getQuantidadeFuncionarios(){
    return quantidadeFuncionarios;
  }
    
  public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
    this.quantidadeFuncionarios = quantidadeFuncionarios;
  }

  public Endereco getEndereco(){
    return endereco;
  }
    
  public void setEndereco(Endereco endereco){
    this.endereco = endereco;
  }

  public Data getDataFundacao(){
    return dataFundacao;
  }
    
  public void setDataFundacao(Data dataFundacao){
    this.dataFundacao = dataFundacao;
  }
    
  public double getSalarioBaseFuncionario(){
    return salarioBaseFuncionario;
  }
    
  public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
    this.salarioBaseFuncionario = salarioBaseFuncionario;
  }
  
  public Produto[] getEstoqueProdutos() {
    return estoqueProdutos;
  }

  public void setEstoqueProdutos(Produto[] estoqueProdutos) {
    this.estoqueProdutos = estoqueProdutos;
  }

  public String toString() {
    return "Nome da Loja: " + nome + 
    "\nQuantidade de Funcionários: " + quantidadeFuncionarios + 
    "\nSalário Base de Funcionário: R$" + salarioBaseFuncionario +
    "\nEndereço: " + endereco +
    "\nData de Fundação: " + dataFundacao +
    "\nTamanho do Estoque: " + this.estoqueProdutos.length + "Produtos";
  }

  public double gastosComSalario() {
    if (salarioBaseFuncionario == -1) {
      return -1;
    } else {
      return quantidadeFuncionarios * salarioBaseFuncionario;
    }
  }

  public char tamanhoDaLoja() {
    if (quantidadeFuncionarios < 10) {
      return 'P';
    } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
      return 'M';
    } else {
      return 'G';
    }
  }

  
  public void imprimeProdutos() {
    for(int i = 0; i < this.estoqueProdutos.length; i++) {
      System.out.println("Produto " + i +  ":" + this.estoqueProdutos[i]);
    }
  }

  public boolean insereProduto(Produto produto) {
    for(int i = 0; i < this.estoqueProdutos.length; i++) {
      if (this.estoqueProdutos[i] == null) {
        this.estoqueProdutos[i] = produto;
        return true;
      }
    }
    return false;
  }

  public boolean removeProduto(String nomeProduto) {
    for (int i = 0; i < this.estoqueProdutos.length; i++) {
      if (this.estoqueProdutos[i] != null && this.estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)) {
        this.estoqueProdutos[i] = null;
        return true;
      }
    }
    return false;
  }
}