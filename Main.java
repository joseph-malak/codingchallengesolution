package com.demo2;

public class Main {

    public static void main(String[] args) {
        double input = 290;
        double one = 0;
        double div = 0;
        int count = 0;
        for(int i = 1; i<=input; i++){
            System.out.println("");
            one = i+one;

            for (int p=1;p<=one;p++) {
                if (one % p == 0) {
                    if (count < 501)
                        System.out.printf("%d ", p, count++);
                    else {
                        System.out.println("");
                        System.out.println(i);
                        System.exit(0);
                    }
                }
            }

        }

        System.out.println(count);
    }
}
