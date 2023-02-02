import java.util.Scanner;
class Audience {
    String word[];
    int cnt = 0;
    boolean disconnected;
    public Audience(String[] word){
        this.word = word;
    }
    boolean isBeautiful(){
        if(word[cnt % word.length].equals("beautiful")){
            cnt++;
            return true;
        }
        else {
            cnt++;
            return false;
        }
    }
}
public class Beautiful {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int K = scan.nextInt();
        String[] phrases = new String[K];
        scan.nextLine();
        for(int i = 0; i < K; ++i) {
            phrases[i] = scan.nextLine();
        }
        final int C = scan.nextInt();
        Audience[] Cs = new Audience[C+1];
        for(int p = 1; p <= C; ++p) {
            final int N = scan.nextInt();
            String[] msg = new String[N];
            scan.nextLine();
            for(int i = 0; i < N; ++i) {
                msg[i] = scan.nextLine();
            }
            Cs[p] = new Audience(msg);
        }

        for(int i=0;i<K;i++){
            boolean iscrack = phrases[i].equals("crack");
            boolean isfound = false;
            for(int j=1;j<=C;j++){
                if(!Cs[j].isBeautiful() && iscrack && !Cs[j].disconnected){
                    System.out.print(j + " ");
                    Cs[j].disconnected = true;
                    isfound = true;
                }
            }
            if(!isfound && iscrack){
                System.out.println("x");
            }
            else if(iscrack){
                System.out.println();
            }
        }
    }
}
