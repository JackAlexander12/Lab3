package com.company;

public class Rectangle {
    //these are initialized here so they can be editted and passed onto the other objects
    int x,y,h,w;
    public void setFields(int newx, int newy, int newwidth, int newheight){
        x=newx;
        y=newy;
        w=newwidth;
        h=newheight;
    }
    public int getHeight(int h){

        return h;
    }
    public int getWidth(int w){
        return w;
    }
    public int getX(int x){
        return x;
    }
    public int getY(int y){
        return y;
    }
    public String toString(){
        String result = "[x="+ x + ", y= "+ y + ", height ="+ h+", width= "+ w+"] Area is: "+ h*w+".";
        return result;
    }
}
