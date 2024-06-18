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

    public String toString() {
        return "Nome do Shopping: " + nome +
                "\nEndereco do Shopping: " + endereco +
                "\nQuantidade de Lojas: " + this.lojas.length + "lojas.";
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (this.lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }

        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }

        return false;
    }

    public int quantidadeLojasPorTipo(String tipo) {
        int quantidade = 0;

        for (int i = 0; i < lojas.length; i++) {
            Loja loja = lojas[i];
            if (loja != null) {
                if (loja instanceof Cosmetico && tipo.equalsIgnoreCase("Cosmético")) {
                    quantidade++;
                } else if (loja instanceof Vestuario && tipo.equalsIgnoreCase("Vestuário")) {
                    quantidade++;
                } else if (loja instanceof Bijuteria && tipo.equalsIgnoreCase("Bijuteria")) {
                    quantidade++;
                } else if (loja instanceof Alimentacao && tipo.equalsIgnoreCase("Alimentação")) {
                    quantidade++;
                } else if (loja instanceof Informatica && tipo.equalsIgnoreCase("Informática")) {
                    quantidade++;
                }
            }
        }

        if (quantidade == 0) {
            return -1;
        } else {
            return quantidade;
        }
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double valorMaisAlto = 0.0;

        for (int i = 0; i < lojas.length; i++) {
            Loja loja = lojas[i];

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
