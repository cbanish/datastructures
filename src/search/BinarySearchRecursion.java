package search;

public class BinarySearchRecursion {
    public int binarySearch(int[] array, int target){
        return binarySearchRec(array,target,0,array.length-1);
    }

    private int binarySearchRec(int[] a, int target, int left, int right){
        if(right <left)
            return -1;
        int middle =(left+right)/2;
        if(a[middle]==target)
            return middle;
        if(target<a[middle]){
            return binarySearchRec(a,target,left,middle-1);
        }
        if(target>a[middle]){
            return binarySearchRec(a,target,middle+1,right);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers={1,3,5,7,8};
        var search=new BinarySearchRecursion();
        var index=search.binarySearch(numbers,7);
        System.out.println("Index of search is "+index);
    }
}
