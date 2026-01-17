import java.time.LocalDate;

public class Despesa extends Saldo{

    private int qtdParcesalas;

    public Despesa(int qtdParcesalas) {
        this.qtdParcesalas = qtdParcesalas;
    }

    public Despesa(int id, Categoria categoria, String valor, LocalDate data, String valorPrevisto, int qtdParcesalas) {
        super(id, categoria, valor, data, valorPrevisto);
        this.qtdParcesalas = qtdParcesalas;
    }


    public int getQtdParcesalas() {
        return qtdParcesalas;
    }

    public void setQtdParcesalas(int qtdParcesalas) {

        if (qtdParcesalas<0) {
            throw new IllegalArgumentException("O numero de parcelas não pode ser negativo.");
        }

        this.qtdParcesalas = qtdParcesalas;
    }

    
    
}
