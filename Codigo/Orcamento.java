import java.math.BigDecimal;
import java.util.*;

public class Orcamento {

    private List<Saldo> listSaldos = new ArrayList<>();

    public void addSaldo(Saldo s){
        if (s instanceof Despesa) {
            Despesa d = (Despesa) s;
            for(int i = 1; i<=d.getQtdParcesalas(); i++){
                listSaldos.add(d);
            }
        }
        else
            listSaldos.add(s);
    }

    public BigDecimal somaDespesa(){
        return listSaldos.stream()
                    .filter(s -> s instanceof Despesa)
                    .map(s -> s.getValor())
                    .reduce(BigDecimal.ZERO, (acomudaor, s) -> acomudaor.add(s));
    }

    public BigDecimal somaRenda(){
        return listSaldos.stream()
                    .filter(s -> s instanceof Renda)
                    .map(s -> s.getValor())
                    .reduce(BigDecimal.ZERO, (acomudaor, s) -> acomudaor.add(s));
    }

    public void editarElemento(int index, Saldo novoSaldo){
        listSaldos.set(index, novoSaldo);                
    }

}

class OrcamentoTest {
    public static void main(String[] args) {
        

        Orcamento orcamento = new Orcamento();

        System.out.println(orcamento);
    }
}
