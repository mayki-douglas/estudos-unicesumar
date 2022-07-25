public class Product {

    private float valor, discount;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    /* Método para calcular o desconto, pegando o valor do produto, multiplicando a porcentagem e dividindo por 100
    assim então surgindo o valor que será descontado no produto */
    
    public float calculateDiscount(){
        return (this.valor * this.discount)/100;
    }

    public float valueToPay(){
        return this.valor - calculateDiscount();
    }

    @Override
    public String toString() {
        return "Total dos produtos"+"\n" +
                "Valor a pagar: "+this.valueToPay()+"\n" +
                "Valor do Desconto: "+this.calculateDiscount();
    }
}
