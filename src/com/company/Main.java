package com.company;

import java.util.Scanner;
public class Main {
    static int sumaCifara(int n){
        int suma=0;
        while(n!=0){
            int c=n%10;
            suma+=c;
            n/=10;
        }
        return suma;
    }
    public static void main(String[] args) {
	// write your code here
        System.out.print("Unesite broj n: ");
        Scanner ulaz=new Scanner(System.in);
        int n=ulaz.nextInt();
        for(int i=1;i<=n;i++){
            if(i%sumaCifara(i)==0) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
