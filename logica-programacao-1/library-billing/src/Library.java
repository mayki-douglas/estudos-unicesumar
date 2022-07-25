public class Library {

    private int quantity;
    private float valueLocation;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getValueLocation() {
        return valueLocation;
    }

    public void setValueLocation(float valueLocation) {
        this.valueLocation = valueLocation;
    }

    public float calculateMonthlyBilling(){
        return (float)this.quantity * this.valueLocation;
    }
    /* Método de calcular o faturamento anual, se a locação de livros fosse de 80% */
    public float calculateAnnualBilling(){
        return (float) (((this.quantity * 0.8) * this.valueLocation) * 12);
    }

    @Override
    public String toString() {
        return "Faturamento da Biblioteca:"+"\n" +
                "Faturamento Mensal: "+this.calculateMonthlyBilling()+"\n" +
                "Faturamento Anual: "+this.calculateAnnualBilling();
    }
}
