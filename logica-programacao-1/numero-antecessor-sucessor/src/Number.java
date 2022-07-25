public class Number {

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int numberPredecessor(){
        return this.number - 1;
    }

    public int numberSuccessor(){
        return this.number + 1;
    }

    @Override
    public String toString() {
        return "Números:"+"\n" +
                "Número antecessor: "+this.numberPredecessor()+"\n" +
                "Número informado: "+this.number+"\n" +
                "Número Sucessor: "+this.numberSuccessor();
    }
}
