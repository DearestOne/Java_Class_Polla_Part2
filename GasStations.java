import java.util.Scanner;
class GasStation {
    int[] cap,current;
    boolean[] gas;
    String[] name = {"dummy","95S","91S","E20","E85","B7","B20"};
    public GasStation(boolean[] gas,int[] cap){
        this.gas = gas;
        this.cap = cap;
        this.current = java.util.Arrays.copyOf(cap, cap.length);
    }
    void dispense(int num,int amount){
        if(!gas[num]){
            System.out.println("Invalid gas type");
        }
        else if(current[num] == 0){
            System.out.println("No gas available");
        }
        else if(amount <= current[num]){
            System.out.println("Dispense " + amount +  " liters");
            current[num] -= amount;
        }
        else{
            System.out.println("Dispense " + current[num] +  " liters");
            current[num] = 0;
        }
    }
    void refillStation(int num,int amount){
        if(!gas[num]){
            System.out.println("Invalid gas type");
        }
        else if(current[num] == cap[num]){
            System.out.println("No storage capacity available");
        }
        else if(current[num] + amount > cap[num]){
            System.out.println("Refill " + (cap[num]-current[num]) + " liters");
            current[num] = cap[num];
        }
        else{
            System.out.println("Refill " + amount + " liters");
            current[num] += amount;
        }
    }
    void report(){
        for(int i=1;i<=6;i++){
            if(gas[i]){
                System.out.print(name[i] + " " + current[i] + ", ");
            }
        }
        System.out.println();
    }
}
public class GasStations {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        GasStation[] gs = new GasStation[n+1];
        for(int i=1;i<=n;i++){
            boolean[] gas = new boolean[7];
            int[] cap = new int[7];
            for(int g = 1; g <= 6; ++g) {
                int k = scan.nextInt();
                gas[g] = (k > 0)? true: false;
                cap[g] = k;
            }
            gs[i] = new GasStation(gas ,cap);
        }
        final int Q = scan.nextInt();
        for(int i = 0; i < Q; ++i) {
            final int A = scan.nextInt(); // option
            final int S = scan.nextInt(); // num station
            final int B = scan.nextInt(); // type gas
            final int C = scan.nextInt(); // amount
            if(A == 1){
                gs[S].dispense(B, C);
            }
            else if(A == 2){
                gs[S].refillStation(B, C);
            }
            else if(A == 3){
                gs[S].report();
            }
        } 
    }
}
