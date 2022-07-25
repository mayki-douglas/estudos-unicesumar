public class Triangle {

    private float base, height;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float calculateAreaTriangle(){
        return (this.base * this.height)/2;
    }

    @Override
    public String toString() {
        return "Resultados:"+"\n" +
                "Valor Base: "+this.base+"\n" +
                "Valor Altura: "+this.height+"\n" +
                "Calculo da área: "+this.calculateAreaTriangle();
    }
}
