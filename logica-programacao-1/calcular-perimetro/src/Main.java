import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Quadrado objQuadrado = new Quadrado();

        objQuadrado.setLado(Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do Lado do Quadrado:")));

        JOptionPane.showMessageDialog(null, objQuadrado);
    }
}
