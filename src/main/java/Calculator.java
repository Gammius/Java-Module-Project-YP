import java.util.ArrayList;
public class Calculator {
    public float sum = 0;
    public int result2;
    ArrayList<Float> prices = new ArrayList<>();
    Formatter rub = new Formatter();
    public void addPrice(float price){
        prices.add(price);
    }
    public void samib() {
        for(int i = 0; i < prices.size(); i++) {
            sum = sum + prices.get(i);
        }
        result2 = (int)Math.floor(sum / Main.quantity);
        float result = sum / Main.quantity;
        rub.formatRub(result2);
        String format = "С каждого по  %.2f %s";
        System.out.println(String.format(format, result, Formatter.padezh));
    }
}