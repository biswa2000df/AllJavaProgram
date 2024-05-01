package JavaProgram;

import java.util.ArrayList;

public class ReverseOrder {
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

        for(int i = 0; i<al.size(); i++)
            System.out.print(al.get(i) + " ");
        System.out.println();
        for(int i = al.size()-1; i>0; i--){
            System.out.print(al.get(i) + " ");
        }
    }
}
