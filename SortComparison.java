// -------------------------------------------------------------------------

/**
 *  This class contains static methods that implementing sorting of an array of numbers
 *  using different sort algorithms.
 *
 *  @author Conn Breathnach
 *  @version HT 2020
 */

 class SortComparison {

    /**
     * Sorts an array of doubles using InsertionSort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order.
     *
     */
    static double [] insertionSort (double a[]){
       double temp;
       for(int i = 0; i < a.length; i++){
          for(int j = i; j > 0; j--){
             if(a[j] < a[j-1]) {
                temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
             }
          }
       }
       return a;
    }
	
	    /**
     * Sorts an array of doubles using Selection Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] selectionSort (double a[]){
       int arraySize = a.length;
       double temp;
       for(int i = 0; i < arraySize-1; i++){
          int min_idx = i;
          for(int j = i+1; j < arraySize; j++){
             if(a[j] < a[min_idx]){
                min_idx = j;
             }
          }
          temp = a[min_idx];
          a[min_idx] = a[i];
          a[i] = temp;
       }
       return a;
    }
    /**
     * Sorts an array of doubles using Quick Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] quickSort (double a[]){
	
		 //todo: implement the sort

    }//end quicksort

    /**
     * Sorts an array of doubles using Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    /**
     * Sorts an array of doubles using iterative implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */

    static double[] mergeSort (double a[]) {

		 double[] auxilaryArray = new double[a.length];
		 int upperIndex = a.length-1;
		 int lowerIndex = 0;
		 sort(a, auxilaryArray, lowerIndex, upperIndex);
	     return a;
    }
   /**
   * Method that recursively splits array in half until each sub array is of size 1, then merges them together
    *
    * @param originalArray: array of unsorted doubles
    * @param auxilaryArray: array to store copy of originalArray
    * @param lowerIndex: lower index of split array
    * @param upperIndex: upper index of split array
    * @return originalArray sorted inplace
   */
   private static void sort(double originalArray[], double auxilaryArray[], int lowerIndex, int upperIndex){
       if(upperIndex <= lowerIndex){
          return;
       }
       int midIndex = lowerIndex + (upperIndex - lowerIndex) / 2;
       sort(originalArray, auxilaryArray, lowerIndex, midIndex);
       sort(originalArray, auxilaryArray, midIndex+1, upperIndex);
       merge(originalArray, auxilaryArray, lowerIndex, midIndex, upperIndex);
   }

   /**
    * @param originalArray: array of unsorted doubles
    * @param auxilaryArray: array to store copy of originalArray
    * @param lowerIndex: lower index of split array
    * @param midIndex: middle index of sorted array
    * @param upperIndex: upper index of split array
    * @return a merged array inplace of originalArray
    */

   private static void merge(double originalArray[], double auxilaryArray[], int lowerIndex, int midIndex, int upperIndex){
      //copy original array into auxilary array
      for(int copyIndex = lowerIndex; copyIndex <= upperIndex; copyIndex++){
         auxilaryArray[copyIndex] = originalArray[copyIndex];
      }
      int i = lowerIndex;
      int j = midIndex+1;
      for(int k = lowerIndex; k<= upperIndex; k++){
         if(i > midIndex){
            originalArray[k] = auxilaryArray[j++];
         }
         else if(j > upperIndex){
            originalArray[k] = auxilaryArray[i++];
         }
         else if(auxilaryArray[j] < auxilaryArray[i])
         {
            originalArray[k] = auxilaryArray[j++];
         }
         else{
            originalArray[k] = auxilaryArray[i++];
         }
      }
   }



   


    public static void main(String[] args) {

        //todo: do experiments as per assignment instructions
    }

 }//end class

