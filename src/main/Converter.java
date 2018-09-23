package main;

import java.util.Scanner;

public class Converter {
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Введите целое положительно число > 2 ");
 long numb = scanner.nextInt();
 long base = 2;
 String binN = "";

  if ( numb<=127 ){
     numb = (byte) numb;
     System.out.println(" Тип данных - byte");}


  if (numb > 127 && numb<=32767){
      numb = (short) numb;
      System.out.println(" Тип данных - short"); }

  if (numb > 32767 && numb <= 2147483647){
      numb = (int) numb;
      System.out.println(" Тип данных - int");}

  if (numb > 2147483647){
      System.out.println(" Тип данных - long");}

  do {
     long ost = numb%base;
     binN = binN +  String.valueOf(ost) ;
     numb/= base;}
  while (numb >= base);

  binN += String.valueOf(numb);
  char [] binNarr = binN.toCharArray(); //делаю из строки символьный массив
  String ConverterResult = " "; //строка для  результата
  for (int i = binNarr.length - 1; i>=0; i-- ){
  ConverterResult += binNarr[i] ;}

  System.out.println("Результат :" + ConverterResult);


    }
}
