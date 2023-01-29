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
public class HousePrice1 {
    // Do not change the code below this line.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int landSize = scan.nextInt();
        int quality = scan.nextInt();
        int floors = scan.nextInt();
        int houseArea = scan.nextInt();

        House house = new House(landSize, quality, floors, houseArea);
        System.out.println(house.landSize + " " + house.quality + " " + house.floors + " " + house.houseArea);
        System.out.println(house.price);
    }
}