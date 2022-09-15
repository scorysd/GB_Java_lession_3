
// Написать программу, показывающую последовательность действий для игры “Ханойская башня”
public class Task3 {
    public static void move(char pos1, char pos2) {
        System.out.print(pos1 + "==>" + pos2 + " ");
        System.out.println(); 
    }

    public static void hanoi(int n, char pos1, char pos2, char pos3) {
        if (n == 1) {
            move(pos1, pos3);
        } else {
            hanoi(n - 1, pos1, pos3, pos2);
            move(pos1, pos3);
            hanoi(n - 1, pos2, pos1, pos3);
        }
    }

    public static void main(String[] args) {
        hanoi(4, 'A', 'B', 'C');
    }
}
