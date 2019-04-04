/*
* testSelectionSort.java
*
* To change this template, choose Tools | Template Manager
* and open the template in the editor.
*/
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
   public testSelectionSort() {
   }
   public void testPositive(){
       int[] arr = new int[5];
       arr[0] = 8;
       arr[1] = 9;
       arr[2] = 7;
       arr[3] = 10;
       arr[4] = 2;
       int[] Sortedarr = new int[5];
       Sortedarr[0] = 2;
       Sortedarr[1] = 7;
       Sortedarr[2] = 8;
       Sortedarr[3] = 9;
       Sortedarr[4] = 10;
       /** add tests to check for this unit test **/

       SelectionSort testSort = new SelectionSort();

       arr = testSort.basicSelectionSort(arr);

       for(int i = 0; i < 4; i++){

    	   assertEquals("Test Passed", Sortedarr[i],arr[i]);

       }

   }
   public void testNegative(){
	   int[] arr = new int[5];
       arr[0] = -7;
       arr[1] = -9;
       arr[2] = -10;
       arr[3] = -1;
       arr[4] = -4;
       int[] Sortedarr = new int[5];
       Sortedarr[0] = -10;
       Sortedarr[1] = -9;
       Sortedarr[2] = -7;
       Sortedarr[3] = -4;
       Sortedarr[4] = -1;
       /** Test data contains negative values only **/

       SelectionSort testSort = new SelectionSort();

       arr = testSort.basicSelectionSort(arr);

       for(int i = 0; i < 4; i++){

    	   assertEquals("Test Passed", Sortedarr[i],arr[i]);

       }

   }
   public void testMixed(){
	   int[] arr = new int[5];
       arr[0] = 4;
       arr[1] = -6;
       arr[2] = 0;
       arr[3] = -8;
       arr[4] = 9;
       int[] Sortedarr = new int[5];
       Sortedarr[0] = -8;
       Sortedarr[1] = -6;
       Sortedarr[2] = 0;
       Sortedarr[3] = 4;
       Sortedarr[4] = 9;
       /** Test data contains with both positive, negative and zeros **/

       SelectionSort testSort = new SelectionSort();

       arr = testSort.basicSelectionSort(arr);

       for(int i = 0; i < 4; i++){

    	   assertEquals("Test Passed", Sortedarr[i],arr[i]);

       }

       System.out.println("Mixed test passed");

   }
   public void testDuplicates(){
	   int[] arr = new int[5];
       arr[0] = 2;
       arr[1] = 9;
       arr[2] = 2;
       arr[3] = 10;
       arr[4] = 2;
       int[] Sortedarr = new int[5];
       Sortedarr[0] = 2;
       Sortedarr[1] = 2;
       Sortedarr[2] = 2;
       Sortedarr[3] = 9;
       Sortedarr[4] = 10;
       /** Test data contains duplicates **/

       SelectionSort testSort = new SelectionSort();

       arr = testSort.basicSelectionSort(arr);

       for(int i = 0; i < 4; i++){

    	   assertEquals("Test Passed", Sortedarr[i],arr[i]);

       }

       System.out.println("Duplicates test passed");

   }
}
