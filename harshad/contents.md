# 하샤드수
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.

harshad 함수는 양의 정수 n을 매개변수로 입력받습니다. 이 n이 하샤드수인지 아닌지 판단하는 함수를 완성하세요. 예를 들어 n이 10, 12, 18이면 True를 리턴 11, 13이면 False를 리턴하면 됩니다.

### 내 풀이

[파이썬]

```python
from functools import reduce


def Harshad(n):
    return n % reduce(lambda x, y: x + y, [int(i) for i in str(n)]) == 0

# 실행을 위한 코드입니다.
print(Harshad(18))
```

[자바]

```java
public class HarshadNumber{
    public boolean isHarshad(int num){
        String str_num = Integer.toString(num);
        String[] num_arr = str_num.split("");
        int sum_num = 0;
        for(int i=0; i<num_arr.length; i++){
            sum_num += Integer.parseInt(num_arr[i]);
        }
        return num % sum_num == 0;
    }
	
    public static void  main(String[] args){
        HarshadNumber sn = new HarshadNumber();
        System.out.println(sn.isHarshad(11));
    }
}
```

### 다른 사람 풀이

[파이썬]

```python
def Harshad(n):
    return n % sum(int(x) for x in str(n)) == 0
```

[자바]

```java
public class HarshadNumber{
    public boolean isHarshad(int num){
        int sum=0;
        int temp=num;
        do{
            sum+=temp%10;
            temp/=10;
        }while(temp%10>0);
            return num%sum==0;
    }

    public static void  main(String[] args){
        HarshadNumber sn = new HarshadNumber();
        System.out.println(sn.isHarshad(110));
    }
}
```