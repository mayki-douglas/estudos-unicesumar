import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Salary objSalary = new Salary();

        objSalary.setTimeWorking(Float.parseFloat(JOptionPane.showInputDialog("Informe o número de Horas trabalhadas:")));
        objSalary.setOvertime(Float.parseFloat(JOptionPane.showInputDialog("Informe o número de Horas Extras:")));
        objSalary.setHourValue(Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da Hora:")));

        JOptionPane.showMessageDialog(null, objSalary);
    }
}
