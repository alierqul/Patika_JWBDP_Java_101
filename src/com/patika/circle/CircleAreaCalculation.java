package com.patika.circle;

import java.util.Scanner;

public class CircleAreaCalculation {
  /**
   * Dairenin Alanını ve Çevresini Hesaplayan Program Java ile yarı çapını kullanıcıdan aldığınız
   * dairenin alanını ve çevresini hesaplayan programı yazın.
   * 
   * Alan Formülü : π * r * r;
   * 
   * Çevre Formülü : 2 * π * r;
   * 
   * Ödev Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
   * 
   * 𝜋 sayısını = 3.14 alınız.
   * 
   * Formül : (𝜋 * (r*r) * 𝛼) / 360
   * 
   * @param args
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Dairenin Yarı Çapını Giriniz   = ");
    int r = scan.nextInt();

    System.out.print("Merkez Açısının Ölçüsü Giriniz = ");
    int alfa = scan.nextInt();

    double circleArea = Math.PI * Math.pow(r, 2);
    double circleCircumference = 2 * Math.PI * r;
    double circleAlfaArea = circleArea * (alfa / 360.0);

    System.out.println("Dairenin Alanı       = " + circleArea);
    System.out.println("Dairenin Çevresi     = " + circleCircumference);
    System.out.println("Alfa Açısının ölçüsü = " + circleAlfaArea);


  }
}
