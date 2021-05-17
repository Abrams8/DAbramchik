package com.company;

public class Main {

    public static void main(String[] args) {
        boolean r = true;
        byte c = 2;
        long d = 956885;
        float i = 4.4f;
        double f = 8.8d;
        short g = 3;
        char k = 66;
        int a = 5;

        System.out.println(r);
        System.out.println(c);
        System.out.println(d);
        System.out.println(i);
        System.out.println(f);
        System.out.println(g);
        System.out.println(k);
        System.out.println(a)

        int ab = 1;
        System.out.println("деление int 5 на int 1 =" + " " + a / ab);
        int bb=0;
        System.out.println("деление int 0 на int 5 =" + " " + bb/a);
        float ib = 0.5f;
        System.out.println("деление float 4.4 на float 0.0 =" + " " + ab / ib);
        double fb = 0.0d;
        System.out.println("деление double 8.8 на double 0.0 =" + " " + f / fb);

        char cr='0';
        while(cr>0){
            System.out.println(cr++);
        }
    }
}
