package JavaProgram;

import java.util.ArrayList;
import java.util.HashSet;

public class PrintDuplicateElementAnArray {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(10);
        al.add(30);
        al.add(30);
        al.add(60);
        al.add(50);
        al.add(90);

        HashSet<Integer> uniqueNumber = new HashSet<>();
        ArrayList<Integer> duplicate = new ArrayList<>();

        for(int i = 0; i<al.size(); i++){
            if(!uniqueNumber.contains(al.get(i))){
                uniqueNumber.add(al.get(i));
            }
            else {
                duplicate.add(al.get(i));
            }
        }

        System.out.println(al);
        System.out.println(uniqueNumber);
        System.out.println(duplicate);

    }

}
