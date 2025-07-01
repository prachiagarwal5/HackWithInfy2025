import java.util.*;
public class Problem2_Maximum_units_on_truck {
   
    public static int maximumUnits(int[][] box, int truckSize) {
        Arrays.sort(box,(a,b)->b[1]-a[1]);
        int quan=0;
        for (int[] box1 : box) {
            if (truckSize>0) {
                if (truckSize >= box1[0]) {
                    quan += (box1[0] * box1[1]);
                } else {
                    quan += box1[1] * (truckSize);
                }
                truckSize -= box1[0];
            }
        }
        return quan;
    
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[][] boxTypes = new int[m][2];
        for (int i = 0; i < m; i++) {
            boxTypes[i][0] = sc.nextInt();
            boxTypes[i][1] = sc.nextInt();
        }
        int truckSize = sc.nextInt();
        System.out.println("Maximum Units on Truck: " + maximumUnits(boxTypes, truckSize));
    }
}