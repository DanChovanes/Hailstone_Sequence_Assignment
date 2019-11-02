//Dan Chovanes
//with help provided from Uncle Google, just like the rest of the class.

import java.util.ArrayList;

public class Hailstone {

    private ArrayList<Long> sequence = new ArrayList<>();

    public ArrayList<Long> getSequence() {return sequence;}

    Hailstone(long n) {hailstoneRecursion(n);}

    private ArrayList<Long> hailstoneRecursion(long n) {

        sequence.add(n);
        long next;

        if ( n <= 0 ) {n = 1;}

        if ( n == 1 ) {return sequence;}

        if ( n%2 == 0 ) {next = n / 2;}

        else {next = 3*n + 1;}

        if (next != 1) {hailstoneRecursion(next);}

        else {sequence.add((long) 1);}

        return sequence;
    }
}