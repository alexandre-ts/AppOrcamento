import java.time.LocalDate;

public class Renda extends Saldo{

    public Renda() {
    }

    public Renda(int id, Categoria categoria, String valor, LocalDate data, String valorPrevisto) {
        super(id, categoria, valor, data, valorPrevisto);
    }
    
}
