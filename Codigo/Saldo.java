import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;


public abstract class Saldo {
    private int id;
    private boolean fixoMes;
    private Categoria categoria;
    private BigDecimal valor;
    private LocalDate data;
    private BigDecimal valorPrevisto;

    public Saldo() {}

    public Saldo(int id, Categoria categoria, String valor, LocalDate data, String valorPrevisto) {
        this.id = id;
        this.categoria = categoria;
        this.valor = new BigDecimal(valor).setScale(4, RoundingMode.HALF_EVEN);
        this.data = data;
        this.valorPrevisto = new BigDecimal(valor).setScale(4, RoundingMode.HALF_EVEN);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public boolean isFixoMes() {
        return fixoMes;
    }

    public void setFixoMes(boolean fixoMes) {
        this.fixoMes = fixoMes;
    }


    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        if (categoria == null) {
            throw new IllegalArgumentException("A Categoria não pode ser nulo");
        }
        
        this.categoria = categoria;
    }


    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {

        if (valor == null) {
            throw new IllegalArgumentException("O valor não pode ser nulo.");
        }

        if (valor.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        }

        this.valor = valor;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        if (data == null) {
            throw new IllegalArgumentException("A data não pode ser nula.");
        }

        this.data = data;
    }


    public BigDecimal getValorPrevisto() {
        return valorPrevisto;
    }

    public void setValorPrevisto(BigDecimal valorPrevisto) {
        
        if (valorPrevisto == null) {
            throw new IllegalArgumentException("O valor previsto não pode ser nulo.");
        }

        if (valorPrevisto.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("O valor previsto não pode ser negativo.");
        }

        this.valorPrevisto = valorPrevisto;
    }

}