public class Quadrado {

    private float lado;

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float calculatePerimeter(){
        return 4 * this.lado;
    }

    public float calculateArea(){
        return this.lado * this.lado;
    }

    @Override
    public String toString() {
        return "Dados do Cálculo: "+"\n" +
                "Valor do Perímetro: "+this.calculatePerimeter()+" metros." +"\n" +
                "Valor da área: "+this.calculateArea()+" metros.";
    }
}
