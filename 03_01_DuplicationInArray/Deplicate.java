import java.util.Arrays;

public class Deplicate{

      public int deplicate(int[] data){
            // 调用 java 类进行排序
            // Arrays.sort(data);
            
            quickSort(data);
            // mergeSort(data);
            
            for(int i = 0; i < data.length-1; i ++) 
            {
            
                  if (data[i] == data[i+1]) {
                        return data[i];
                  }
            }
            
            return -1;
            
      }

      // 使用快速排序实现
      private void quickSort(int[] data){

            quickSort(data, 0, data.length-1);
      }

      private void quickSort(int[] data, int l, int h){
            if (l >= h) {
                  return;
            }
            int j = partition(data, l, h);
            quickSort(data, l, j-1);
            quickSort(data, j+1, h);
            
      }

      // 获取轴点元素
      private int partition(int[] data, int l, int h){

            int i = l, j = h + 1;

            while(true) 
            {
            
                  while(less(data[++i], data[l]) && i != h);
                  while(less(data[l], data[--j]) && j != l);
                  if (i >= j) break;
                  swap(data, i, j);
            }
            swap(data, l, j);

            return j;
      }

      private void swap(int[] data, int i, int j){
            int tmp;
            tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
      }

      private boolean less(int i, int j){
            if(i < j) return true;
            return false;
      }

      // 使用归并排序
      private void mergeSort(int[] data){

            mergeSort(data, 0, data.length-1);
      }

      private void mergeSort(int[] data, int l, int h){
            if (l > h) {
                  return;
            }
            int mid = 1 + (h - l) / 2;
            mergeSort(data, l, mid);
            mergeSort(data, mid+1, h);
            merge(data, l, mid, h);
      }

      private void merge(int[] data, int l, int mid, int h){

      }


      public static void main(String[] args) {
            int[] test = new int[]{2, 3, 1, 0, 2, 5, 3};
            int[] test1 = new int[]{2, 3, 1, 0, 5};
            int[] test2 = new int[]{};
            Deplicate deplicate = new Deplicate();
            System.out.println(deplicate.deplicate(test));
            

      }
}