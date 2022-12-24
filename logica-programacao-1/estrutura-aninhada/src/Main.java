import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Number objNumber = new Number();

        objNumber.setA(Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número:")));
        objNumber.setB(Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número:")));
        objNumber.setC(Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro número:")));

        JOptionPane.showMessageDialog(null, objNumber);

    }

}
