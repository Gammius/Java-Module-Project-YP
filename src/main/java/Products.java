import java.util.ArrayList;
public class Products {
   ArrayList<String> products = new ArrayList<>();
   public void addProduct(String product){
       products.add(product);
   }
   public void outputProducts() {
       for(int i = 0; i < products.size(); i++) {
           System.out.println(products.get(i));
       }
   }
}