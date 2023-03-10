import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack numStack = new Stack<>();
        ArrayList targetList = new ArrayList<>();
        ArrayList resultList = new ArrayList<>();
        ArrayList returnList = new ArrayList<>();

        for(int i =0; i<n; i++){
            int inputNum = sc.nextInt();
            targetList.add(inputNum);
        }

        int pushNum = 1;
        int target = 0;

        while(resultList.size() != n){
            if(pushNum > (n+1)) {
                System.out.println("NO");
                return;
            }
            if( !numStack.isEmpty() && numStack.peek().equals(targetList.get(target)) ){
                resultList.add(numStack.pop());
                target ++;
                returnList.add("-");
            } else {
                numStack.add(pushNum);
                returnList.add("+");
                pushNum ++;
            }
        }

        for(Object i : returnList){
            System.out.println(i);
        }
    }
}
