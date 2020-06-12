package ro.carti.orfane.bookmanager.playground.amazon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Houses {

    public static void main(String[] args) {
        Houses houses = new Houses();

        int[] initStates = {0, 0, 0, 0, 1, 0, 1, 0};
        List<Integer> integers = houses.cellCompete(initStates, 4);
        System.out.println(integers);
    }


    public List<Integer> cellCompete(int[] states, int days) {

        for (int i = 0; i < days; i++) {
            states = computeOneDay(states);
//            System.out.println("i=" + i + Arrays.toString(states));
        }

        return Arrays.stream(states).boxed().collect(Collectors.toList());
    }

    public int[] computeOneDay(int[] states) {
        int[] states2 = new int[8];
        states2[0] = states[1];
        states2[states.length - 1] = states[states.length - 2];
        for (int i = 1; i < states.length - 1; i++) {
            states2[i] = states[i - 1] ^ states[i + 1];
        }
        return states2;
    }
}
