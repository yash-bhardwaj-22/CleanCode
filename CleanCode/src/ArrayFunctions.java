public class ArrayFunctions {
    static class Number {

        int smallest;
        int largest;
    }

    static Number findLargestSmallest(int[] numPool, int poolcount) {
        Number num = new Number();
        int index;

        if (poolcount == 1) {
            num.largest = numPool[0];
            num.smallest = numPool[0];
            return num;
        }

        if (numPool[0] > numPool[1]) {
            num.largest = numPool[0];
            num.smallest = numPool[1];
        } else {
            num.largest = numPool[1];
            num.smallest = numPool[0];
        }

        for (index = 2; index < poolcount; index++) {
            if (numPool[index] > num.largest) {
                num.largest = numPool[index];
            } else if (numPool[index] < num.smallest) {
                num.smallest = numPool[index];
            }
        }

        return num;
    }

    public static void main(String[] args) {
        int[] numPool = {1000, 11, 445, 1, 330, 3000};
        int poolCount = 6;
        Number num = findLargestSmallest(numPool, poolCount);
        System.out.printf("\nSmallest Number is %d", num.smallest);
        System.out.printf("\nLargest Number is %d", num.largest);
    }
}