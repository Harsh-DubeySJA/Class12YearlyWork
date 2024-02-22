import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;

public class RearrangeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        int[] inputArray = new int[N];
        System.out.println("Enter " +  N + " numbers: ");
        for (int i = 0; i < N; i++) {
            inputArray[i] = sc.nextInt();
        }
        reArrangeArray(inputArray);
        System.out.println("OUTPUT: " + Arrays.toString(inputArray));
        sc.close();
    }

    public static void reArrangeArray(int[] inputArray) {
        int leftPointer;
        int rightPointer;
        leftPointer = 0;
        rightPointer = inputArray.length - 1;
        for (int i = 0, minIndex = 0, length = inputArray.length; i < length; i++) {
            minIndex = leftPointer;
            for (int j = leftPointer; j <= rightPointer; j++) {
                if (inputArray[j] < inputArray[minIndex]) {
                    minIndex = j;
                }
            }
            // left
            int temp;
            if ((i & 1) == 0) {
                temp = inputArray[leftPointer];
                inputArray[leftPointer++] = inputArray[minIndex];
            } else {
                // right
                temp = inputArray[rightPointer];
                inputArray[rightPointer--] = inputArray[minIndex];
            }
            inputArray[minIndex] = temp;
        }
    }
    /**
    @Deprecated
    private static void reArrangeArray(int[] inputArray) {
        int leftPointer, rightPointer;
        leftPointer = 0;
        rightPointer = inputArray.length - 1;
        AtomicInteger index = new AtomicInteger();
        BiFunction<HashMap<Integer, Integer>, Integer, Integer> smallestNumber = (map, smallestNum) -> {
            index.set(Integer.parseInt(map.keySet().toArray()[0].toString()));
            for (int j = index.get(), length = map.get(j); j <= length; j++) {
                if (inputArray[j] < smallestNum) {
                    smallestNum = inputArray[j];
                    index.set(j);
                }
            }
            return smallestNum;
        };
        for (int i = 0, half = inputArray.length >> 1; i < half; i++) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            hashMap.put(i, rightPointer);
            int smallest = inputArray[i];
            smallest = smallestNumber.apply(hashMap, smallest);
            int temp = inputArray[leftPointer];
            inputArray[leftPointer++] = inputArray[index.get()];
            inputArray[index.get()] = temp;
            hashMap.put(i+1, hashMap.remove(i));
            smallest = inputArray[i+1];
            smallest = smallestNumber.apply(hashMap, smallest);
            temp = inputArray[rightPointer];
            inputArray[rightPointer--] = inputArray[index.get()];
            inputArray[index.get()] = temp;
        }
    }
    */
}
