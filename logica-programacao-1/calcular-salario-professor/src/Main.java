import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Salary objSalary = new Salary();

        objSalary.setValueHour(Float.parseFloat(JOptionPane.showInputDialog("Insira o Valor da hora Aula:")));
        objSalary.setNumberClasses(Integer.parseInt(JOptionPane.showInputDialog("Insira o número de aulas dadas no Mês")));
        objSalary.setDiscount(Integer.parseInt(JOptionPane.showInputDialog("Insira o percentual de Desconto do INSS:")));

        JOptionPane.showMessageDialog(null, objSalary);

    }
}
