package Hashing;
import java.util.HashSet;
public class hashing_1 {
    public static void main (String args[]) {

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);

        //print all elements
        System.out.println(set);

        //serch elements
        if(set.contains(1)){
             System.out.println("set contains ");
        } 
        if(!set.contains(6)) {
             System.out.println("does not contains ");
        }

        //delete 
        set.remove(1);
        System.out.println( "size of set " + set.size());
       
    }
}
