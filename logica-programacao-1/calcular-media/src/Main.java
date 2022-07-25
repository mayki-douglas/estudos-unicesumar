import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Valores objValores = new Valores();
        objValores.setValor1(Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro Valor:")));
        objValores.setValor2(Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo Valor:")));
        objValores.setValor3(Float.parseFloat(JOptionPane.showInputDialog("Digite o terceiro Valor:")));
        objValores.setValor4(Float.parseFloat(JOptionPane.showInputDialog("Digite o quarto Valor:")));

        JOptionPane.showMessageDialog(null, objValores);

    }
}
