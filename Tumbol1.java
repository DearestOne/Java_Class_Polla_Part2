import java.util.Scanner;
class Tumbol {
    String name;
    int rung,wang,population;
    int availBudget;
    public Tumbol(String name,int rung,int wang,int population){
        this.population = population;
        this.name = name;
        this.rung = rung;
        this.wang = wang;
        availBudget = population * 5000;
    }
    void allocateBudget(int[] project){
        boolean isused = false;
        for(int i=0;i<project.length;i++){
            if(project[i] <= availBudget){
                System.out.print((i+1) + " ");
                availBudget -= project[i];
                isused = true;
            }
        }
        System.out.println(isused ? "" : "none");
    }
}
public class Tumbol1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String name = scan.next();
        int rung = scan.nextInt();
        int wang = scan.nextInt();
        int population = scan.nextInt();
        Tumbol T = new Tumbol(name, rung, wang, population);
        int n = scan.nextInt();
        int[] project = new int[n];
        for(int i=0;i<n;i++){
            project[i] = scan.nextInt();
        }
        T.allocateBudget(project);
    }
}
