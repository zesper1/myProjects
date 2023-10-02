package testproduct;
public class TestProduct {
    public static void main(String[] args) {
        Product p = new Product();
        p.setName("Apple");
        p.setDescription("A fruit.");
        p.setPrice(69);
        p.displayProductInfo();
        System.out.println("");
        p.applyDiscount(5);
        p.displayProductInfo();
        
    }
    
}
