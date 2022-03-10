package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива : ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива :");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
        int minvalue=array[0];
        for (int i=1;i<array.length;i++){
            if (array[i]<minvalue){
                minvalue=array[i];
            }
        }
        double average = 0;
        if (array.length > 0)
        {
            double summa = 0;
            for (int j = 0; j < array.length; j++) {
                summa += array[j];
            }
            average = summa / array.length;
        }
        double sum=minvalue+average;
        System.out.println("Минимальный элемент:"+ minvalue);
        System.out.println("Среднее арифметическое:"+average);
        System.out.println("Сумма минимального элемента и среднего арифметического:"+sum);
    }
}