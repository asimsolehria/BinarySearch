
package binarysearch;


public class BinarySearch {
    
    public int binarySearch(int array[] , int value)
    {
        int start=0;
        int end=array.length-1;
        int foundIndex=-1;
        
        while(start<end)
        {
            int mid=(start+end)/2;
            if(array[mid]==value)
            {
                foundIndex=mid;
                break;
            }
            
            else if(value<array[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        return foundIndex;
        
    }
}
