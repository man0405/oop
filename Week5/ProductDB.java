package Week5;

public class ProductDB {
    public static Product getProduct(String productCode){
    
        Product b = new Product();

        if (productCode.equalsIgnoreCase("java") || productCode.equalsIgnoreCase("c++") || productCode.equalsIgnoreCase("database")){
            if (productCode.equalsIgnoreCase("java")){
                b.setCode(productCode);
                b.setDescription("Murach1s Beginning Java");
                b.setPrice(49.50);
            }
            else if (productCode.equalsIgnoreCase("c++")){
                b.setCode(productCode);
                b.setDescription("C++ Course");
                b.setPrice(49.50);
            }
            else if (productCode.equalsIgnoreCase("database")){
                b.setCode(productCode);
                b.setDescription("Database Course");
                b.setPrice(100.50);
            }
        }
        return b;
    }
}
