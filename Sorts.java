import java.util.Arrays;
public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int n = data.length;
    boolean noswap = true;
    while(noswap){
      for (int i = 0; i<n-1;i++){
        int temp = 0;
        if (data[i]>data[i+1]){
          temp = data[i];
          data[i]=data[i+1];
          data[i+1]=temp;
          noswap = false;
        }
      }
      n--;
      if (noswap){
        break;
      }
      noswap = true;
    }
    //System.out.println(Arrays.toString(data));////Only for debug purposes. Get rid of
  }

  public static void selectionSort(int [] data){
    if (data.length >0){
      int min = data[0];
      int index = 0;
      for (int i = 0; i < data.length; i++){
        min = data[i];
        index = i;
        for (int k = i+1; k<data.length; k++){
          if (data[k]<min){
            min=data[k];
            index = k;
          }
        }
        int temp = data[i];
        data[i]=min;
        data[index]= temp;
      }
      //System.out.println(Arrays.toString(data));
    }
  }
}
