package org.example.BeanWithCollectionAndRef;

public class Marks {
    private int p;
    private int c;

    public Marks(int p, int c, int m) {
        System.out.println("con run in m");
        this.p = p;
        this.c = c;
        this.m = m;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "p=" + p +
                ", c=" + c +
                ", m=" + m +
                '}';
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        System.out.println("m set run");
        this.p = p;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    private int m;

    public Marks() {
    }
}
