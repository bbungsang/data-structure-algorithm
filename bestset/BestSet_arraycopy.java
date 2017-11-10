import java.util.Arrays;

public class BestSet_arraycopy {
    public int[] bestSet(int n, int s) {
        int i;
        int[] ele1 = new int[n-s%n];
        for(i=0; i<n-s%n; i++) {
            ele1[i] = (int)Math.floor(s/n);
        }
        int[] ele2 = new int[s%n];
        for(i=0; i<s%n; i++) {
            ele2[i] = ele1[0]+1;
        }
        int[] result = new int[n];
        System.arraycopy(ele1, 0, result, 0, ele1.length);
        System.arraycopy(ele2, 0, result, ele1.length, ele2.length);
        return result;
    }
    public static void main(String[] args) {
        BestSet_arraycopy bs = new BestSet_arraycopy();
        System.out.println(Arrays.toString(bs.bestSet(3, 13)));
    }
}
