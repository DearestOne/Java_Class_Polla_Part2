import java.util.Scanner;
class Party {
    String Party_Name;
    int people;
    String[] name,surname;
    int[] num_region;
    public Party(String name,int people,Scanner scan){
        Party_Name = name;
        this.people = people;
        this.name = new String[people];
        surname = new String[people];
        num_region = new int[people];
        for(int i=0;i<people;i++){
            this.name[i] = scan.next();
            surname[i] = scan.next();
            num_region[i] = scan.nextInt();
        }
    }
    void printInfo(int number){
        if(number < 0){
            System.out.println("invalid region number");
        }
        else if(number == 0){
            for(int i=0;i<people;i++){
                System.out.println(name[i] + " " + surname[i] + " " + num_region[i]);
            }
        }
        else{
            boolean isfound = false;
            for(int i=0;i<people;i++){
                if(number == num_region[i]){
                    System.out.println(name[i] + " " + surname[i]);
                    isfound = true;
                }
            }
            if(!isfound){
                System.out.println("none");
            }
        }
    }
}
public class KorKorTor {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        Party[] P = new Party[n];
        String party_name[] = new String[n];
        int people[] = new int[n];
        for(int i=0;i<n;i++){
            party_name[i] = scan.next();
            people[i] = scan.nextInt();
        }
        for(int i=0;i<n;i++){
            P[i] = new Party(party_name[i], people[i], scan);
        }
        int k = scan.nextInt();
        for(int i=0;i<k;i++){
            int partyNumber = scan.nextInt() - 1;
            int regionNumber = scan.nextInt();
            P[partyNumber].printInfo(regionNumber);
        }
    }
}
