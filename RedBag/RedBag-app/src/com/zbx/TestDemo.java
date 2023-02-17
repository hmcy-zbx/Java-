package com.zbx;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.exit;

public class TestDemo {
    //分别定义用户类，群主类，群员类
    //分别创建一个群主多个群员（总数即为红包个数）
    public static void main(String[] args) {
        Manager manager = new Manager("群主",200.0,0.0);
        Member m1 = new Member("张三",0.0);
        Member m2 = new Member("李四",1.0);
        Member m3 = new Member("王五",2.1);
        Member m4 = new Member("赵六",0.6);
        //显示初始金额
        System.out.println("======================");
        manager.show();
        m1.show();
        m2.show();
        m3.show();
        m4.show();
        System.out.println("======================");
        //输入红包金额
        System.out.print("请您输入要发送红包的金额：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        //发送红包
        ArrayList<Double> list = manager.send(money,5);
        if(list == null){
            exit(1);
        }
        //抢红包
        System.out.println("======================");
        System.out.println("大家正在抢红包~");
        manager.receive(list);
        m1.receive(list);
        m2.receive(list);
        m3.receive(list);
        m4.receive(list);

        System.out.println("======================");
        //显示余额
        manager.show(manager.getData());
        m1.show(m1.getData());
        m2.show(m2.getData());
        m3.show(m3.getData());
        m4.show(m4.getData());
        System.out.println("======================");
    }
}
