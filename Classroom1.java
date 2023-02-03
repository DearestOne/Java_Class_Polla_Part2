import java.util.Scanner;
class Classroom {
    String name;
    boolean projecter,visual,smart,camera,isused;
    int seats;
    public Classroom(String name,int seats,boolean pro,boolean visual,boolean smart,boolean camera){
        this.name = name;
        this.camera = camera;
        projecter = pro;
        this.visual = visual;
        this.seats = seats;
        this.smart = smart;
        isused = false;
    }
    boolean isAvailable(int seats,boolean pro,boolean visual,boolean smart,boolean camera){
        boolean result = true;
        if(this.seats < seats){
            result = false;
        }
        if(!this.projecter && pro){
            result = false;
        }
        if(!this.visual && visual){
            result = false;
        }
        if(!this.smart && smart){
            result = false;
        }
        if(!this.camera && camera){
            result = false;
        }
        if(isused){
            result = false;
        }
        return result;
    }
    boolean reserve(int seats,boolean pro,boolean visual,boolean smart,boolean camera){
        if(isAvailable(seats, pro, visual, smart, camera)){
            isused = true;
            return true;
        }
        else{
            return false;
        }
    }
}
public class Classroom1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        Classroom[] cl = new Classroom[n];
        for(int i=0;i<n;i++){
            String name = scan.next();
            int numSeats = scan.nextInt();
            Boolean nProj = scan.nextInt() == 1 ? true : false;
            Boolean nVisual = scan.nextInt() == 1 ? true : false;
            Boolean nSmart = scan.nextInt() == 1 ? true : false;
            Boolean nCam = scan.nextInt() == 1 ? true : false;
            cl[i] = new Classroom(name, numSeats, nProj, nVisual, nSmart, nCam);
        }
        int k = scan.nextInt();
        for(int i=0;i<k;i++){
            int numSeats = scan.nextInt();
            Boolean nProj = scan.nextInt() == 1 ? true : false;
            Boolean nVisual = scan.nextInt() == 1 ? true : false;
            Boolean nSmart = scan.nextInt() == 1 ? true : false;
            Boolean nCam = scan.nextInt() == 1 ? true : false;
            boolean isfound = false;
            for(int j=0;j<n;j++){
                if(cl[j].reserve(numSeats, nProj, nVisual, nSmart, nCam)){
                    System.out.println(cl[j].name);
                    isfound = true;
                    break;
                }
            }
            if(!isfound){
                System.out.println("classroom not available");
            }
        }
    }
}