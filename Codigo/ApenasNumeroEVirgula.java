import javax.swing.text.*;

public class ApenasNumeroEVirgula extends DocumentFilter {

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
            throws BadLocationException {
        replace(fb, offset, 0, string, attr);
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
            throws BadLocationException {

        String atual = fb.getDocument().getText(0, fb.getDocument().getLength());
        String novo = atual.substring(0, offset) + text + atual.substring(offset + length);

        // permite vazio
        if (novo.isEmpty()) {
            super.replace(fb, offset, length, text, attrs);
            return;
        }

        // números + opcional , + até 2 casas decimais
        if (novo.matches("\\d+(,\\d{0,2})?")) {
            super.replace(fb, offset, length, text, attrs);
        }
    }

}