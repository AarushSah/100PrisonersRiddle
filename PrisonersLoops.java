import java.util.Random;
import java.util.Arrays;

public class PrisonersLoops {

    public static int[] newRoom(int length) {
        int[] room = new int[length];
        for(int i = 0; i < length; i++) {
            room[i] = i;
        }

        Random rd = new Random();
         

        for (int i = length-1; i > 0; i--) {
            int j = rd.nextInt(i+1);
            int temp = room[i];
            room[i] = room[j];
            room[j] = temp;
        }

        return room;
    }

    public static boolean survives(int[] room, int prisoner) {
        

    }

    public static void main(String[] args) {
        int[] room = newRoom();

    }

    
}