package arraylist;

import java.util.ArrayList;

public class Numuneler {
    public static void main(String[] args) {
        ArrayList<String> heyvanlar=new ArrayList<>();
        heyvanlar.add("Pisik");
        heyvanlar.add("It");
        heyvanlar.add("Qoyun");
        System.out.println(heyvanlar);
        heyvanlar.remove("It");
        System.out.println(heyvanlar);
        heyvanlar.clear();
        System.out.println(heyvanlar);
        System.out.println(heyvanlar.isEmpty());

    }
}
