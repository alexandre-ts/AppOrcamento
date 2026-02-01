import java.math.BigDecimal;
import java.time.LocalDate;

public class Despesa extends Saldo{

    private int qtdParcesalas;

    public Despesa(int qtdParcesalas) {
        this.qtdParcesalas = qtdParcesalas;
    }

    public Despesa(int id, Categoria categoria, BigDecimal valorTotal, BigDecimal valorPrevisto, LocalDate data, int qtdParcesalas) {
        super(id, categoria, valorTotal, valorPrevisto, data);
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
