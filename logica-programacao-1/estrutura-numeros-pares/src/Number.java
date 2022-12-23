public class Number {
    private int a;
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }


    //função verify number para fazer o cálculo da metade de um número.
    public int verifyNumber(){
        return (this.a / 2);
    }

    //função verify even number para verificar se a metade do número informado é par, se não, é ímpar.
    public String verifyEvenNumber(){
        if (verifyNumber() % 2 == 0){
            return "O Número "+this.verifyNumber()+" é par";
        } else {
            return "Este número é Impar";
        }
    }

    @Override
    public String toString() {
        return "Resultados:\n" +
                "Número informado: "+this.a+"\n" +
                "Metade desse número: "+this.verifyNumber()+"\n" +
                "Resultado: "+this.verifyEvenNumber();
    }
}
