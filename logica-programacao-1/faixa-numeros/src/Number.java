public class Number {

    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    //Criada função que verifica a faixa de números usando operador E
    //Estrutura condicional composta
    public String verifyNumber(){
        if (this.n > 20 && this.n < 90){
            return "Este número está na faixa entre 20 e 90";
        } else {
            return "Número fora da faixa";
        }
    }

    @Override
    public String toString() {
        return "Resultados:"+"\n" +
                "Número informado: "+this.n+"\n" +
                this.verifyNumber();
    }
}
