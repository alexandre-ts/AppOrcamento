public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {}
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31)
            this.dia = dia;
        else
            System.out.println("Dia invalido");
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12)
            this.mes = mes;
        else
            System.out.println("Mes invalido");
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano>=1900)
            this.ano = ano;
        else
            System.out.println("Ano invalido");
    }
}