import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.*;

public class Saldo {
    private String categoria;
    private String descricao;
    private BigDecimal valor;
    private LocalDate data;
    private BigDecimal valorPrevisto;

    public Saldo() {}

    public Saldo(String categoria, String descricao, String valor, LocalDate data, String valorPrevisto) {
        this.categoria = categoria;
        this.descricao = descricao;
        this.valor = new BigDecimal(valor).setScale(4, RoundingMode.HALF_EVEN);
        this.data = data;
        this.valorPrevisto = new BigDecimal(valor).setScale(4, RoundingMode.HALF_EVEN);;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal getValorPrevisto() {
        return valorPrevisto;
    }

    public void setValorPrevisto(BigDecimal valorPrevisto) {
        this.valorPrevisto = valorPrevisto;
    }

    public void printSaldo(){
        System.out.println(descricao+";"+valor+";"+valorPrevisto+";"+categoria+";"+data);
    }
}

class SaldoTest{ 
    public static void main(String[] args) {
    
        Saldo se = new Saldo("luz", "melsal", "24.54", LocalDate.of(2000, 5, 4),"23.34");

        se.printSaldo();
        
    }

}