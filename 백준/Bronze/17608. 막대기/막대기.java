import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static int solution(Stack stickStack){
        int max = 0;
        int cnt = 0;
        while(!stickStack.isEmpty()){
            int stick = (int) stickStack.pop();
            if(max < stick ){
                max = stick;
                cnt ++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack stickStack = new Stack();
        while(n > 0){
            int stick = sc.nextInt();
            stickStack.push(stick);
            n --;
        }
        System.out.println(solution(stickStack));

    }
}
