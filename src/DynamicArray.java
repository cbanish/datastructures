public class DynamicArray
{
    private int[] items;
    private int count;

    public DynamicArray(int length){
        items=new int[length];
    }

    public void insert(int item){
        items[count] =item;
        count++;
    }

    public void removeItemAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count-1; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item){
        for(int i=0;i<count;i++){
            if(items[i]==item){
                return i;
            }
        }
        return -1;
    }

    public void print(){
        for(int i=0; i<count;i++){
            System.out.println(items[i]);
        }
    }

    public static void main(String a[]){

        DynamicArray array= new DynamicArray(4);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        //array.removeItemAt(1);
        array.print();
        System.out.println(array.indexOf(30));
    }
}
