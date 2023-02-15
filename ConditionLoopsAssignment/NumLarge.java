package ConditionLoopsAssignment;

import java.util.Scanner;

public class NumLarge {
    public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                int num = 1;
                int large = 0;

                while(num != 0){
                    int n = large;
                    num = in.nextInt();

                    if(num>n){
                        large = num;
                    }else {
                        large = n;
                    }
                }
                System.out.println(large);
            }
        }

