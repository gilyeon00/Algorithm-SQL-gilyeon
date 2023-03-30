import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        while ((input = br.readLine()) != null) {
            int smallCnt = 0, largeCnt = 0, numCnt = 0, spaceCnt = 0;
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' ') spaceCnt++;
                else if(input.charAt(i)>= '0' && input.charAt(i)<='9') numCnt++;
                else if(input.charAt(i)>='A' && input.charAt(i)<='Z') largeCnt++;
                else if(input.charAt(i)>='a' && input.charAt(i)<='z') smallCnt++;
            }
            System.out.printf("%d %d %d %d \n", smallCnt, largeCnt, numCnt, spaceCnt);
        }

    }
}
