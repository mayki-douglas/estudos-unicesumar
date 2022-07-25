import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Library objLibrary = new Library();

        objLibrary.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de Livros:")));
        objLibrary.setValueLocation(Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor da locação:")));

        JOptionPane.showMessageDialog(null, objLibrary);
    }
}
