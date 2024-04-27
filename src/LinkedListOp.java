import java.util.LinkedList;

public class LinkedListOp {
    public static void main(String a[]){
        LinkedList<Integer> list= new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.contains(10));
        System.out.println(list);
    }
}
