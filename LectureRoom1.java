import java.util.Scanner;
class LectRoom{
    int classCode,capacity;
    String name;
    int currentSeats;
    public LectRoom(int classCode,String name,int capacity){
        this.name = name;
        this.classCode = classCode;
        this.capacity = capacity;
        currentSeats = 0;
    }
    boolean reserveSeats(int want){
        if(currentSeats + want <= capacity){
            currentSeats += want;
            return true;
        }
        else{
            return false;
        }
    }
}
public class LectureRoom1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int k = scan.nextInt();
        LectRoom[] lr = new LectRoom[k];
        for(int i=0;i<k;i++){
            int code = scan.nextInt();
            String name = scan.next();
            int cap = scan.nextInt();
            lr[i] = new LectRoom(code, name, cap);
        }
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            int Ccode = scan.nextInt();
            int amount = scan.nextInt();
            boolean isFound = false;
            for(int j=0;j<k;j++){
                if(Ccode == lr[j].classCode){
                    boolean c = lr[j].reserveSeats(amount);
                    if(c){
                        System.out.println(lr[j].name);
                        isFound = true;
                        break;
                    }
                }
            }
            if(!isFound){
                System.out.println("sorry");
            }
        }
    }
}
