import java.util.Scanner;
class Character {
    String word[];
    int cnt = 0;
    public Character(String[] word){
        this.word = word;
    }
    void speak(){
        System.out.println(word[cnt % word.length]);
        cnt++;
    }
}
public class CharVoice2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        Character[] cha = new Character[n];
        for(int i=0;i<n;i++){
            int k = scan.nextInt();
            String[] w = new String[k];
            scan.nextLine();
            for(int j=0;j<k;j++){
                w[j] = scan.nextLine();
            }
            cha[i] = new Character(w);
        }
        int p = scan.nextInt();
        for(int i=0;i<p;i++){
            int x = scan.nextInt() - 1;
            cha[x].speak();
        }
    }
}
