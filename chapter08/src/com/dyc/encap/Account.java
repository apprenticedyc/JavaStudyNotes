package com.dyc.encap;

public class Account {
    public static void main(String[] args) {

    }
}

class A {
    public String name;
    private double remainder;
    private String password;


    public A(String name, double remainder, String password) {
        this.name = name;
        this.remainder = remainder;
        this.password = password;
        setName(name);
        setPassword(password);
        setRemainder(remainder);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 4 && name.length() >= 2) {
            this.name = name;
        } else {
            System.out.println("您输入的名字不符合规范");
            this.name = "王小二";
        }
    }

    public double getRemainder() {
        return remainder;
    }

    public void setRemainder(double remainder) {
        if (remainder > 20) {
            this.remainder = remainder;
        } else {
            System.out.println("穷逼");
            this.remainder = 000;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length()==6) {
            this.password = password;
        }else {
            System.out.println("您的密码不是六位请重新输入");
            this.password="000000";
        }
    }
    public String info(){
        return "名字:"+name+"  余额:"+remainder+"  密码:"+password;
    }
}

