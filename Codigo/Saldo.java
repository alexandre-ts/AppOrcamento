import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


public abstract class Saldo implements Serializable{
    private int id;
    private boolean fixoMes;
    private Categoria categoria;
    private BigDecimal valorTotal;
    private LocalDate data;
    private BigDecimal valorPrevisto;

    public Saldo() {}

    public Saldo(int id, Categoria categoria, BigDecimal valorTotal, BigDecimal valorPrevisto, LocalDate data) {
        this.id = id;
        this.categoria = categoria;
        this.valorTotal = valorTotal;
        this.data = data;
        this.valorPrevisto = valorPrevisto;
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
        return valorTotal;
    }

    public void setValor(BigDecimal valorTotal) {

        if (valorTotal == null) {
            throw new IllegalArgumentException("O valorTotal não pode ser nulo.");
        }

        if (valorTotal.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("O valorTotal não pode ser negativo.");
        }

        this.valorTotal = valorTotal;
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
            throw new IllegalArgumentException("O valorTotal previsto não pode ser nulo.");
        }

        if (valorPrevisto.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("O valorTotal previsto não pode ser negativo.");
        }

        this.valorPrevisto = valorPrevisto;
    }


    public void print(){
        System.out.println(id+";"+categoria+";"+valorTotal+";"+valorPrevisto+";"+data);
    }
}