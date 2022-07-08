package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        double[] number2 = {-156.8, 834.8, 200.5, -427.6, 318.9, -606.1, 174.5, -427.8, 831.4, -236.6, 530.2, -760.3, 236.9, -921.3, 600.1};
        for (double x : number2)
            for (int nmbr = 0; nmbr > 0; nmbr++) {
                System.out.println(number2 + ":" + nmbr);
            }{
            if (number2[x] < 0) {
                continue;
            } else if (number2[x] > 0);





        }

        //доп. домашнее задание:

        System.out.println(Arrays.toString(number2));
        for (int left = 0; left < number2.length; left++) {
            int minInd = left;
            for (int i = left; i < number2.length; i++) {
                if (number2[i] < number2[minInd]) {
                    minInd = i;
                }
            }
            swap(number2, left, minInd);
        }
        System.out.println(Arrays.toString(number2));
    }


}