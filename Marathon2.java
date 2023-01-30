import java.util.Scanner;
class Runner {
    String name,BIB;
    static int number = 0;
    int num;
    boolean isinRange;
    public Runner(String name,int bib){
        isinRange = bib > 0 && bib <= 4;
        if(isinRange){
            number++;
            num = number;
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
        else if(bib == 4){
            BIB = "D";
        }
        else{
            BIB = "F";
        }
        this.name = name;
    }
    char check(){
        return BIB.charAt(0);
    }
}
public class Marathon2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        Runner[] R = new Runner[n];
        for(int i=0;i<n;i++){
            String name = scan.next();
            int bib = scan.nextInt();
            R[i] = new Runner(name,bib);
        }
        for(int i=0;i<4;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if((char)(65 + i) == R[j].check()){
                    count++;
                }
            }
            System.out.println(count);
            for(int j=0;j<n;j++){
                if((char)(65 + i) == R[j].check()){
                    System.out.print(R[j].BIB + String.format("%03d",R[j].num) + " ");
                }
            }
            System.out.printf(count == 0 ? "-\n" : "\n");
        }
    }
}
