package com.patika.average;

import java.util.Scanner;

public class AverageCalculation {
  /**
   * Not Ortalaması Hesaplayan Program Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
   * derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan
   * programı yazın. Ödev Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının
   * ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
   * 
   * Not : If ve Else kullanılmayacak...
   * 
   * @param args
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Matematik notu: ");
    int mathematics = scan.nextInt();
    System.out.println("Fizik notu: ");
    int physics = scan.nextInt();
    System.out.println("Kimya notu: ");
    int chemistry = scan.nextInt();
    System.out.println("Türkçe notu: ");
    int turkish = scan.nextInt();
    System.out.println("Tarih notu: ");
    int history = scan.nextInt();
    System.out.println("Müzik notu: ");
    int musiz = scan.nextInt();
    // Hesaplamalar
    int sum = mathematics + physics + chemistry + turkish + history + musiz;
    float average = sum / 6F;
    // Ekrana Gösterim
    System.out.println("Ortalama = " + average);
    System.out.println("Geçme Durumu = " + ((average > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı"));
  }

}
