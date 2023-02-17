package com.zbx;

import java.util.ArrayList;
import java.util.Random;

public class Manager extends Users{
    public Manager() {
    }

    public Manager(String name, double leftMoney,double data) {
        super(name, leftMoney);
    }
    public ArrayList<Double> send(double money, int count){
        double leftMoney = getLeftMoney();
        //创建一个集合保存红包金额
        ArrayList<Double> list = new ArrayList<>();
        //查看能否发红包
        if(money >leftMoney){
            System.out.println("余额不足，发送失败！");
            return null;
        }
        //修改余额
        super.setLeftMoney(leftMoney - money);
        //平均分配红包，如果无法平分，多的给最后一个
        money *= 100;
        //求平分的整数
        int aver = (int)money / count;
        //求未能平分的部分
        int mod = (int)money % count;
        //先发放前面的
        for (int i = 0; i < count-1; i++) {
             list.add(aver/100.0);
        }
        //发放最后一个的
        list.add((aver+mod)/100.0);
        return list;
    }
    public void receive(ArrayList<Double> list){
        Random random = new Random();
        //从集合中选出一个编号取出，并在集合中删除该数据
        int index = random.nextInt(list.size());
        double data = list.remove(index);
        super.setData(data);
        super.setLeftMoney(super.getLeftMoney()+data);
    }
}
