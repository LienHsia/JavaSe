
/**
创建三个窗口同时售卖100张票  使用继承Thread类的方式
 */
class Window extends Thread{
    private static int ticket=100;//设置ticket为静态变量  所有对象的票都是它

    @Override
    public void run() {
        while(true){
            if(ticket>0){
                System.out.println(getName()+":"+ticket);
                ticket--;
            }
        }
    }
}
public class TestDemo72 {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        //虽然解决了多窗口售卖问题，但是还是会出现三个窗口同时买一张票的问题
        w1.start();
        w2.start();
        w3.start();
    }
}

