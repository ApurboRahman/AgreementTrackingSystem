package com.programming;

/**
 * Created by md.rahman on 3/17/2018.
 */
public class Constructor {
    private double v1, v2;

    public Constructor(double v1, double v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public Constructor(Constructor c) {
        v1 = c.v1;
        v2 = c.v2;
    }

    public static void main(String[] args) {
        Constructor constructor = new Constructor(5, 7);
        Constructor copy = new Constructor(constructor);
        Constructor copy1 = copy;
        System.out.println(constructor);
        System.out.println(copy);
        System.out.println(copy1);
    }

    @Override
    public String toString() {
        System.out.println("Constructor Called: ");
        return "Constructor{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                '}';
    }
}
