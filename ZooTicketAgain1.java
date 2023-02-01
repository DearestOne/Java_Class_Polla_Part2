import java.util.Scanner;
class ZooTicketA {
    boolean isUsed = false,isChild;
    public ZooTicketA(boolean isChild){
        this.isChild = isChild;
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
}
public class ZooTicketAgain1 {
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
            int numticket = scan.nextInt();
            int heigth = scan.nextInt();
             System.out.println(zoo[numticket - 1].enterZoo(heigth));
        }
    }
}
