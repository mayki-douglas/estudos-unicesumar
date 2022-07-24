public class Salary {

    private float timeWorking, overtime, hourValue;
    private static final int valueOvertime = 100;

    public float getTimeWorking() {
        return timeWorking;
    }

    public void setTimeWorking(float timeWorking) {
        this.timeWorking = timeWorking;
    }

    public float getOvertime() {
        return overtime;
    }

    public void setOvertime(float overtime) {
        this.overtime = overtime;
    }

    public float getHourValue() {
        return hourValue;
    }

    public void setHourValue(float hourValue) {
        this.hourValue = hourValue;
    }

    public float calculateGrossSalary(){
        return (this.timeWorking + this.overtime *(1 +(int)(valueOvertime / 100))) * this.hourValue;
    }

    public float calculateInss(){
        return this.calculateGrossSalary() * (float) 0.09;
    }

    public float calculateFgts(){
        return this.calculateGrossSalary() * (float) 0.08;
    }

    public float netSalary(){
        return this.calculateGrossSalary() - this.calculateInss();
    }

    @Override
    public String toString() {
        return "Calculos do salário: "+"\n" +
                "O salário bruto é: "+this.calculateGrossSalary()+"\n" +
                "O salário Liquido é: "+this.netSalary()+"\n" +
                "INSS: "+this.calculateInss()+"\n" +
                "FGTS: "+this.calculateFgts();
    }
}
