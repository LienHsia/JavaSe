package threadtest;



/**
 *例子：创建三个窗口同时售卖100张票 使用实现Runnable接口的方式
 */
class Window1 implements Runnable{
    private int ticket=100;//设置ticket为100

    @Override
    public void run() {
        while(true){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+":"+ticket);
                ticket--;
            }else{
                break;
            }
        }
    }
}
public class TestDemo73{
    public static void main(String[] args) {
        Window1 w = new Window1();
       Thread t1 = new Thread(w);
       Thread t2 = new Thread(w);
       Thread t3 = new Thread(w);

       t1.setName("窗口一");
       t2.setName("窗口二");
       t3.setName("窗口三");

        //虽然解决了多窗口售卖问题，但是还是会出现三个窗口同时买一张票的问题
        t1.start();
        t2.start();
        t3.start();
    }
}

