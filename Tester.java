import java.util.Arrays;
import java.util.Random;
public class Tester{
  public static void main(String[]args){
    // int[] data = new int[]{1,2,3,4,5};
    // Sorts.bubbleSort(data);
    // Good so far
    // int[] data2 = new int[]{5,4,3,2,1};
    // Sorts.bubbleSort(data2);
    // int[] data3 = new int[]{1,4,3,2,5};
    // Sorts.bubbleSort(data3);
    // int[] data4 = new int[]{3,3,3,3,3};
    // Sorts.bubbleSort(data4);
    Random rng = new Random(2359583);
    Random rng2 = new Random(84837);
    rng = new Random();//seed of 100 is stored.
    rng2 = new Random();
    int temp = 0;
    int temp2= 0;
    while (true){
      temp2 = (rng2.nextInt() % 1000);
      if (temp2>0){
        temp = temp2;
        break;
      }
    }
    int[] Ultimate = new int[temp2];
    for(int i =  0; i < temp2; i++ ){
      Ultimate[i]=rng.nextInt()%1000;
    }
    Sorts.bubbleSort(Ultimate);
    for (int i = 0; i < Ultimate.length-1; i++){
      if (Ultimate[i]>Ultimate[i+1]){
        System.out.println("FALSE");
      }
    }
    System.out.println("TRUE");
  }
}
