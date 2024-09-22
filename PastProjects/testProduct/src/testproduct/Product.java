package testproduct;
public class Product {
    private String name;
    private String description;
    private double price;
    public Product()
    {
    }
    public Product(String name, String description, int price)
    {
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public void displayProductInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
    }
    public double applyDiscount(double discountPercentage)
    {
    return this.price = price - (price * (discountPercentage * .01));
    }
    public void setName(String name){this.name = name;}
    public void setDescription(String description){this.description = description;}
    public void setPrice(int price){this.price = price; if(price <= 0 ){System.out.println("Input price that is higher than 0 only.");}}
    public void setPrice(float price){this.price = price; if(price <= 0 ){System.out.println("Input price that is higher than 0 only.");}}
    public void setPrice(double price){this.price = price; if(price <= 0 ){System.out.println("Input price that is higher than 0 only.");}}
    public String getName(String name){return name;}
    public String getDescription(String Description){return Description;}
    public int getPrice(int price){if(price <= 0 ){System.out.println("Input price that is higher than 0 only.");} return price;}
    public double getPrice(double price){if(price <= 0 ){System.out.println("Input price that is higher than 0 only.");} return price;}
    public float getPrice(float price){if(price <= 0 ){System.out.println("Input price that is higher than 0 only.");} return price;}
}
