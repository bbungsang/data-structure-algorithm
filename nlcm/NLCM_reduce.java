import java.util.Arrays;

class NLCM_reduce {
    public long nlcm(long[] num) {
        return Arrays.stream(num).reduce((x, y) -> (long)Math.floor((x*y)/get_gcd(x,y))).getAsLong();
    }
    public long get_gcd(long x, long y) {
        long temp;
        do {
            temp = x % y;
            x = y;
            y = temp;
        } while(y > 0);
        return x;
    }
    public static void main(String[] args) {
        NLCM c = new NLCM();
        int[] ex1 = { 2, 6, 8, 14 };
        System.out.println(c.nlcm(ex1));
        // 출력값: 168
        int[] ex2 = { 12, 94, 93, 76, 96, 62, 77, 58, 95, 79 };
        System.out.println(c.nlcm(ex2));
        // 출력값: 2344067990880
    }
}
