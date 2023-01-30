import java.util.Scanner;
class Runner {
    String name,BIB;
    static int number = 0;
    boolean isinRange;
    public Runner(String name,int bib){
        isinRange = bib > 0 && bib <= 4;
        if(isinRange){
            number++;
        }
        if(bib == 1){
            BIB = "A";
        }
        else if(bib == 2){
            BIB = "B";
        }
        else if(bib == 3){
            BIB = "C";
        }
        else{
            BIB = "D";
        }
        this.name = name;
    }
    void printInfo(){
        if(!isinRange){
            System.out.println("INVALID");
        }
        else{
            System.out.println(BIB + String.format("%03d",number) + " " + name);
        }
    }
}
public class Marathon1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        Runner[] R = new Runner[n];
        for(int i=0;i<n;i++){
            String name = scan.next();
            int bib = scan.nextInt();
            R[i] = new Runner(name,bib);
            R[i].printInfo();
        }
    }
}
