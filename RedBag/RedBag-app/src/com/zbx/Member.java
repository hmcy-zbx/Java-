package com.zbx;

import java.util.ArrayList;
import java.util.Random;

public class Member extends Users{
    public Member() {
    }

    public Member(String name, double leftMoney) {
        super(name, leftMoney);
    }

    //从红包集合中随机取出一份给自己
    public void receive(ArrayList<Double> list){
        Random random = new Random();
        //从集合中选出一个编号取出，并在集合中删除该数据
        int index = random.nextInt(list.size());
        double data = list.remove(index);
        super.setData(data);
        super.setLeftMoney(super.getLeftMoney()+data);
    }
}
