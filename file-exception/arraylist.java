import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        // to store integer use uppercase Integer Float String Boolean
        //ArrayList<Float> list = new ArrayList<>();
        //ArrayList<Boolean> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>(); //list of array integers
        //HashMap<Integer,String> = new Hashmap<>();

        // add elements in hashmap
        // to add elements => map.put(1."Apple");
        //to get elements => map.get(1);
        //to delete elements => map.remove(1);

        // add elements
        list.add(0);
        list.add(4);
        list.add(2);
        System.out.println(list);

        // get elements using index
        int elements = list.get(1);
        System.out.println(elements);

        //adding elements in b/w the elements
        list.add(1, 1);
        System.out.println(list);

        //to change the element in index
        list.set(0, 5);
        System.out.println(list);

        //to delete element
        list.remove(3);
        System.out.println(list);

        //to get siae
        int size = list.size();
        System.out.println(size);

        //loops
        for(int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i));
        }

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
