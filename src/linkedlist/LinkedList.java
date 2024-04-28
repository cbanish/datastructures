package linkedlist;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item){
        var node =new Node(item);
        if(isEmpty()){
            first= last = node;
        }else{
            node.next =first;
            first = node;
        }
        size++;
    }

    public void removeFirst(){
        var second =first.next;
        first.next =null;
        first =second;
        size--;
    }

    public int indexOf(int item){
        int index=0;
        var current = first;
        while(current !=null){
            if(current.value ==item) return index;
            current= current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        if(indexOf(item) !=-1) return true;
        return false;
    }

    private boolean isEmpty(){
        return first==null;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        var current =first;
        int index=0;
        while(current !=null){
            array[index]=current.value;
            index++;
            current =current.next;
        }
        return array;
    }

    public void reverse(int[] array){
        for (int i= size-1; i>=0;i--){
            first.value = array[i];
            
        }
    }

    public static void main(String a[]) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        System.out.println(linkedList.indexOf(30));
        System.out.println(linkedList.contains(40));
       // linkedList.removeFirst();
        int[] listArray =linkedList.toArray();


    }

}
