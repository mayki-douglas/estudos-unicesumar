import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Triangle objTriangle = new Triangle();

        objTriangle.setBase(Float.parseFloat(JOptionPane.showInputDialog("Digite a Base do triangulo:")));
        objTriangle.setHeight(Float.parseFloat(JOptionPane.showInputDialog("Digite a Altura do triangulo:")));

        JOptionPane.showMessageDialog(null, objTriangle);
    }
}
