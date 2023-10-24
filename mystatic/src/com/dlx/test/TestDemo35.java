package com.dlx.test;

public class TestDemo35 {
    public static void main(String[] args) {
        //6.1创建Dog类的第1个对象并进行测试,触发的是无参构造
        Dog d1 = new Dog();//我是Dog类的无参构造
        //d1.age = 7;//不能用这种方式，因为age被封装了，会报错
        d1.run();
        d1.eat();
        //6.2创建Dog类的第2个对象并进行测试,触发的是含参构造
        Dog d2 = new Dog(100);//我是Dog类的含参构造100
        System.out.println(d2.getName());//null
        d2.sleep();
        d2.play();
        //6.3创建Dog类的第3个对象并进行测试，触发的是全参构造
        Dog d3 = new Dog("旺财",6,"柴犬","黄飞鸿",388.8);//我是Dog类的全参构造
        /*打印的都是我们通过全参构造给对象属性设置的值*/
        System.out.println(d3.getName());//旺财
        System.out.println(d3.getAge());//6
        System.out.println(d3.getHost());//黄飞鸿
        System.out.println(d3.getKind());//柴犬
        System.out.println(d3.getPrice());//旺财
        d3.eat();
        d3.sleep();
    }
}
//1.定义Dog类
class Dog{
    //2.定义Dog类的属性
    //3.1封装所有属性
    private String name;//姓名
    private int age;//年龄
    private String kind;//品种
    private String host;//主人
    private double price;//价格

    //4.1提供本类的无参构造
    public Dog(){
        System.out.println("我是Dog类的无参构造");
    }
    //4.2提供本类的含参构造
    public Dog(int n){
        System.out.println("我是Dog类的含参构造"+n);
    }
    //4.3提供本类的全参构造
    public Dog(String name, int age, String kind, String host, double price) {
        this.name = name;
        this.age = age;
        this.kind = kind;
        this.host = host;
        this.price = price;
        System.out.println("我是Dog类的全参构造");
    }

    //5.1提供Dog自己的跑的功能
    public void run(){
        System.out.println("小狗狗跑的老快了~");
    }
    //5.2提供Dog自己的吃的功能
    public void eat(){
        System.out.println("小狗爱吃肉骨头");
    }
    //5.3提供Dog自己的睡觉的功能
    public void sleep(){
        System.out.println("小狗一天睡几个小时来着？");
    }
    //5.4提供Dog自己的玩的功能
    public void play(){
        System.out.println("小狗爱玩飞盘~");
    }

    //3.2提供所有的get与set方法
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
