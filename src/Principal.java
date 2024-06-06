import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {

            System.out.println("\nBem vindo ao Sistema Gerenciador de Lojas" +
            "\n" +
            "\nEscolha uma opção");

            System.out.println("\n(1) Criar uma loja" +
            "\n(2) Criar um produto" +
            "\n(3) Sair");

            byte opcao = scanner.nextByte();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println("Criando uma loja\n\nDigite o nome da loja: ");
                    String nomeLoja = scanner.nextLine();

                    System.out.println("\nQuantidade de Funcionários: ");
                    int quantidadeFuncionarios = scanner.nextInt();

                    System.out.println("\nSalário base dos Funcionários: ");
                    double salarioBaseFuncionario = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("\nNome da rua: ");
                    String nomeDaRua = scanner.nextLine();
                    System.out.println("\nNúmero: ");
                    String numero = scanner.nextLine();
                    System.out.println("\nCidade: ");
                    String cidade = scanner.nextLine();
                    System.out.println("\nEstado: ");
                    String estado = scanner.nextLine();
                    System.out.println("\nPaís: ");
                    String pais = scanner.nextLine();
                    System.out.println("\nCEP: ");
                    String cep = scanner.nextLine();
                    System.out.println("\nComplemento: ");
                    String complemento = scanner.nextLine();
                    
                    Endereco endereco = new Endereco(nomeDaRua, numero, cidade, estado, pais, cep, complemento);

                    System.out.println("\nData de fundação: \nDia: ");
                    int diaFundacao = scanner.nextInt();
                    System.out.println("\nMês: ");
                    int mesFundacao = scanner.nextInt();
                    System.out.println("\nAno: ");
                    int anoFundacao = scanner.nextInt();
                    scanner.nextLine();
                    
                    Data dataDeFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);

                    Loja novaLoja = new Loja(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao);

                    System.out.println("\nNova loja criada com sucesso!");
                    System.out.println(novaLoja);

                    break;

                case 2:

                    System.out.println("Criando um produto\n\nDigite o nome do produto: ");
                    scanner.nextLine();
                    String nomeProduto = scanner.nextLine();

                    System.out.println("\nDigite o preço do produto:");
                    double preco = scanner.nextDouble();

                    System.out.println("\nData de validade: \nDia: ");
                    int diaValidade = scanner.nextInt();
                    System.out.println("\nMês: ");
                    int mesValidade = scanner.nextInt();
                    System.out.println("\nAno: ");
                    int anoValidade = scanner.nextInt();
                    scanner.nextLine();
                    Data dataDeValidade = new Data(diaValidade, mesValidade, anoValidade);

                    Produto novoProduto = new Produto(nomeProduto, preco, dataDeValidade);

                    System.out.println("\nNovo produto criado com sucesso!");
                    System.out.println(novoProduto);

                    Data dataReferencia = new Data(20, 10, 2023);
                    
                    if (novoProduto.estaVencido(dataReferencia)) {
                        System.out.println("PRODUTO VENCIDO");
                    } else {
                        System.out.println("PRODUTO NÃO VENCIDO");
                    }
                    
                    break;

                case 3:

                    System.out.println("Você saiu!");
                    sair = true;

                    break;

                default:

                    System.out.println("Opção invlida");

            }   

        }
        
    }
    
}