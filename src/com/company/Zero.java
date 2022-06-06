package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Zero {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        int numbers[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Входной " + i + " элемент");
            numbers[i] = Integer.parseInt(READER.readLine());
        }
        System.out.println("Начальный массив  : " + Arrays.toString(numbers));
        int p=0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] == 0) {
                numbers[p++] = 0;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (numbers[i] != 0) {
                numbers[p++] = numbers[i];
            }
        }
        System.out.println("Начальный массив  : " + Arrays.toString(numbers));

    }
}