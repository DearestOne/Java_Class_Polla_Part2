import java.util.Scanner;
class Bus {
    public int option,allseat;
    public String buscode;
    int currentSeats;
    boolean ac = true;
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
        System.out.println(ac ? "Active" : "Inactive");
    }
    boolean reserve(int k){
        boolean KisPlus = k >= 0;
        boolean over = k + currentSeats > allseat;
        if(KisPlus && !over && ac){
            currentSeats += k;
            return true;
        }
        else{
            return false;
        }
    }
    void sendToRepair(){
        ac = false;
    }
    void backToService(){
        ac = true;
    }
}
public class BusCompany2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus b = new Bus(id, type, seats);

        int N = scan.nextInt();
        for(int i = 0; i < N; ++i) {
            int P = scan.nextInt();
            int K = scan.nextInt();
            if(P == 1)
                b.reserve(K);
            else if(P == 2)
                b.sendToRepair();
            else if(P == 3)
                b.backToService();
            b.printStats();
        }
    }
}
