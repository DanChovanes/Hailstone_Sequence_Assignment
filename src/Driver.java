//Dan Chovanes
//with help provided from Uncle Google, just like the rest of the class.

import java.util.*;
import java.io.*;

public class Driver
{
    private ArrayList<ArrayList<Long>> hailstoneList = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {

        Driver thingy = new Driver();
        Scanner scannyMcScanFace = new Scanner(System.in);

        System.out.println("Enter a really big number: ");
        int num = scannyMcScanFace.nextInt();
        int max = 0;
        int index = 0;

        for(int i=0; i <= num; i++) {
            Hailstone hail = new Hailstone((long) i);
            if (i != 0)
                thingy.hailstoneList.add(hail.getSequence());
        }

        for (int i=0; i < thingy.hailstoneList.size(); i++) {

            int temp = thingy.hailstoneList.get(i).size();
            if (temp > max) {
                max = temp;
                index = i;
            }
        }

        System.out.println("The longest recorded hailstone sequence was, assuming this even works, " + max + " starting with " + (index + 1));
        thingy.Display(thingy.hailstoneList.get(index));
        scannyMcScanFace.close();
    }

    public void Display(ArrayList<Long> list) {
        if (! list.isEmpty()) {
            System.out.println(list.remove(0).toString());
            Display(list);
        }
    }
}