import java.util.Scanner;
class Bill {
    String PIN,saleDate;
    int size,price;
    double tax,fee,stamp;
    public Bill(String PIN,String saleDate,int size,int price){
        this.PIN = PIN;
        this.saleDate = saleDate;
        this.size = size;
        this.price = price;
        this.tax = (size * price * 3) / 100;
        this.fee = (size * price * 5) / 100;
        this.stamp = (size * price) / 100;
    }
    void printInfo(){
        System.out.println(PIN + " " + saleDate + " " + size + " " + price);
        System.out.println(tax + "+" + fee + "+" + stamp + "=" + (tax+fee+stamp));
    }
}
public class LandFee {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        Bill[] B = new Bill[n];
        for(int i=0;i<n;i++){
            String PIN = scan.next();
            String Date = scan.next();
            int size = scan.nextInt();
            int price = scan.nextInt();
            B[i] = new Bill(PIN, Date, size, price);
        }
        for(int i=0;i<n;i++){
            B[i].printInfo();
        }
    }
}
