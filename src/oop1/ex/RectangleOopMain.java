package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.width = 5;
        r.height = 8;

        System.out.println("사각형의 넓이 : " + r.calculateArea());
        System.out.println("사각형의 넓이 : " + r.calculatePerimeter());
        System.out.println("정사각형 여부 : " + r.isSquare());

    }
}
