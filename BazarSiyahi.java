package map;

import java.util.HashMap;

public class BazarSiyahi {

    public static void main(String[] args) {


        HashMap<String, Double> hashMapSebet = new HashMap<>();

        hashMapSebet.put("Banan", 2.50);
        hashMapSebet.put("Alma", 1.20);
        hashMapSebet.put("Portagal", 3.00);
        hashMapSebet.put("Ciyelek", 5.50);

        System.out.println("Hasmhmap neticesi : " + hashMapSebet);
    }


}
