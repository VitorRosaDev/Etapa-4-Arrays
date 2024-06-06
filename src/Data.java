
public class Data {

    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano) {
        if (!validarData(dia, mes, ano)) {
            System.out.println("Data inválida. Configurando para a data padrão: 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public boolean validarData(int dia, int mes, int ano) {
        if (ano < 0 || mes < 1 || mes > 12 || dia < 1 || dia > diasNoMes(mes, ano)) {
            return false;
        }
        return true;
    }

    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
    }
    
    public int diasNoMes(int mes, int ano) {
        int[] diasPorMes = {0, 31, verificaAnoBissexto() ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return diasPorMes[mes];
    }
}