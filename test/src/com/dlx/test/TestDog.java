package com.dlx.test;

public class TestDog {
    public static void main(String[] args) {
        //5.1创建Dog类的第1个对象
        Dog d1 = new Dog();
        //5.2修改d1对象的属性值
        d1.setName("哮天犬");
        d1.setAge(999);
        d1.setKind("猎狗");
        d1.setHost("二郎神");
        d1.setPrice(10000);
        //5.3打印查看d1对象的属性值
        System.out.println(d1.getName());
        System.out.println(d1.getAge());
        System.out.println(d1.getKind());
        System.out.println(d1.getHost());
        System.out.println(d1.getPrice());

        //6.1创建Dog类的第2个对象
        Dog d2 = new Dog();
        //6.2修改d2对象的属性值
        d2.setName("罗小黑");
        d2.setAge(5);
        d2.setKind("神奇犬");
        d2.setHost("大自然");
        d2.setPrice(999.99);
        //6.3打印查看d2对象的属性值
        System.out.println(d2.getName());
        System.out.println(d2.getAge());
        System.out.println(d2.getKind());
        System.out.println(d2.getHost());
        System.out.println(d2.getPrice());

        //7.调用dog类的5个方法
        d1.run();
        d1.eat(5);
        d1.sleep(8.8);
        //方式一：只调用play()的功能
        d1.play(d1.getHost());
        //方式二：不仅调用play()的功能还接收了返回值飞盘交给r保存
        String r = d1.play(d1.getHost());
        System.out.println(r);
        //方式三：调用play()的功能，并直接打印了play()的返回值飞盘
        System.out.println(d1.play(d1.getHost()));
    }
}

//1.定义小狗类
class Dog {
    //2.定义5个属性
    //3.1使用private修饰所有的属性
    private String name;//姓名
    private int age;//年龄
    private String kind;//品种
    private String host;//主人
    private double price;//价格

    //4.1添加小狗类功能1
    public void run() {
        System.out.println("小狗Dog跑的老快了~");
    }

    //4.2添加小狗类功能2
    public void eat(int n) {
        System.out.println("小狗今晚要吃" + n + "根肉骨头");
    }

    //4.3添加小狗类的功能3
    public void sleep(double num) {
        System.out.println("小狗今晚睡了" + num + "个小时");
    }

    //4.4添加小狗类的功能4
    public String play(String host) {
        System.out.println("小狗与主人" + host + "玩的很开心");
        bark();//在本类的公共方法中调用被封装的方法的功能
        return "飞盘";
        //bark();//遇到return时已经结束本方法了，return后不可以直接写代码
    }

    //4.5添加小狗类的功能5
    private void bark() {
        System.out.println("小狗喜欢汪汪叫");
    }

    //3.2添加被封装属性的公共的get与set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
