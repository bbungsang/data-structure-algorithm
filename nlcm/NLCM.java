import java.util.Arrays;

// reduce()를 사용x
class NLCM {
    public long nlcm(int[] num) {
        // int[] -> long[] 형변환 람다식
        long[] longNum = Arrays.stream(num).mapToLong(i -> i).toArray();
        for(int i=0; i<longNum.length-1; i++){
            longNum[i+1] = (long)Math.floor((longNum[i]*longNum[i+1]/get_gcd(longNum[i], longNum[i+1])));
        }
        return longNum[longNum.length-1];
    }
    public long get_gcd(long x, long y){
        long temp;
        while(y > 0){
            temp = x%y;
            x = y;
            y = temp;
        }
        return x;
    }
    public static void main(String[] args) {
        NLCM c = new NLCM();
        int[] ex1 = {2,6,8,14};
        System.out.println(c.nlcm(ex1));
        int[] ex2 = {12, 94, 93, 76, 96, 62, 77, 58, 95, 79};
        System.out.println(c.nlcm(ex2));
    }
}
