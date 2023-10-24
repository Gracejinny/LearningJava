package mission;

import java.util.Arrays;

public class Problem {

    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] result1 = power(arr1);
        System.out.println(Arrays.toString(result1));

        int[] arr2 = {58, 172, 746, 89};
        int[] result2 = power(arr2);
        System.out.println(Arrays.toString(result2));

        int[] arr3 = {9, 8, 7};
        int[] result3 = power(arr3);
        System.out.println(Arrays.toString(result3));

        int[] arr4 = {11, 22, 33, 44, 55, 66, 77, 88,99, 1111,2222,333, 4444, 2222,333, 4444 ,2222,333, 4444, 2222,333, 4444, 2222,333, 4444};
        int[] result4 = power(arr4);
        System.out.println(Arrays.toString(result4));
    }

    public static int[] power(int[] arr){
        int length = arr.length;


        if((length & (length-1))==0){
            return arr;
        }

        int target = 1;
        while (target <length){
            target *=2;
        }

        int zeroNums = target - length;

        int[] result = new int[target];
        for (int i = 0; i <length; i++){
            result[i] = arr[i];
        }
        return result;

    }


    /*
     * arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다.
     * 정수 배열 arr이 매개변수로 받고 arr에 최소한의 개수로 0을 추가한 배열을 return 하는 함수를 만들어주세요.
     * ( 단, 이때 함수는 static으로 정의해야합니다. )
     */
    /*
    **해설**

1. 배열 arr의 길이를 확인합니다.
2. 만약 arr의 길이가 이미 2의 정수 거듭제곱이라면, arr 그대로 반환합니다.
3. 만약 arr의 길이가 2의 정수 거듭제곱이 아니라면, 추가해야 하는 0의 개수를 계산합니다.
    1. **이 때, arr 길이에 가장 가까운 거듭제곱 수를 While 문을 통해 구할 수 있습니다.**
4. 계산된 0의 개수를 사용하여 arr 뒤에 해당 개수만큼 0을 추가한 배열을 반환합니다.
    1. int array를 targetLength 만큼 만든 후, 기존 array를 for 문으로 복사합니다.
     */
}
