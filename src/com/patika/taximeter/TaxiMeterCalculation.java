package com.patika.taximeter;

import java.util.Scanner;

public class TaxiMeterCalculation {
  /**
   * Taksimetre Programı Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran
   * programı yazın.
   * 
   * Taksimetre KM başına 2.20 TL tutmaktadır. Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki
   * ücretlerde yine 20 TL alınacaktır. Taksimetre açılış ücreti 10 TL'dir.
   * 
   * @param args
   */
  public static void main(String[] args) {

    final double TAXIMETRE_KM_AMOUNT = 2.20;
    final double TAXIMETRE_OPEN_AMOUNT = 10;

    Scanner scan = new Scanner(System.in);

    System.out.print("Gidilen Mesafeyi giriniz= ");
    int distance = scan.nextInt();

    double paidAmount = TAXIMETRE_OPEN_AMOUNT + (TAXIMETRE_KM_AMOUNT * distance);

    paidAmount = paidAmount < 20.0 ? 20.0 : paidAmount;

    System.out.println("Toplam Ücret = " + paidAmount + " TL");

  }
}
