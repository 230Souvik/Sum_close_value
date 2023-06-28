
package sum_close_value;
import java.util.*;
import java.lang.*;


public class Sum_close_value {
public void compare(int ar1[], int ar2[], int m, int n, int x){
     int diff = Integer.MAX_VALUE;
 
        // res_l and res_r are result indexes from ar1[] and ar2[]
        // respectively
        int res_l = 0, res_r = 0;
 
        // Start from left side of ar1[] and right side of ar2[]
        int l = 0, r = n-1;
        while (l<m && r>=0)
        {
           // If this pair is closer to x than the previously
           // found closest, then update res_l, res_r and diff
           if (Math.abs(ar1[l] + ar2[r] - x) < diff)
           {
               res_l = l;
               res_r = r;
               diff = Math.abs(ar1[l] + ar2[r] - x);
           }
 
           // If sum of this pair is more than x, move to smaller
           // side
           if (ar1[l] + ar2[r] > x)
               r--;
           else  // move to the greater side
               l++;
        }
 
        // Print the result
        System.out.print("The closest pair is [" + ar1[res_l] +
                         ", " + ar2[res_r] + "]");
    }


  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("size of 1st array");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("element of array");
        for(int i=0;i<size;i++)
            a[i]=sc.nextInt();
        
        System.out.println("size of 2nd array");
        int size2=sc.nextInt();
        int b[]=new int[size2];
        System.out.println("element of array");
        for(int i=0;i<size2;i++)
            b[i]=sc.nextInt();
        
        System.out.println("enter value");
        int x=sc.nextInt();
        Sum_close_value s=new Sum_close_value();
        s.compare(a,b,size,size2, x);
    }
    
}
