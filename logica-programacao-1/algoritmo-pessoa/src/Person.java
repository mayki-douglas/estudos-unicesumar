public class Person {

    private String name;
    private float height, weight;
    private int age;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString(){
        return "Dados da pessoa: "+"\n" +
                "Nome: "+this.name+"\n" +
                "Peso: "+this.weight+"\n" +
                "Idade: "+this.age+"\n" +
                "Altura: "+this.height+"\n" +
                "Telefone: "+this.phone;
    }
}
