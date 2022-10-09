public class Circle {

    private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    //método pra calcular o perímetro do Circulo
    public float calculatePerimeter(){
        return (float) (2 * Math.PI * radius);
    }

    //método pra calcular a área do círculo
    public float calculateArea(){
        return (float) (Math.PI * Math.pow(radius, 2)); //TIP: quando usar o Math.pow, inserir SEMPRE a base e o expoente.
    }

    @Override
    public String toString() {
        return "Resultados da Equação:"+"\n" +
                "Valor do Raio: "+this.radius+"\n" +
                "Valor da área: "+this.calculateArea()+"\n" +
                "Valor do Perímetro: "+this.calculatePerimeter();
    }
}
