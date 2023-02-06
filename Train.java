import java.util.Scanner;
class Carriage {
    int seats,type,code,currentSeats;
    int Stand,currentStand; // type == 3
    public Carriage(int seats,int type,int code){
        this.seats = seats;
        this.code = code;
        this.type = type;
        currentSeats = 0;
        currentStand = 0;
        Stand = type == 3 ? 10 : 0;
    }
    void reserveSeats(int amount){
        if(currentSeats + amount <= seats){
            currentSeats += amount;
        }
        else if(type == 3){
            int enough = seats - currentSeats + Stand - currentStand;
            if(amount <= enough){
                amount -= seats - currentSeats;
                currentSeats = seats;
                currentStand += amount;
            }
        }
    }
    void printStats(){
        if(type == 3){
            System.out.print(code + " " + type + " " + currentSeats + " " + seats + " ");
            System.out.println(currentStand + " " + Stand);
        }
        else {
            System.out.println(code + " " + type + " " + currentSeats + " " + seats);
        }
    }
}
public class Train {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        Carriage[] C = new Carriage[n];
        for(int i=0;i<n;i++){
            int type = scan.nextInt();
            int seats = scan.nextInt();
            int code = scan.nextInt();
            C[i] = new Carriage(seats, type, code);
        }
        int k = scan.nextInt();
        for(int i=0;i<k;i++){
            int p = scan.nextInt();
            int q = scan.nextInt();
            C[p-1].reserveSeats(q);
        }
        for(int i=0;i<n;i++){
            C[i].printStats();
        }
    }
}
