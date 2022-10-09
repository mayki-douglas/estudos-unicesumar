public class Number {

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int calculateRoot(){
        return (int) Math.sqrt(number);
    }

    public int calculatePow(){
        return (int) Math.pow(number, 2);
    }

    @Override
    public String toString() {
        return "Resultados:"+"\n" +
                "Número: "+this.number+"\n" +
                "Raíz Quadrada desse número: "+this.calculateRoot()+"\n" +
                "Este Número elevado a quadrado: "+this.calculatePow();
    }
}
