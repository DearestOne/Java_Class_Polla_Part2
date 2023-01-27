import java.util.Scanner;
class Bus {
    public int option,allseat;
    public String buscode;
    int currentSeats;
    public Bus(String buscode,int option,int allseat){
        this.buscode = buscode;
        this.option = option;
        this.allseat = allseat;
    }
    void printStats(){
        System.out.println(buscode);
        if(option == 1){
            System.out.println("Fan");
        }
        else if(option == 2){
            System.out.println("P1");
        }
        else{
            System.out.println("VIP");
        }
        System.out.println(currentSeats + " " + allseat);
        System.out.println("Active");
    }
}
public class BusCompany1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus b = new Bus(id, type, seats);
        b.printStats();
    }
}