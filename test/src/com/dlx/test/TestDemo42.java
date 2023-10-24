
import java.util.Scanner;
 
public class TestDemo42 {
    /*
     * 古典问题：有一对兔子，
     * 从出生后第3 个月起每个月都生一对兔子，
     * 小兔 子长到第三个月后每个月又生一对兔子，
     * 假如兔子都不死，
     * 问每个月的兔子总数 为多少？ */
    public int rubbit(int mon){
        if(mon<=2){
            return 1;
        }
        else{
            return rubbit(mon-1)+rubbit(mon-2);
        }
    }
    public static void main(String[] args) {
        int r=1;
        int rr=1;
        int rrr=1;
        System.out.println("方法一：");
        for(int a=1;a<=12;a++){
            //12个月
            if(a<=2){
                r=1;
            }
            else{
                //当前月等于前两个月之和
                r=rr+rrr;
                rrr=rr;
                rr=r;
            }
            System.out.println(r*2);
        }
        System.out.println("方法二,求指定月份的兔子数量：");
        HomeWork19 jisuan=new  HomeWork19();
        System.out.println("请输入月份：");
        Scanner sc=new Scanner(System.in);
        int yue=sc.nextInt();
        System.out.println(yue+"月份的兔子数量是"+(jisuan.rubbit(yue))*2);
    }
}