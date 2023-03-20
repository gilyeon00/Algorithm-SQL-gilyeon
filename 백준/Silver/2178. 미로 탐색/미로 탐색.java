import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[][] arr;
    static int[][] dist;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());   // N개 줄
        M = Integer.parseInt(st.nextToken());   // M개 정수

        arr = new int[N][M];
        dist = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = line.charAt(j);
                dist[i][j] = -1;    // 거리 -1로 초기화
            }
        }

        dist[0][0] = 1;
        bfs();

        System.out.println(dist[N - 1][M - 1]);

    }


    private static void bfs( ) {
        Queue<Pair> q = new LinkedList<>();

        q.offer(new Pair(0,0));

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int x = p.x;
            int y = p.y;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M)   continue;   // 범위 벗어나는 경우
                if(arr[nx][ny] == '0' || dist[nx][ny] != -1)    continue;   // 길이 아니거나, 방문했거나
                q.offer(new Pair(nx, ny));
                dist[nx][ny] = dist[x][y]+1;
            }

        }


    }

    private static class Pair{
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
