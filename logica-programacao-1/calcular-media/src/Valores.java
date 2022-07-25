public class Valores {

    private float valor1, valor2, valor3, valor4;

    public float getValor1() {
        return valor1;
    }

    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    public float getValor2() {
        return valor2;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }

    public float getValor3() {
        return valor3;
    }

    public void setValor3(float valor3) {
        this.valor3 = valor3;
    }

    public float getValor4() {
        return valor4;
    }

    public void setValor4(float valor4) {
        this.valor4 = valor4;
    }

    public float calculateMedia(){
        return (this.valor1 + this.valor2 + this.valor3 + this.valor4) / 4;
    }

    @Override
    public String toString() {
        return "Média aritimética:"+"\n" +
                "Valor 1: "+this.valor1+"\n" +
                "Valor 2: "+this.valor2+"\n" +
                "Valor 3: "+this.valor3+"\n" +
                "Valor 4: "+this.valor4+"\n" +
                "Média total: "+this.calculateMedia();
    }
}
