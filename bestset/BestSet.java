import java.util.Arrays;

public class BestSet {
    public int[] bestSet(int n, int s) {
        int[] result = new int[n];
        if(n > s) {
            result[0] = -1;
            return result;
        }
        for(int i=0; i<n; i++) {
            result[i] = (int)Math.floor(s/n);
            if(i>n-s%n-1) {
                result[i] = (int)Math.floor(s/n)+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        BestSet bs = new BestSet();
        System.out.println(Arrays.toString(bs.bestSet(3, 14)));
    }
}
