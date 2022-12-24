import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Number {

    private int a, b, c, min, max;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    //estrutura condicional aninhada
    public int verifyMaxNumber(){
        if(this.a > this.b){
            if(this.a > this.c){
                return max = a;
            } else {
                return max = c;
            }
        } else {
            if (this.b > this.c){
                return max = b;
            } else {
                return max = c;
            }
        }
    }

    @Override
    public String toString() {
        return "Resultado:"+"\n" +
                "O maior número é "+this.verifyMaxNumber();
    }
}
