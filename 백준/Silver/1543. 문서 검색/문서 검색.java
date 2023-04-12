import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static 	StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb.append(br.readLine());
        String str = br.readLine();

        howManyTime(str);

    }

    static void howManyTime(String str) {
        int cnt = 0, startIdx = 0;
        int target = str.length();

        while((startIdx = sb.toString().indexOf(str)) != -1) {
            sb.delete(0, startIdx + target);
            cnt++;
        }

        System.out.println(cnt);
    }
}
