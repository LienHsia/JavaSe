
public class findMin {
    
  public static int getMin(int[]arr,int low,int high){
      if(low > high) return arr[0];//如果选择个数为0，即没有旋转，单独处理，返回头元素
      if(low == high) return arr[low];
      int mid = low+((high - low) >>1);//这样运算防止溢出
      if(arr[mid-1] >arr[mid])return arr[mid];
      else if(arr[mid] > arr[mid+1]) return arr[mid+1];
      else if(arr[mid] <arr[high] ) return getMin(arr,low,mid-1);
     else if(arr[mid]>arr[low]) return getMin(arr,mid+1,high);
      else return Math.min(getMin(arr,low,mid-1),getMin(arr,mid+1,high));//arr[low]==arr[mid] 且 arr[high]==arr[mid]
  }
  public static int getMin(int[]arr){
      if(arr == null){
          System.out.println("参数不合法！");
          return -1;
      }
      return getMin(arr,0,arr.length-1);
  }

    public static void main(String[] args) {
        int arr[] = {2,2,2,2,2,1,2};
      int mii =   getMin(arr);
        System.out.println(mii);

    }
}
