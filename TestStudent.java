import java.util.Scanner;
class Student {
    public String firstname,lastname;
    private int[] stepScore;
    public Student(String firstname,String lastname){
        stepScore = new int[4];
        this.firstname = firstname;
        this.lastname = lastname;
    }
    int getTestScore(int num){
        return stepScore[num];
    }
    void setTestScore(int num,int amount){
        stepScore[num] = amount;
    }
    int computeTotal(){
        int Total = 0;
        for(int i=0;i<4;i++){
            Total += stepScore[i];
        }
        return Total;
    }
    void printInfo(){
        System.out.println(firstname + " " + lastname + " " + computeTotal());
    }
}
public class TestStudent {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        Student[] Stu = new Student[n];
        for(int i=0;i<n;i++){
            String name = scan.next();
            String lastname = scan.next();
            Stu[i] = new Student(name, lastname);
            for(int j=0;j<4;j++){
                int score = scan.nextInt();
                Stu[i].setTestScore(j, score);
            }
            Stu[i].printInfo();
        }
        int k = scan.nextInt();
        for(int i=0;i<k;i++){
            int num = scan.nextInt();
            int o = scan.nextInt();
            System.out.println(Stu[num - 1].getTestScore(o - 1));
        }
    }
}
// finished
