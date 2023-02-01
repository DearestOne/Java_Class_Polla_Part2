import java.util.Scanner;
class ZooTicketA {
    boolean isUsed = false,isChild;
    boolean rail;
    public ZooTicketA(boolean isChild){
        this.isChild = isChild;
        rail = false;
    }
    boolean enterZoo(int height){
        if(isUsed){
            return false;
        }
        else if(isChild && height > 120){
            return false;
        }
        else{
            isUsed = true;
            return true;
        }
    }
    boolean useRide(){
        if(isUsed && !rail){
            rail = true;
            return true;
        }
        else{
            return false;
        }
    }
}
public class ZooTicketAgain2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n =scan.nextInt();
        ZooTicketA[] zoo = new ZooTicketA[n];
        for(int i=0;i<n;i++){
            int c = scan.nextInt();
            if(c == 1){
                zoo[i] = new ZooTicketA(false);
            }
            else{
                zoo[i] = new ZooTicketA(true);
            }
        }
        int Q = scan.nextInt();
        for(int i=0;i<Q;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            if(b == 1){
                int c = scan.nextInt();
                System.out.println(zoo[a-1].enterZoo(c));
            }
            else if(b == 2){
                System.out.println(zoo[a-1].useRide());
            }
        }
    }
}