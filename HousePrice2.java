import java.util.Scanner;
class House {
    int landSize,quality,floors,houseArea;
    public int price;
    public House(int space,int quality,int floors,int landarea){
        landSize = space;
        this.quality = quality;
        this.floors = floors;
        houseArea = landarea;
        price = computePrice(space, quality, floors, landarea);
    }
    int computePrice(int space,int quality,int floor,int landarea){
        int result = 0;
        result += landSize * 10000;
        result += (floor - 1) * 200000;
        if(quality == 1){
            result += 10000 * houseArea;
        }
        else if(quality == 2){
            result += 8000 * houseArea;
        }
        else{
            result += 5000 * houseArea;
        }
        return result;
    }
}
public class HousePrice2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        House[] H = new House[n];
        for(int i=0;i<n;i++){
            int landSize = scan.nextInt();
            int quality = scan.nextInt();
            int floors = scan.nextInt();
            int houseArea = scan.nextInt();
            H[i] = new House(landSize,quality,floors,houseArea);
        }
        int max = scan.nextInt();
        int min = scan.nextInt();
        boolean isfound = false;
        for(int i=0;i<n;i++){
            if(H[i].houseArea >= min && H[i].price <= max){
                System.out.print(H[i].landSize + " " + H[i].quality + " ");
                System.out.print(H[i].floors + " " + H[i].houseArea + " ");
                System.out.println(H[i].price);
                isfound = true;
            }
        }
        if(!isfound){
            System.out.println("none");
        }
    }
}
