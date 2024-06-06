import java.util.Arrays;

public class Shopping {

    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString() {
        return "Nome do Shopping: " + nome +
        "\nEndereco do Shopping: " + endereco +
        ", lojas=" + Arrays.toString(lojas);
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
          if (lojas[i] == null) {
            lojas[i] = loja;
            return true;
          }
        }
        
        return false; // Não há espaço disponível para lojas
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
          if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
            lojas[i] = null;
            return true;
          }
        }
    
        return false; // Produto não encontrado no estoque
    }

    public int quantidadeLojasPorTipo(String tipo) {
        int quantidade = 0;

        // Verifica o tipo e conta quantas lojas desse tipo existem
        for (Loja loja : lojas) {
            if (loja != null && loja instanceof Cosmetico && tipo.equals("Cosmético")) {
                quantidade++;
            } else if (loja != null && loja instanceof Vestuario && tipo.equals("Vestuário")) {
                quantidade++;
            } else if (loja != null && loja instanceof Bijuteria && tipo.equals("Bijuteria")) {
                quantidade++;
            } else if (loja != null && loja instanceof Alimentacao && tipo.equals("Alimentação")) {
                quantidade++;
            } else if (loja != null && loja instanceof Informatica && tipo.equals("Informática")) {
                quantidade++;
            }
        }

        if (quantidade == 0) {
            // Retorna -1 se não houver lojas do tipo especificado
            return -1;
        } else {
            return quantidade;
        }
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double valorMaisAlto = 0.0;

        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                if (informatica.getSeguroEletronicos() > valorMaisAlto) {
                    valorMaisAlto = informatica.getSeguroEletronicos();
                    lojaMaisCara = informatica;
                }
            }
        }

        return lojaMaisCara;
    }

}
