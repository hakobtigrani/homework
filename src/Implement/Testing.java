package Implement;

import java.util.ArrayList;
import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        MyArrayList cars = new MyArrayList();
        cars.add(2);
        cars.add(4);
        cars.add(7);
        cars.add(1);
        System.out.println(Arrays.toString(cars.toArray()));
    }
}