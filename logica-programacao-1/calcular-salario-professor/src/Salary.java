public class Salary {

    private float valueHour;
    private int numberClasses;
    private int discount;

    public float getValueHour() {
        return valueHour;
    }

    public void setValueHour(float valueHour) {
        this.valueHour = valueHour;
    }

    public float getNumberClasses() {
        return numberClasses;
    }

    public void setNumberClasses(int numberClasses) {
        this.numberClasses = numberClasses;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    //método que vai calcular o salário bruto do Professor com as aulas dadas no mês e o valor hora.
    public float grossSalary(){
        return this.valueHour * numberClasses;
    }

    //método que irá calcular o salário líquido do professor com o disconto do inss
    public float netSalary(){
        return grossSalary() - (grossSalary() * discount)/100;
    }

    @Override
    public String toString() {
        return "Cálculos do Salário do Professor:"+"\n" +
                "Valor da hora: "+this.valueHour+"\n" +
                "Número de aulas dadas no Mês: "+this.numberClasses+"\n" +
                "Percentual de Desconto do INSS: "+this.discount+"%"+"\n" +
                "Salário Bruto: "+this.grossSalary()+"\n" +
                "Salário Liquido: "+this.netSalary();
    }
}
