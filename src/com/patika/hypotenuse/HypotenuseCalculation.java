package com.patika.hypotenuse;

import java.util.Scanner;

public class HypotenuseCalculation {
  /**
   * Dik Üçgende Hipotenüs Bulan Program Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve
   * hipotenüsü hesaplayan programı yazın.
   * 
   * Ödev Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
   * 
   * Formül Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
   * 
   * 𝑢 = (a+b+c) / 2
   * 
   * Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
   * 
   * @param args
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Dik Üçgen ");
    System.out.print("a Kenarını giriniz= ");
    int a = scan.nextInt();
    System.out.print("b Kenarını giriniz= ");
    int b = scan.nextInt();

    double hyp = Math.sqrt((a * a + b * b));

    System.out.println("Hipotenüs Kenarı  = " + hyp);
    System.out.println("------------------------");
    System.out.println("Üç Kenarı girilen üçgenin alanı ");
    System.out.print("a Kenarını giriniz= ");
    a = scan.nextInt();
    System.out.print("b Kenarını giriniz= ");
    b = scan.nextInt();
    System.out.print("c Kenarını giriniz= ");

    int c = scan.nextInt();
    // 𝑢 = (a+b+c) / 2
    // Alan^2 = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
    double u = (a + b + c) / 2d;
    double area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

    System.out.println("Üçgenin alanı     = " + area);
  }
}
