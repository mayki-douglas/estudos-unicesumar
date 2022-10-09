import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Number objNumber = new Number();

        objNumber.setNumber(Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro:")));

        JOptionPane.showMessageDialog(null, objNumber);

    }
}
