import java.util.*;

class FindMissingValue{
    
    int findMissingValue(int array[], int n){
        Arrays.sort(array);
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for(int d:array){
            arr.add(d);
        }
        
     int  temp=Collections.min(arr);
      arr.clear();
        for(int i=0;i<n;i++){
            
            if(array[i]==temp){
                temp++;
            }
            else if(array[i]!=temp){
                return temp;
            }
        }
        return 0;
    }
    public static void main(String arp[]){
        FindMissingValue obj= new FindMissingValue();
        
        int array[]={12,13,14,15,16,18,19};
       int d= obj.findMissingValue(array, array.length);
       System.out.println(d);
    }
}