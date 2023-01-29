import java.util.Scanner;
class Precinct {
    String prec;
    String name[];
    int point[];
    public Precinct(String prec,String name[]){
        this.prec = prec;
        this.name = name;
        point = new int[name.length];
    }
    void count(int number){
        if(number <= 0 || number > name.length){
            System.out.println("invalid number");
        }
        else{
            point[number - 1]++;
            System.out.println(name[number - 1] + " " + point[number - 1]);
        }
    }
    void printInfo(){
        for(int i=0;i<name.length;i++){
            System.out.println((i+1) + " " + name[i] + " " + point[i]);
        }
    }
    void printMax(){
        int max = 0;
        for(int i=0;i<name.length;i++){
            max = Math.max(max,point[i]);
        }
        for(int i=0;i<name.length;i++){
            if(point[i] == max){
                System.out.println((i+1) + " " + name[i] + " " + point[i]);
            }
        }
    }
}
public class KorKorTor2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String prec = scan.nextLine();
        int n = scan.nextInt();
        String name[] = new String[n];
        for(int i=0;i<n;i++){
            name[i] = scan.next();
        }
        Precinct Pr = new Precinct(prec, name);
        int k = scan.nextInt();
        for(int i=0;i<k;i++){
            int option = scan.nextInt();
            if(option == 1){
                int p = scan.nextInt();
                Pr.count(p);
            }
            else if(option == 2){
                Pr.printInfo();
            }
            else{
                Pr.printMax();
            }
        }
    }
}
