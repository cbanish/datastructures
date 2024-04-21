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

    public void print(){
        for(int i=0; i<count;i++){
            System.out.println(items[i]);
        }
    }

    public static void main(String a[]){

        DynamicArray array= new DynamicArray(3);
        array.insert(10);
        array.insert(20);
        array.print();
    }
}
