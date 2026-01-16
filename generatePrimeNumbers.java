package Infinity_Champions;

import java.util.*;

public class generatePrimeNumbers {
    public static void main(String[] args) {
        int n = 20;

        brute(n);
        opt(n);
    }

    static void brute(int n){
        List<Integer>list = new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(isPrime(i))list.add(i);
        }
        System.out.println(list);
    }

    static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0)return false;
        }
        return true;
    }


    static void opt(int n){
        List<Integer>list = new ArrayList<>();
        boolean[] p= new boolean[n+1];
        Arrays.fill(p, true);
        p[0] = false;
        p[1] = false;

        for(int i = 2;i<=n;i++){
            if(p[i]){
                for(int j=i*i;j<=n;j+=i){
                    p[j] = false;
                }
            }
        }

        for(int i = 2;i<=n;i++){
            if(p[i])list.add(i);
        }
        System.out.println(list);

    }
}
