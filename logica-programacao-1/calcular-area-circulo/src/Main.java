import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Circle objCircle = new Circle();

        objCircle.setRadius(Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do Raio: ")));

        JOptionPane.showMessageDialog(null, objCircle);

    }
}
