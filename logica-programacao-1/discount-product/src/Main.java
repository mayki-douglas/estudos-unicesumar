import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Product objProduct = new Product();

        objProduct.setValor(Float.parseFloat(JOptionPane.showInputDialog("Digite o preço do Produto:")));
        objProduct.setDiscount(Float.parseFloat(JOptionPane.showInputDialog("Digite a porcentagem do Desconto: ")));

        JOptionPane.showMessageDialog(null, objProduct);
    }
}
