package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    /*
        for (int i = 0; i < 10; i++) {
            System.out.println(i);}}}
*/

  /*      int i=0;
        for (;;) {
            System.out.println(i);}}}
*/

      /*
for (int i=0; i<10; i++) {
if (i==5){
continue;
}
System.out.println(i);}}}
*/

        /*
        for (int i=0; i<10; i++) {
if (i==5){
break;
}
System.out.println(i);}}}
         */


/*  int a=0;
  while (a<5) { System.out.println(a);  a++;}}}
  */

      /*
       int i=0;
        while (i<10) { if (i==5) {i++;
                continue; }
            System.out.println(i);  i++;}}}
*/

/*
  int i=0;
        while (i<10) { if (i==5) {
                break;}
            System.out.println(i);  i++;}}}
            */

  /*
  int i=0;
        do { System.out.println(i);  i++;}
        while (i < 10); }}
*/

/*
        int a = 1;
        for (int i = 0; i < 24; i = i + 3) {a =a*2;}
        System.out.println(a);}}
 */

/*   int a = 1;
        int i=0;
        while (i < 24) { i=i+3; a =a*2;}
        System.out.println(a);}}
 */

/*
        int a = 1;
        int i=0;
        do {i = i + 3; a=a*2;}
         while (i<24);
        System.out.println(a);}}
 */

      /*
        for (int i = 1;i <= 100;i++){
            if (i % 2 == 0) {System.out.println(i);}}}}
       */

  /*
  int i=1;
      while (i <= 100)
      {i=++i;
            if (i % 2 == 0) {
                System.out.println(i);}}}}
   */

   /*
       int i = 1;
        do {i = ++i;
            if (i % 2 == 0) {
                System.out.println(i);}}
            while (i <= 100) ;}}
    */

/*
        int s=0;
        for (int i=1;i<=99; i++)
        {if (i%2!=0) {s+=i;}}
        System.out.println(s);}}
 */

     /*
     int s=0;
    int i=1;
    while (i<=99){if (i%2!=0)
    {s+=i;}
    i=++i;}
    System.out.println(s);}}
      */

/*
        int s = 0;
        int i = 1;
        do {if (i % 2 !=0) {
                s += i;}
            i = ++i;
        } while (i<=99);
        System.out.println(s);}}
 */

/*
        double l=10;
        double s = 10;
        for (int i = 2; i <=7; ++i) {
            s =s+ s * 0.1;
            l+=s;}
        System.out.println(l);}}
 */

/*        double l=10;
        double s = 10;
        int i=2;
        while (i<=7) {++i; s=s+s*0.1; l+=s;}
    System.out.println(l); }}
*/

       /*
        double l=10;
        double s = 10;
        int i=2;
        do { ++i; s=s+s*0.1; l+=s;}
         while (i<=7);
    System.out.println(l);}}
        */

        /*
int s=0;
for (int i=1; i<=256; i=i*2){
s+=i;}
System.out.println(s);}}
         */

        /*
    int s=1;
    int i=1;
    while (i<256) {
    i=i*2; s+=i;}
    System.out.println(s);
    }}

         */

        /*
    int i=1;
    int s=1;
    do { i=i*2; s+=i;}
while (i<256);
    System.out.println(s);
    }}

         */

        /*
        double a;
for (int i=1; i<=20; ++i) {
a=i*2.54;
System.out.println(i+" - "+a);}
    }}

         */

        /*
    double a;
    int i=0;
    while (i<20){
    i=++i; a=i*2.54;
    System.out.println(i+" - "+a);}
    }}
         */

        /*
    double a;
    int i=0;
    do { i=++i; a=i*2.54;
        System.out.println(i+" - "+a);}
    while (i<20);}}
         */

        /* треугольник*/
/*
        int a=4; int b=8; int c=0;
for (int i=0; i<a; ++i) {c+=b;}
System.out.println(c);}}
 */

        /*
        int a=4; int b=8; int c=0; int i=0;
    while (i<a) {i=++i; c+=b;}
    System.out.println(c);}}
         */

        /*
        int a=4; int b=8; int c=0; int i=0;
        do { i=++i; c+=b;} while (i<a);
            System.out.println(c);
       }}
           */

        /*звездочки*/
        /*
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            for (int j = i; j < 3; j++){
                System.out.print(" ");
            }
            System.out.println();
        }}}
              */



        /* числа фибоначчи*/
        /*
        int a = 0;
        int b=1;
        int f;
        for (int i=1; i<=10; ++i) {
           f=a+b;
            System.out.println(f);
            a=b; b=f;}
    }}
             */

        /* натуральные делители числа*/

        /*        double a=15;
        for ( int i=0; i<=a; i++){
            if ((a%i)==0) {
                System.out.println(i);}
            }
        }}
         */

        /* проверка на простое число*/
