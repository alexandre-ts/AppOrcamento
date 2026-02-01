import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Locale;

import javax.swing.JOptionPane;

public class ControlerOrcamento {
    private Orcamento orcamento = OrcamentoDAO.carregar();

    public void addDespesa( String id,
                            String categoria,
                            String descricao, 
                            String valorTotal,
                            String valorPrevisto, 
                            String data, 
                            String qtdParcesalas){


        BigDecimal valor = null;
        try {
            NumberFormat nf = NumberFormat.getInstance(new Locale("pt", "BR"));
            Number numero = nf.parse(valorTotal);
            valor = new BigDecimal(numero.toString()).setScale(4, RoundingMode.HALF_EVEN);

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null,
                    "Valor inválido. Digite um número válido.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }

        BigDecimal valorP = null;
        try {
            NumberFormat nf = NumberFormat.getInstance(new Locale("pt", "BR"));
            Number numero = nf.parse(valorTotal);
            valorP = new BigDecimal(numero.toString()).setScale(4, RoundingMode.HALF_EVEN);

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null,
                    "Valor inválido. Digite um número válido.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }

        

        Saldo saldo = new Despesa(  Integer.valueOf(id),
                                    new Categoria(categoria, descricao),
                                    valor,
                                    valorP,
                                    LocalDate.of(2026, 3, 23),
                                    Integer.valueOf(qtdParcesalas)
                                    );

        orcamento.addSaldo(saldo);

    }

/*     public void addRenda(String id,
                        String categoria,
                        String descricao, 
                        String valor,
                        String valorPrevisto, 
                        String data){


        Saldo saldo = new Renda(Integer.valueOf(id),
                                new Categoria(categoria, descricao),
                                valor,
                                valorPrevisto,
                                LocalDate.of(2026, 3, 23)
                                );

        orcamento.addSaldo(saldo);
    }
*/

    public void mostra(){
        orcamento.mostrar();
        OrcamentoDAO.salvar(orcamento);
    }


}



