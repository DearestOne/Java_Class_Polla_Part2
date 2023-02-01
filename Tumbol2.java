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
    int allocateBudget(int[] project){
        boolean isused = false;
        int used = 0;
        for(int i=0;i<project.length;i++){
            if(project[i] <= availBudget){
                System.out.print((i+1) + " ");
                availBudget -= project[i];
                used += project[i];
                isused = true;
            }
        }
        System.out.println(isused ? "" : "none");
        return used;
    }
}
public class Tumbol2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        Tumbol[] T = new Tumbol[n];
        for(int i=0;i<n;i++){
            String name = scan.next();
            int rung = scan.nextInt();
            int wang = scan.nextInt();
            int population = scan.nextInt();
            T[i] = new Tumbol(name, rung, wang, population);
        }
        int[][] project = new int[n][];
        for(int i=0;i<n;i++){
            int k = scan.nextInt();
            project[i] = new int[k];
            for(int j=0;j<k;j++){
                project[i][j] = scan.nextInt();
            }
        }
        int sum_used = 0;
        for(int i=0;i<n;i++){
            sum_used += T[i].allocateBudget(project[i]);
        }
        System.out.println(sum_used);
    }
}