/*
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println("число не является простым");
                break;
            } else {
                System.out.println("число простое");
                break;
            }
        }
    }}
*/

/* сумма цифр числа*/

 /*
System.out.println("введите число: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double a;
        int b=0;
        for (; i>0; i/=10){
            a=i%10;
            b+=a;}
            System.out.println(b); }
}
  */








  /*      int[] array = new int[3];
    array[0]=56;
    array[1]=345;
    array[2]=123;
    for (int i=0;i<3;i++) {
        System.out.println(array[i]);
    }*/
  /* Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the value: ");
    int a= scanner.nextInt();
   System.out.println(a);
    */
     /*   Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите число: ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }}

      */

    /*
    Random random=new Random();
    for (int i=0; i<10; i++){
        System.out.println(random.nextInt(100));
    }}}

     */
      /*  int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.println("=======");
        for (int i = 0; i < 10; i++){
           System.out.println(array[i]);
    }
    System.out.println("=======");
    for (int i=0;i<10;i++){
    if (array[i]%2==0){
        System.out.println(array[i]);}
    }}}
           */




/*
int []arrAY = new int []{2,5,7,8,92}
 */


/* int a=0;
        for(int i=2;i<=20;i=i+2){
         a++;   System.out.print(" "+i);
        }
   System.out.println(a);}}
    */





/* пример 1 */
        /*
        int a=2;
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i]=a;
            a+=2;
            System.out.print(" " +array[i]);
        }
       System.out.println();
            for (int i=0; i<10; i++){
                System.out.println(" " + array[i]);
            }}}
                     */

/* пример 2*/

        /*
int a=1;
int []array=new int[50];
for (int i=0;i<50; i++){
array[i]=a; a+=2;
System.out.print(array[i]+" ");
}
System.out.print(" ");
int c=99;
for (int i=0;i<50;i++){
    array[i]=c; c-=2;
    System.out.print(array[i]+" ");
        }}}
*/

    /* пример 3 */
/*
int []array = new int [15];
Random random= new Random();
for (int i=0;i<15;i++){
array[i]=random.nextInt(100);
System.out.print(array[i]+" ");}
System.out.println();
int a=0;
for (int i=0;i<15;i++){
    if (array[i]%2==0){;a=++a;
    System.out.println(array[i]);
        }}
System.out.println(a);
    }}*/

    /*пример 4*/
/*
        int []array = new int [20];
        Random random= new Random();
        for (int i=0;i<20;i++){
            array[i]=random.nextInt(20);
            System.out.print(array[i]+" ");}
        System.out.println();
        for (int i=0;i<20;i++){
            if (array[i]%2==0){
                System.out.println(array[i]);
            } else {
            System.out.println("0");}}
    }}
     */

/*пример 5*/
        /*
        int a=0;
        double s1;
int [] amarray=new int [5];
Random random=new Random();
for (int i=0; i<5; i++) {
amarray[i]=random.nextInt(15);
a+=amarray[i];
System.out.print(amarray[i]+" ");}
System.out.println();
System.out.println(a); s1=(double) a/5;
System.out.println(s1);
        int b=0;
        double s2;
        int [] bmarray=new int [5];
        Random brandom=new Random();
        for (int i1=0; i1<5; i1++) {
            bmarray[i1]=brandom.nextInt(15);
            b+=bmarray[i1];
            System.out.print(bmarray[i1]+" ");}
        System.out.println();
        System.out.println(b); s2=(double) b/5;
        System.out.println(s2);
    if (s1>s2) {
        System.out.println("среднее арифметическое первого массива больше");}
    else if (s1<s2){
        System.out.println("среднее арифметическое второго массива больше");
    } else {  System.out.println("средние арифметические массивов равны");
    }}}
             */

    /*пример 6*/
        /*
               int [] array=new int [4];
        Random random=new Random();
        for (int i=0; i<4; i++) {
            array[i]=random.nextInt(10);
                   System.out.print(array[i]+" ");}
    if ((array[0]<array[1])&&(array[1]<array[2])&&(array[2]<array[3])) {
    System.out.println("массив является строго возрастающим");} else {
        System.out.println("массив не является строго возрастающим");
    }
    }}
             */


    /*пример 7*/
        /*
        int [] array=new int [12];
        Random random=new Random();
        for (int i=0; i<12; i++) {
            array[i]=random.nextInt(15);
            System.out.print(array[i]+" ");}
         */