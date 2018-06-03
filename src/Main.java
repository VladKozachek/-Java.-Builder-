public class Main {
    public static void main(String[] args) {
        Phone phone= new PhoneBuilder().setBranded("Samsung").setTypePhone(TypePhone.SMARTPHONE).setPrice(5000).build();
        System.out.println(phone);
    }
}
