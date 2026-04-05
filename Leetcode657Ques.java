public class Leetcode657Ques {

    public static boolean isAtOrigin(String moves) {
        int x = 0, y = 0;

        for (char move : moves.toCharArray()) {
            if (move == 'U') y++;
            else if (move == 'D') y--;
            else if (move == 'R') x++;
            else if (move == 'L') x--;
        }

        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        String input = "UD";
        System.out.println(isAtOrigin(input)); // true
    }
}