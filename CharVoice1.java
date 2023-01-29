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
public class CharVoice1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        scan.nextLine();
        String[] w = new String[n];
        for(int i=0;i<n;i++){
            w[i] = scan.nextLine();
        }
        Character cha = new Character(w);
        int k = scan.nextInt();
        for(int i=0;i<k;i++){
            cha.speak();
        }
    }
}
