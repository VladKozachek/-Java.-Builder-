public class Phone {
    private String branded;
    private TypePhone typePhone;
    private int price;

    public void setBranded(String branded) {
        this.branded = branded;
    }

    public void setTypePhone(TypePhone typePhone) {
        this.typePhone = typePhone;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "branded='" + branded + '\'' +
                ", typePhone=" + typePhone +
                ", price=" + price +
                '}';
    }
}
