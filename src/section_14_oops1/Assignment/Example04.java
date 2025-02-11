package section_14_oops1.Assignment;
class Product{
    int productId;
    String productName;
    double price;

    // method - displayProduct
    void displayProduct(){
        System.out.println("Product Id : "+ productId);

        System.out.println("Product Name : "+ productName);

        System.out.println("Price : "+ price);
    }
}
public class Example04 {
    public static void main(String[] args) {
        // creating an array to hold 3  product
        Product[] products = new Product[3];

        // Initializing product objects and assigning values
        products[0] = new Product();
        products[0].productId = 101;
        products[0].productName ="Mobile";
        products[0].price =10000.90;

        products[1] = new Product();
        products[1].productId = 102;
        products[1].productName ="Laptop";
        products[1].price = 30000.2;

        products[2] = new Product();
        products[2].productId = 103;
        products[2].productName = "Cpu";
        products[2].price = 15000.21;

        // loop
        for (int i =0; i<products.length; i++){
            products[i].displayProduct();
            System.out.println();
        }
    }
}
