import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static long N, B, C;
    static long[] students;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Long.parseLong(br.readLine());
        st = new StringTokenizer(br.readLine());
        students = new long[(int) N];
        for (int i = 0; i < N; i++) {
            students[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        B = Long.parseLong(st.nextToken()); // 총감독관이 담당하는 사람
        C = Long.parseLong(st.nextToken());   // 부감독관이 담당하는 사람

        long total = 0;
        for (long stu : students) {
            if (stu > B) {
                total += Math.ceil((stu - B) / (C * 1.0)) + 1;
            } else {
                total += 1;
            }
        }

        System.out.println(total);


        br.close();
    }
}
