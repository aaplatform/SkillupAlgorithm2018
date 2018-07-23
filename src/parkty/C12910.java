/*
 * Copyright (C) 2015 LG CNS Inc.
 * All rights reserved.
 *
 * 모든 권한은 LG CNS(http://www.lgcns.com)에 있으며,
 * LG CNS의 허락없이 소스 및 이진형식으로 재배포, 사용하는 행위를 금지합니다.
 */
package programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * TODO Javadoc주석작성
 *
 * @author R11224
 * @version $Id: lgcns-code-templates-java.xml 426 2012-04-10 07:49:33Z designtker $
 */
public class C12910 {

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};

        LinkedList<Integer> dns = new LinkedList<>();

        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor == 0) {
                dns.add(arr[i]);
            }
        }

        if(dns.size()>0) {
            answer = new int[dns.size()];
            int ditSize = dns.size();
            for(int i=0; i<ditSize; i++) {
                answer[i] = dns.get(i);
            }
        }

        Arrays.sort(answer);

        return answer;
    }

    public Integer[] solution2(int[] arr, int divisor) {
        Integer[] answer = {-1};

        LinkedList<Integer> dns = new LinkedList<>();

        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor == 0) {
                dns.add(arr[i]);
            }
        }

        Collections.sort(dns);

        if(dns.size()>0) {
            answer = dns.toArray(new Integer[0]);
        }

        return answer;
    }

    public static void main(String[] args) {
        C12910 dns = new C12910();

        int[] arr1 = {5, 9, 7, 10};
        int[] arr2 = {2, 36, 1, 3};
        int[] arr3 = {3,2,6};
        System.out.println(Arrays.toString(dns.solution(arr1,5)));
        System.out.println(Arrays.toString(dns.solution(arr2,1)));
        System.out.println(Arrays.toString(dns.solution(arr3,10)));
        System.out.println();
        System.out.println(Arrays.toString(dns.solution2(arr1,5)));
        System.out.println(Arrays.toString(dns.solution2(arr2,1)));
        System.out.println(Arrays.toString(dns.solution2(arr3,10)));

    }

}
