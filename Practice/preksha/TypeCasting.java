package Practice.preksha;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

//typecasting
        int num = (int)(67.96f);
        System.out.println(num);

//        Automatic type promotions in expressions
//        int a = 257;
//        byte b = (byte)a;   //257 % 256 = 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a*b)/c;     // (40*50)/100 = 20   // Here it doesnt give error as though a*b = 2000 and it exceeds the size of byte , but here it considers it as int and perform the expression and then returns the byte value , basically called promotion in expression

//        System.out.println(d);

//        byte b  = 50;
//        b = b * 2;     // This gives error as you cannot assign an int value to byte

//        Automatic type conversion ASCII values are printed
        int number = 'a';
        System.out.println(number);

//        Java follows unicode principle, i.e it takes all the languages
        System.out.println("नमस्ते");
        System.out.println("你好");
        System.out.println(3 *5.99); // int *double = double
        System.out.println(9*3.22f);

        byte b = 15;
        char c = 'f';
        short s = 5224;
        int i = 990000;
        float f = 5533.632f;
        double d = 123.525252;
        double result = (f * b) + (i/c) + (d * s);
//        float + int - double = double
        System.out.println((f * b) + "" + (i/c) + " " + (d * s));
        System.out.println(result);

    }
}

// Conditions applied for typeCoversion
//1) Two type should be compatible
//2) Destination type should be greater than the source type

//TypeCasting or narrowConversion

//Rules of automatic Type promotion
//1) all the byte , short and char values are promoted to int
//2) If any one of the operand is long ,then whole operation will be promoted to long , also same with float & double.

