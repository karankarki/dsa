package RECURSION;

public class j9_Binary_search {

    public static int B_search(int[] arr,int mid,int start,int end ,int target){

        if(start>=end){
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }
        else if(target<arr[mid]){
        end = mid-1;
        }
        else{
            start  = mid+1;
        }

        return  B_search(arr,(start+end)/2,start,end,target);

    }


    public static void main(String[] args) {
        System.out.println(B_search(new int[] {1,3,8},1,0,3,0 ));
    }

}
