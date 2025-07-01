import java.util.*;
public class Problem1_Maximum_Length_of_pair_chain {
    public static int findLongestChain(int[][] pairs) {
       Arrays.sort(pairs,Comparator.comparingInt(p->p[1]));
       System.out.println(Arrays.deepToString(pairs));
       int count=1;
       int last=pairs[0][1]; 
      for(int i=1;i<pairs.length;i++){
          if(pairs[i][0]>last){
            count++;
            last=pairs[i][1];
          }
          
      }
       return count;
       
    }
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int pairs[][] = new int[m][2] ;
        for(int i=0;i<m;i++){
            pairs[i][0] = sc.nextInt();
            pairs[i][1] = sc.nextInt();
        }
        System.out.println("Maximum Length of Pair Chain: " + findLongestChain(pairs));
    }
}