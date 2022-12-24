public class Number {

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String verifyNumber(){
        if(a > 10){
            return "Este número é maior que 10";
        } else {
            return "Este número é menor que 10";
        }
    }

    @Override
    public String toString() {
        return "Resultados:"+"\n" +
                "Número informado: "+this.a+"\n" +
                verifyNumber();
    }
}
