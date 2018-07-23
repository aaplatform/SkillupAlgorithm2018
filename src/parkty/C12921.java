/*
 * Copyright (C) 2015 LG CNS Inc.
 * All rights reserved.
 *
 * 모든 권한은 LG CNS(http://www.lgcns.com)에 있으며,
 * LG CNS의 허락없이 소스 및 이진형식으로 재배포, 사용하는 행위를 금지합니다.
 */
package programmers.level1;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * TODO Javadoc주석작성
 *
 * @author R11224
 * @version $Id: lgcns-code-templates-java.xml 426 2012-04-10 07:49:33Z designtker $
 */
public class C12921 {

    private static ArrayList<Integer> isPrime = new ArrayList<>();
    private static HashSet<Integer> isNotPrime = new HashSet<>();


    public int solution2(int n) {

        isPrime.clear();
        isNotPrime.clear();

        for(int i=2; i<=n; i++) {
            if(!isNotPrime.contains(i)) {
                if(isPrime(i, isPrime)) {
                    System.out.print(i+",");
                    isPrime.add(i);
                    for(int j=2; i*j<=n; j++) {
                        isNotPrime.add(i*j);
                    }
                    //System.out.println(isNotPrime.size());
                } else {
                    isNotPrime.add(i);
                }
            }
        }

        return isPrime.size();
    }

    private boolean isPrime(int n, ArrayList<Integer> isPrime) {
        if(n<2) {
            return false;
        }

        //자기보다 작은 소스들로 나누어떨어지지 않으면 소수...
        for(int prime : isPrime) {
            if(n%prime == 0) {
                return false;
            }
        }

        return true;
    }

    public int solution(int n) {
        int primeCount = 0;

        int[] nNumber = new int[n+1];
        for(int i=2; i<=n; i++) {
            nNumber[i] = i;
        }

        for(int i=2; i<=n; i++) {
            if(nNumber[i] !=0) {
                primeCount++;
                for(int j=2; i*j<=n; j++) {
                    nNumber[i*j] = 0;
                }
            }
        }

        return primeCount;
    }




    public static void main(String[] args) {
        C12921 testCls = new C12921();
        System.out.println("==>" + testCls.solution(10));
        System.out.println("==>" + testCls.solution(5));

        long starttime = System.currentTimeMillis();
        System.out.println("==>" + testCls.solution(1000000));
        //System.out.println("==>" + testCls.solution(50000));
        System.out.print("Elapsed Time : " + (System.currentTimeMillis()-starttime) + "ms ,  ");


    }

}
