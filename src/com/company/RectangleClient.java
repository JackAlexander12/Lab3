package com.company;

public class RectangleClient {
    public static void main(String args[]){
        //initializing the objects @rect1 and @rect2
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        //rect1.setFields(3,4,5,6);

        rect1.setFields(5,5,5,5);
        System.out.println(rect1.toString());
        rect2.setFields(5,5,5,5);
        System.out.println(rect2.toString());
    }
}
