import java.util.*;

class Points {
    int start;
    int end;

    Points(int s, int e) {
        this.start = s;
        this.end = e;
    }
}

class Solution {
    public void check(int B[][], int A[][], int start, int end, int value, int visit[][]) {
        if (start < A.length && start >= 0 && end < A[0].length && end >= 0) {
            if (visit[start][end] == 1)
                return;

            visit[start][end] = 1;

            int check = A[start][end] == 1 ? 0 : Math.min(value, B[start][end]);
            B[start][end] = check;

            // top
            check(B, A, start - 1, end, value + 1, visit);
            // left
            check(B, A, start, end - 1, value + 1, visit);
            // right
            check(B, A, start, end + 1, value + 1, visit);
            // bottom
            check(B, A, start + 1, end + 1, value + 1, visit);
            visit[start][end] = 0;
            return;

        } else {
            return;
        }

    }

    public int[][] solve(int[][] A) {
        int[][] B = new int[A.length][A[0].length];
        int visit[][] = new int[A.length][A[0].length];

        ArrayList<Points> p = new ArrayList<Points>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                B[i][j] = A[i][j] == 1 ? 0 : 10000;
                if (A[i][j] == 1) {
                    p.add(new Points(i, j));
                }
            }
        }
        // System.out.println("p.size() " + p.size());
        for (int pi = 0; pi < p.size(); pi++) {
            Points cp = p.get(pi);

            check(B, A, cp.start, cp.end, 0, visit);

        }

        //

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(B[i][j] + " ");

            }
            System.out.println();
        }

        //
        return B;

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        int A[][] = new int[][] {
                { 0, 0, 0, 1 },
                { 0, 0, 1, 1 },
                { 0, 1, 1, 0 },
        };
        System.out.println(new Solution().solve(A));
    }
}
