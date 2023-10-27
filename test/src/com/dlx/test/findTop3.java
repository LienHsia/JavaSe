
public class findTop3 {
    //最大的前三个数
    public static void Test(int arr[]){
        int r1,r2,r3,temp;
        r1 = r2 = r3 = Integer.MIN_VALUE;
        if(arr == null || arr.length < 3){
            System.out.println("参数不合法");
            return;
        }
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > r1) {
              r3 = r2;//如果arr[i]比最大的更大，则更新，将上一个最大的赋给次大的
              r2 = r1;

                r1 = arr[i];
            }
            else if(arr[i] > r2 && arr[i] != r1)
            {
                r3 = r2;
                r2 = arr[i];
            }
            else if(arr[i] > r3 && arr[i] != r2)
            {
                r3 = arr[i];
            }
        }
        System.out.println("前三名："+r1+" "+r2+" "+r3);
    }

    public static void main(String[] args) {
        int arr[] = {4,7,9,2,3,0};
        Test(arr);
    }
}
