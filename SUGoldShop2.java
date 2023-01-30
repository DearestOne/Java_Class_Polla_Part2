import java.util.Scanner;
class Item{
    double weight;
    boolean r;
    public Item(boolean R,double weight){
        r = R;
        this.weight = weight;
    }
    double saleprice(double price){
        if(r){
            return (price * weight) + (1000 * weight);
        }
        else{
            return price * weight;
        }
    }
    double buyprice(double price){
        if(r){
            return (price * weight * 98) / 100;
        }
        else{
            return (price - 100) * weight;
        }
    }
}
public class SUGoldShop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double pricegold = input.nextDouble();
        Item[] arrayx = new Item[n];
        double gout = 0,gin = 0;
        double in = 0,out = 0;
        for (int i=0;i<n;i++){
            String cmdline = input.next();
            String attgold = input.next();
            double weight = input.nextDouble();
            if (attgold.equalsIgnoreCase("t")){
                arrayx[i] = new Item(true,weight);
            }
            else{
                arrayx[i] = new Item(false,weight);
            }
            if(cmdline.equalsIgnoreCase("s")){
                out += arrayx[i].saleprice(pricegold);
                gout += arrayx[i].weight;
            }
            else if(cmdline.equalsIgnoreCase("b")){
                in += arrayx[i].buyprice(pricegold);
                gin += arrayx[i].weight;
            }
        }
        System.out.println(gout + " " + out);
        System.out.println(gin + " " + in);
    }
}