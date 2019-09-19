package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Long.parseLong;
/**
 * @author Artem Shumin
 */
public class Main {
    private String convert;


    public void binary() { //преобразования обычного числа в двоичную систему
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число : ");
        Integer number = in.nextInt(); //ввод числа пользователем

        convert = Integer.toBinaryString(number); //преобразование числа в двоичную систему
        System.out.println("Число в двоичном виде : " + convert);
        convert = Integer.toOctalString(Integer.parseInt(String.valueOf(number))); //преобразование двоичного числа в восмеричную систему
        System.out.println("Двоичное число в восмеричной сисеме : " + convert);


    }

    public void writeToFile(File file) {
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(convert);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Main l = new Main();
        l.binary();
        l.writeToFile(new File("C:/Лабы/Hex.txt"));
    }
    }



