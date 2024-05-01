package JavaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicateElementInArray {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(3);
        al.add(2);
        al.add(4);
        al.add(5);
        al.add(2);
        al.add(6);
        al.add(1);
        al.add(1);
        al.add(5);

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<al.size();i++){
            if(!hs.contains(al.get(i))){
                hs.add(al.get(i));
            }

        }

        System.out.println(al);
        System.out.println(hs);
        al.clear();
        al.addAll(hs);
        System.out.println(al);

    }

}
