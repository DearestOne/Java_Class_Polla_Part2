import java.util.Scanner;
class Bus {
    private int allseat;
    public int option;
    public String buscode;
    private int currentSeats;
    private boolean ac = true;
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
        boolean KisPlus = k > 0;
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
public class BusCompany3 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int Q = scan.nextInt();
        Bus[] B = new Bus[Q];
        for(int i=0;i<Q;i++){
            String id = scan.next();
            int type = scan.nextInt();
            int seats = scan.nextInt();
            B[i] = new Bus(id, type, seats);
        }
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            int P = scan.nextInt();
            int K = scan.nextInt();
            int T = scan.nextInt();
            if(P == 1){
                boolean sold = false;
                for(int j=0;j<Q;j++){
                    if(B[j].option == T){
                        if(B[j].reserve(K)){
                            sold = true;
                            System.out.println(B[j].buscode);
                            break;
                        }
                    }
                }
                if(!sold){
                    System.out.println("sorry");
                }
            }
            else if(P == 2){
                B[T - 1].sendToRepair();
            }
            else{
                B[T - 1].backToService();
            }
        }
    }
}
