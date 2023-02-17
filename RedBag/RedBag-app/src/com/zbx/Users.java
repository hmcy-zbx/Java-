package com.zbx;

public class Users {
    private String name;
    private double leftMoney;
    private double data;
    //构建无参构造器
    public Users() {

    }

    //构建有参构造器
    public Users(String name, double leftMoney) {
        this.name = name;
        this.leftMoney = leftMoney;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }
    //展示信息方法
    public void show(){
        System.out.println(name+"有"+leftMoney+"元。");
    }
    public void show(double data){
        System.out.println(name+"抢了"+data+"元，"+"现在有"+leftMoney+"元。");
    }
}
