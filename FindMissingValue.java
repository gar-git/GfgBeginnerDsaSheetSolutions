import java.util.*;

class FindMissingValue{
    
    int missingNumber(int v[], int n) {
       int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum ^ i;
        }
        for (int i = 0; i < v.length; i++) {
            sum = sum ^ v[i];
        }
        return sum;
    }
    }
    public static void main(String arp[]){
        FindMissingValue obj= new FindMissingValue();
        
        int array[]={12,13,14,15,16,18,19};
       int d= obj.findMissingValue(array, array.length);
       System.out.println(d);
    }
}
