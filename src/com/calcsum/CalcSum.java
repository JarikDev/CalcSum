package com.calcsum;

import java.util.Scanner;

public class CalcSum {
    int res,a,b;



    public CalcSum(int a,int b){
        this.a=a;
        this.b=b;

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int calcSum(int a, int b ) {
        CalcSum.this.a = a;
        CalcSum.this.b = b;
        this.res = a + b;;
        return res;
    }
}
