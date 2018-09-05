/*
 * Copyright (C) 2015 LG CNS Inc.
 * All rights reserved.
 *
 * 모든 권한은 LG CNS(http://www.lgcns.com)에 있으며,
 * LG CNS의 허락없이 소스 및 이진형식으로 재배포, 사용하는 행위를 금지합니다.
 */
package programmers.level1;

import java.util.Arrays;

/**
 * TODO Javadoc주석작성
 *
 * @author R11224
 * @version $Id: lgcns-code-templates-java.xml 426 2012-04-10 07:49:33Z designtker $
 */
public class C12954 {

    public long[] solution(int x, int n) {

        long[] answer = new long[n];
        long lx = x;

        long starttime = System.nanoTime();
        for(int i=1; i<=n; i++) {
            answer[i-1] = lx * i;
        }

        System.out.println("Elapsed Time : " + (System.nanoTime()-starttime) + " nano ,  ");

        starttime = System.nanoTime();
        for(int i=0; i<n; i++) {
            answer[i] = lx * (i+1);
        }
        System.out.print("Elapsed Time : " + (System.nanoTime()-starttime) + " nano ,  ");

        return answer;
    }

    /**TODO Javadoc주석작성
     * @param args
     */
    public static void main(String[] args) {
        C12954 testCls = new C12954();
        long starttime = System.currentTimeMillis();
        //System.out.println(testCls.solution(6));
        //System.out.println(testCls.solution(16));
        System.out.println(Arrays.toString(testCls.solution(2,5)));
        System.out.print("Elapsed Time : " + (System.currentTimeMillis()-starttime) + "ms ,  ");
    }

}
