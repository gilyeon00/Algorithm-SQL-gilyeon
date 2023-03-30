import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        str = str.toUpperCase(Locale.ROOT);

        int[] alph = new int[26];
        for (int i = 0; i < str.length(); i++) {
            alph[str.charAt(i) - 'A'] ++;
        }

        int max = -1;
        int idx = -1;
        for (int i = 0; i < alph.length; i++) {
            if (max < alph[i]) {
                max = alph[i];
                idx = i;
            }
        }

        Arrays.sort(alph);

        if(alph[alph.length-1] == alph[alph.length-2]) System.out.println("?");
        else {
            char result = (char) (idx + 'A');
            System.out.println(result);
        }

        br.close();
    }
}
