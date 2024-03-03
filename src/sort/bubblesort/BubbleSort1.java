package sort.bubblesort;

import java.util.Arrays;

public class BubbleSort1 {
    /*  버블 정렬은 다음과 같은 순서로 이루어진다.
      1. 나란히 위치한 두 요소(0번 인덱스, 1번 인덱스)를 비교하여 정렬한다.
      2. 다음 순서의 두 요소(1번 인덱스, 2번 인덱스)를 비교하여 정렬한다.
      3. 위와 같이 마지막 요소까지 비교하여 절렬한다.
      4. 3번에서 정렬된 마지막 요소는 이제부터 비교 대상에서 제외된다.
      5. 1~4번을 반복한다.
      */
    public static void main(String[] args) {
        int[] arr = {7,5,23,4,7,8,1,2,5,6,8,3,1,45,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]>arr[j]){
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }


}
