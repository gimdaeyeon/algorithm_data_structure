package sort.selection;

import java.util.Arrays;

public class SelectionSort1 {
    /*
     * 선택 정렬 O(N^2)
     * 맨 앞 인덱스부터 차례대로 들어갈 원소를 선택하여 정렬하는 알고리즘
     * 버블 정렬과 시간복잡도가 같지만, 교환 횟수는 O(n)이기 때문에 조금더 효율적인다.
     *
     * 다음과 같이 진행된다.
     * 1. 모든 요소 중 가장 작은 값을 찾는다.
     * 2. 찾은 값을 가장 왼쪽의 값과 교환한다.
     * 3. 2번에서 교환되 가장 작은 값은 다음 교환에서 제외된다
     * 4. 1~3번을 반복한다.
     */
    public static void main(String[] args) {
        int[] arr = {3, 2, 7, 8, 43, 34, 2, 67, 8, 22, 7, 1, 321, 4, 45, 23};
        selectionsSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionsSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            int tmp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = tmp;
        }
    }
}












