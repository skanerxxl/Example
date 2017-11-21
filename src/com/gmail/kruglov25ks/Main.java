package com.gmail.kruglov25ks;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        PhoneComparator p = new PhoneComparator();
        System.out.println(p.a+1);
        System.out.println(p.b);
        System.out.println(p.a==p.b);
        p.arr[0] = 2;
        System.out.println(Arrays.toString(p.arr));
    }
}

class PhoneComparator {
    int a;
    int b = 0;
    int[]arr = {1};

}