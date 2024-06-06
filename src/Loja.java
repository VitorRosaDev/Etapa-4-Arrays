
public class Loja {

  private String nome;
  private int quantidadeFuncionarios;
  private double salarioBaseFuncionario;
  private Endereco endereco;
  private Data dataFundacao;
  private Produto[] estoqueProdutos;
  
  public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanhoEstoque) {
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
    
  public String getNome() {
    return nome;
  }
    
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public int getQuantidadeFuncionarios() {
    return quantidadeFuncionarios;
  }
    
  public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
    this.quantidadeFuncionarios = quantidadeFuncionarios;
  }

  public Endereco getEndereco() {
    return endereco;
  }
    
  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public Data getDataFundacao() {
    return dataFundacao;
  }
    
  public void setDataFundacao(Data dataFundacao) {
    this.dataFundacao = dataFundacao;
  }
    
  public double getSalarioBaseFuncionario() {
    return salarioBaseFuncionario;
  }
    
  public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
    this.salarioBaseFuncionario = salarioBaseFuncionario;
  }

  public Produto[] getEstoqueProdutos() {
    return estoqueProdutos;
  }
  
  public String toString() {
  
    StringBuilder estoque = new StringBuilder();
    
    estoque.append("Produtos em Estoque:\n");
      
    for (Produto produto : estoqueProdutos) {
      if (produto != null) {
        estoque.append(produto).append("\n");
      }
    }
        
    return "Nome da Loja: " + nome + 
    "\nQuantidade de Funcionários: " + quantidadeFuncionarios + 
    "\nSalário Base de Funcionário: R$" + salarioBaseFuncionario +
    "\nEndereço: " + endereco +
    "\nData de Fundação: " + dataFundacao ;
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
    System.out.println("Produtos em Estoque:");    
    for (Produto produto : estoqueProdutos) {
      if (produto != null) {
        System.out.println(produto);
      }
    }
  }

  public boolean insereProduto(Produto produto) {
    for (int i = 0; i < estoqueProdutos.length; i++) {
      if (estoqueProdutos[i] == null) {
        estoqueProdutos[i] = produto;
        return true;
      }
    }
    
    return false; // Não há espaço disponível no estoque
  }

  public boolean removeProduto(String nomeProduto) {
    for (int i = 0; i < estoqueProdutos.length; i++) {
      if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
        estoqueProdutos[i] = null;
        return true;
      }
    }

    return false; // Produto não encontrado no estoque
  }
      
}