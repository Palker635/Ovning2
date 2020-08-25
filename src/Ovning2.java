import javax.swing.*;
import java.util.*;

public class Ovning2 {
    public static void main(String[] args) {
        int dice1;
        int dice2;
        int rolls;

        Random rand = new Random();
        int upperbound = 6;
        int roll1 = rand.nextInt(upperbound);
        roll1++;
        System.out.println(roll1);
        int roll2 = rand.nextInt(upperbound);
        roll2++;
        System.out.println(roll2);

        int total = roll1 + roll2;
        if (total == 2) {

        }
    }
}
