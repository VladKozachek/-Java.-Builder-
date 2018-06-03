public class PhoneBuilder {
    private String branded="Nokia";    //значения по умолчанию
    private TypePhone typePhone=TypePhone.TELEPHONE;
    private int price=300;

   PhoneBuilder setBranded(String branded) {
        this.branded = branded;
      return this;  //возвращаем PhoneBuilder, чтобы можно было вызывать следующие методы
       // вот пример   Phone phone= new PhoneBuilder().setBranded("Samsung").setTypePhone(TypePhone.SMARTPHONE).setPrice(5000).build();
    }
    PhoneBuilder setTypePhone(TypePhone typePhone) {
        this.typePhone = typePhone;
        return this;
    }
    PhoneBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    Phone build(){
        Phone phone=new Phone();
        phone.setBranded(branded);
        phone.setTypePhone(typePhone);
        phone.setPrice(price);
        return phone;
    }
}
