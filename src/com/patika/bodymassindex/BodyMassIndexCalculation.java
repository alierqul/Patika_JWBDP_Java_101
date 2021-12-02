package com.patika.bodymassindex;

import java.util.Scanner;

public class BodyMassIndexCalculation {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
    double sizeHeight = scan.nextDouble();
    System.out.print("Lütfen kilonuzu giriniz                  : ");
    double sizeWeight = scan.nextDouble();
    double bodyMassIndex = sizeWeight / (Math.pow(sizeHeight, 2));

    System.out.println("Vücut Kitle İndeksiniz                   : " + bodyMassIndex + " TL");

  }

}
