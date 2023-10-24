package com.dlx.test;

public class Appliance {
    // 电器类的属性：品牌、型号、颜色、售价
    private String brand;
    private String model;
    private String color;
    private String price;
    public Appliance() {
    }
    public Appliance(String brand, String model, String color, String price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
}

class Refrigerator extends Appliance{
    // 冰箱的属性：门款式、制冷方式
    private String doorStyle;
    private String refrigeration;
    // 展示信息
    public void showInfo(){
        System.out.println("冰箱的属性如下：");
        System.out.println("品牌: " + super.getBrand() + " 型号: " + super.getModel() + " 颜色: " + super.getColor()
                + " 售价: " + super.getPrice() + " 门款式: " + this.doorStyle + " 制冷方式: " + this.refrigeration);
    }
    // 无参构造
    public Refrigerator() {
    }
    // 全参构造
    public Refrigerator(String brand, String model, String color, String price, String doorStyle, String refrigeration) {
        super(brand, model, color, price);
        this.doorStyle = doorStyle;
        this.refrigeration = refrigeration;
    }
    public String getDoorStyle() {
        return doorStyle;
    }
    public void setDoorStyle(String doorStyle) {
        this.doorStyle = doorStyle;
    }
    public String getRefrigeration() {
        return refrigeration;
    }
    public void setRefrigeration(String refrigeration) {
        this.refrigeration = refrigeration;
    }
}

class Television extends Appliance{
    // 电视机属性：屏幕尺寸、分辨率
    private String screenSize;
    private String resolvingPower;
    // 展示信息
    public void showInfo(){
        System.out.println("电视的属性如下：");
        System.out.println("品牌: " + super.getBrand() + " 型号: " + super.getModel() + " 颜色: " + super.getColor()
                + " 售价: " + super.getPrice() + " 屏幕尺寸: " + this.screenSize + " 分辨率: " + this.resolvingPower);
    }
    // 无参构造
    public Television() {
    }
    // 全参构造
    public Television(String brand, String model, String color, String price, String screenSize, String resolvingPower) {
        super(brand, model, color, price);
        this.screenSize = screenSize;
        this.resolvingPower = resolvingPower;
    }
    public String getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
    public String getResolvingPower() {
        return resolvingPower;
    }
    public void setResolvingPower(String resolvingPower) {
        this.resolvingPower = resolvingPower;
    }
}

class WashingMachine extends Appliance{
    // 洗衣机 属性：电机类型、洗涤容量
    private String motorType;
    private String washingCapacity;
    // 展示信息
    public void showInfo(){
        System.out.println("洗衣机的属性如下：");
        System.out.println("品牌: " + super.getBrand() + " 型号: " + super.getModel() + " 颜色: " + super.getColor()
                + " 售价: " + super.getPrice() + " 电机类型: " + this.motorType + " 洗涤容量: " + this.washingCapacity);
    }
    // 无参构造
    public WashingMachine() {
    }
    // 全参构造
    public WashingMachine(String brand, String model, String color, String price, String motorType, String washingCapacity) {
        super(brand, model, color, price);
        this.motorType = motorType;
        this.washingCapacity = washingCapacity;
    }
    public String getMotorType() {
        return motorType;
    }
    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }
    public String getWashingCapacity() {
        return washingCapacity;
    }
    public void setWashingCapacity(String washingCapacity) {
        this.washingCapacity = washingCapacity;
    }
}