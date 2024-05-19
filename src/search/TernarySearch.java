package search;

public class TernarySearch {
    public int ternarySearch(int[] array, int target){
        return ternarySearch(array,target,0,array.length-1);
    }

    private int ternarySearch(int[] array, int target, int left, int right){
        int partitionSize=(right-left)/3;
        int middle1= (left+partitionSize);
        int middle2=(right-partitionSize);
        if(left>right)
            return -1;

        if(target==array[middle1])
            return middle1;
        if(target==array[middle2])
            return middle2;
        if(target<array[middle1])
            return ternarySearch(array,target,left,middle1-1);
        if(target>array[middle2])
            return ternarySearch(array,target,middle2+1,right);
        return ternarySearch(array,target,middle1+1,middle2-1);
    }

    public static void main(String[] args) {
        int[] numbers={1,3,5,7,8,9};
        var search=new TernarySearch();
        var index=search.ternarySearch(numbers,6);
        System.out.println("Index of search is "+index);
    }
}
