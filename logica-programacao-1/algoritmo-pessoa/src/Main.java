import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Person objPerson = new Person();

        objPerson.setName(JOptionPane.showInputDialog("Insira o Nome da pessoa:"));
        objPerson.setAge(Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade da pessoa:")));
        objPerson.setHeight(Float.parseFloat(JOptionPane.showInputDialog("Digite a Altura:")));
        objPerson.setWeight(Float.parseFloat(JOptionPane.showInputDialog("Digite o Peso:")));
        objPerson.setPhone(JOptionPane.showInputDialog("Digite o telefone:"));

        JOptionPane.showMessageDialog(null, objPerson);
    }
}
