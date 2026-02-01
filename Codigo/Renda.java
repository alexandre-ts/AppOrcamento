import java.math.BigDecimal;
import java.time.LocalDate;

public class Renda extends Saldo{

    public Renda() {
    }

    public Renda(int id, Categoria categoria, BigDecimal valorTotal, BigDecimal valorPrevisto, LocalDate data) {
        super(id, categoria, valorTotal, valorPrevisto, data);
    }
    
}
