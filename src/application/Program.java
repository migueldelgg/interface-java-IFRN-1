package application;

import entities.AreaCalculavel;
import entities.Circle;
import entities.Rectangle;
import entities.Square;

import java.awt.geom.Area;
import java.util.Vector;

public class Program {
    public static void main(String[] args) {
        AreaCalculavel[] vect = new AreaCalculavel[5];

        vect [0] = new Square(3);
        vect [1] = new Rectangle(2, 5);
        vect [2] = new Circle(5);
        vect [3] = new Rectangle(3, 6);
        vect [4] = new Square(4);

        for (AreaCalculavel a : vect) {
            System.out.println(a.calculaArea());
        }
    }
}
