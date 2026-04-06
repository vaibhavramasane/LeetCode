import java.util.*;

public class Leetcode874Ques {

    public static int robotSim(int[] commands, int[][] obstacles) {

        Set<String> set = new HashSet<>();
        for (int[] obs : obstacles) {
            set.add(obs[0] + "," + obs[1]);
        }

        int x = 0, y = 0;
        int dx = 0, dy = 1;

        int maxDist = 0;

        for (int cmd : commands) {

            if (cmd == -2) {
                int temp = dx;
                dx = -dy;
                dy = temp;

            } else if (cmd == -1) {
                int temp = dx;
                dx = dy;
                dy = -temp;

            } else {
                for (int i = 0; i < cmd; i++) {

                    int nx = x + dx;
                    int ny = y + dy;

                    if (set.contains(nx + "," + ny)) break;

                    x = nx;
                    y = ny;

                    maxDist = Math.max(maxDist, x * x + y * y);
                }
            }
        }

        return maxDist;
    }
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input commands
        int n = sc.nextInt();
        int[] commands = new int[n];
        for (int i = 0; i < n; i++) {
            commands[i] = sc.nextInt();
        }

        // Input obstacles
        int m = sc.nextInt();
        int[][] obstacles = new int[m][2];
        for (int i = 0; i < m; i++) {
            obstacles[i][0] = sc.nextInt();
            obstacles[i][1] = sc.nextInt();
        }

        System.out.println(robotSim(commands, obstacles));
    }
}