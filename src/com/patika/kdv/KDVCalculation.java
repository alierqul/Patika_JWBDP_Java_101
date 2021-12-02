package com.patika.kdv;

import java.util.Scanner;

public class KDVCalculation {
  /**
   * KDV Tutarı Hesaplayan Program Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
   * KDV tutarını hesaplayıp ekrana bastıran programı yazın.
   * 
   * (Not : KDV tutarını 18% olarak alın)
   * 
   * KDV'siz Fiyat = 10;
   * 
   * KDV'li Fiyat = 11.8;
   * 
   * KDV tutarı = 1.8;
   * 
   * Ödev Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise
   * KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
   * 
   * @param args
   */
  public static void main(String[] args) {
    final float KDV_RATE_18 = 0.18F;
    final float KDV_RATE_8 = 0.08F;
    float kdvValue = 0F;
    Scanner scan = new Scanner(System.in);
    System.out.print("Para Değeri= ");
    float moneyValue = scan.nextFloat();

    if (moneyValue <= 0) {
      System.out.println("Tutar 0 dan küçük Olamaz !");
    } else {
      if (moneyValue > 0 && moneyValue <= 1000) {

        kdvValue = moneyValue * KDV_RATE_18;
      } else {
        kdvValue = moneyValue * KDV_RATE_8;
      }

      System.out.println("KDV'siz Fiyat = " + moneyValue);
      System.out.println("KDV'li Fiyat  = " + (moneyValue + kdvValue));
      System.out.println("KDV tutarı    = " + kdvValue);
    }
  }

}
