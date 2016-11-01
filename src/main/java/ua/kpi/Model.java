package ua.kpi;

/**
 * Created on 1. November. 16.
 * Demonstrating program logic by working with arrays
 *
 * @author Evgeniy
 */
public class Model {

    /**
     * Constants of min and max value of elements in array
     */
    public static final int MIN = -100;
    public static final int MAX = 100;

    /**
     * Calculate the sum of all elements in array
     * @param array of integers
     * @return sum of elements
     */
    public int findSum(int array[]){
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    /**
     * Find index and value of maximum element of array
     * @param array
     * @return index
     */
    public int findMax(int array[]){
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    /**
     * Find index and value of minimum element of array
     * @param array
     * @return index
     */
    public int findMin(int array[]){
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    /**
     * Find average value of array's elements
     * @param array
     * @return average value
     */
    public double averageValue(int array[]){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    /**
     * Find quantity of elements equal to given
     * @param array
     * @param value
     * @return quantity
     */
    public int quantityElemsEqualToGiven(int array[], double value){
        int quantity = 0;
        for (int element : array) {
            if (element == value){
                quantity++;
            }
        }
        return quantity;
    }
}
