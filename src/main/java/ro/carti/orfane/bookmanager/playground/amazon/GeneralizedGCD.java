package ro.carti.orfane.bookmanager.playground.amazon;

import java.util.Arrays;
import java.util.Optional;

public class GeneralizedGCD {

    public static void main(String[] args) {
        GeneralizedGCD solution = new GeneralizedGCD();

    }

    public int generalizedGCD(int num, int[] arr)
    {
        Optional<Integer> reduce = Arrays.stream(arr).boxed().reduce(GeneralizedGCD::gcd);
        int gcd =arr[0];
        for (int i = 1; i < num; i++) {
            gcd = gcd(gcd, arr[i]);
        }
        return gcd;
    }

    public static int gcd(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

}
