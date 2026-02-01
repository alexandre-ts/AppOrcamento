import java.io.*;

public class OrcamentoDAO {

    private static final String ARQUIVO = "orcamento.dat";

    public static void salvar(Orcamento orcamento) {
        try (ObjectOutputStream oos =
                 new ObjectOutputStream(new FileOutputStream(ARQUIVO))) {

            oos.writeObject(orcamento);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Orcamento carregar() {
        try (ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream(ARQUIVO))) {

            return (Orcamento) ois.readObject();

        } catch (FileNotFoundException e) {
            return new Orcamento(); // primeira execução
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new Orcamento();
        }
    }
}