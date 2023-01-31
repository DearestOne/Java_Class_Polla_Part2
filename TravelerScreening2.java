import java.util.Scanner;
class Traveler {
    String passport_id,country,date;
    double temp;
    int safe = 0;
    String[] all_country= {"JAPAN","GERMANY","KOREA","CHINA","TAIWAN","FRANCE","SINGAPORE","ITALY","IRAN"};
    public Traveler(String id,String country,String date,double temp){
        passport_id = id;
        this.country = country;
        this.date = date;
        this.temp = temp;
        for(int i=0;i<all_country.length;i++){
            if(all_country[i].equals(country)){
                safe = -1;
            }
        }
        if(temp > 37.5){
            safe = -1;
        }
    }
    void printall(Traveler[] t){
        int pass = 0;
        int fail = 0;
        for(int i=0;i<t.length;i++){
            if(t[i].safe == -1){
                fail++;
            }
            else{
                pass++;
            }
        }
        System.out.println(fail);
        for(int i=0;i<t.length;i++){
            if(t[i].safe == -1){
                System.out.println(t[i].passport_id + " " + t[i].date);
            }
        }
        System.out.println(pass);
        for(int i=0;i<t.length;i++){
            if(t[i].safe == 0){
                System.out.println(t[i].passport_id + " " + t[i].date);
            }
        }
    }
}
public class TravelerScreening2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        Traveler[] T = new Traveler[n];
        for(int i=0;i<n;i++){
            String id = scan.next();
            String country = scan.next();
            String date = scan.next();
            double temp = scan.nextDouble();
            T[i] = new Traveler(id, country, date, temp);
        }
        T[0].printall(T);
    }
}