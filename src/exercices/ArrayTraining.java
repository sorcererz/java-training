
public class ArrayTraining {

    /**
     * @param n size of the array, eg: 3
     * @return an empty int array of size n, eg: {0, 0, 0}
     */
    public int[] emptyIntArray(int n) {
        int[] intArray = new int[n];
        return intArray ;
    }

    /**
     * @param n size of the array, eg: 2
     * @return an empty String array of size n, eg: {null, null}
     */
    public String[] emptyStringArray(int n) {
        String[] strArray = new String[n];
        return strArray;
    }

    /**
     * @param a first value, eg: 3
     * @param b second value, eg: 2
     * @param c third value, eg: 1
     * @return an int array with a, b and c values, eg: {3, 2, 1}
     */
    public int[] intArray(int a, int b, int c) {
        int[] intArray = new int[] {a, b, c};
        return intArray;
    }

    /**
     * @param a first value, eg: "test"
     * @param b second value, eg: "sample"
     * @param c third value, eg: "value"
     * @return an int array with a, b and c values,
     * eg: {"test", sample", "value"}
     */
    public String[] stringArray(String a, String b, String c) {
        String[] strArray = new String[] {a, b, c};
        return strArray;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return length of the array, eg: 1
     */
    public int length(int[] array) {

        return array.length;
    }

    /**
     * @param array, eg: {3, 2, 1}
     * @return first value of the array, eg: 3
     */
    public int firstValue(int[] array) {

        return array[0];
    }

    /**
     * @param array, eg: {3, 2, 1}
     * @return last value of the array, eg: 1
     */
    public int lastValue(int[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array,    eg: {3, 2, 1}
     * @param position, eg: 1
     * @return value of the array at position, eg: 2
     */
    public int valueAtPosition(int[] array, int position) {

        return array[position];
    }

    /**
     * @param array,    eg: {3, 8, 5}
     * @param value,    eg: 4
     * @param position, eg: 1
     * @return the array with the value replaced at position, eg: {3, 4, 5}
     */
    public int[] replace(int[] array, int value, int position) {
        array[position] = value;
        return array;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return sum of values of the array, eg: 6
     */
    public int sum(int[] array) {
        int sumOfArray = 0;
        for (int i = 0; i < array.length; i++) {
          sumOfArray += array[i];
        }
        return sumOfArray;
    }

    /**
     * @param array,  eg: {1, 2, 3}
     * @param search, eg: 2
     * @return if array contains searched value, eg: true
     */
    public boolean contains(int[] array, int search) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == search){
              result = true;
              break;
            }
        }
        return result;
    }

    /**
     * @param array, eg: {"sample", "value"}
     * @return array where all words are capitalized, eg: {"Sample", "Value"}
     */
    public String[] capitalize(String[] array) {
        String[] array2 = new String[array.length];
        for(int i = 0; i < array.length; i++) {
            array2[i] = array[i].substring(0, 1).toUpperCase() + array[i].substring(1);
        }
        return array2;
    }

    /**
     * @param first,  eg: {1, 2, 3}
     * @param second, eg: {3, 2, 1}
     * @return if values in first and second arrays, in the same position,
     * are equals, eg: false
     */
    public boolean equals(int[] first, int[] second) {
        boolean result = false;
        for (int i = 0; i < first.length; i++) {
            if(first[i] == second[i]){
              result = true;
              break;
            }
        }
        return result;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return array with reversed values, eg: {3, 2, 1}
     */
    public int[] reverse(int[] array) {
        /*loop swaps the array's first element with last element,
        second element with last second element and so on*/
        int t;
        for(int i = 0; i < array.length / 2; i++) {
            t = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = t;
        }
        return array;
    }

    /**
     * @param first,  eg: {1, 2, 3}
     * @param second, eg: {4, 5}
     * @return concatenates first and second values in one array,
     * eg: {1, 2, 3, 4, 5}
     */
    public int[] concat(int[] first, int[] second) {
        int[] concatArray = new int[first.length + second.length];
        int indexArray = first.length;
        for(int i = 0; i < first.length; i++) {
            concatArray[i] = first[i];
        }
        for(int i = 0; i < second.length; i++) {
            concatArray[i + indexArray] = second[i];
        }

        return concatArray;
    }
}
