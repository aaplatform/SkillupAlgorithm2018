/*
 * Copyright (C) 2015 LG CNS Inc.
 * All rights reserved.
 *
 * 모든 권한은 LG CNS(http://www.lgcns.com)에 있으며,
 * LG CNS의 허락없이 소스 및 이진형식으로 재배포, 사용하는 행위를 금지합니다.
 */
package programmers.level2;

/**
 * TODO Javadoc주석작성
 *
 * @author R11224
 * @version $Id: lgcns-code-templates-java.xml 426 2012-04-10 07:49:33Z designtker $
 */
public class C12911 {

    public int solution(int n) {

        int nOneCount = getCountOne2Jinsu(n);

        int nextValue = n;
        int nextOneCount = -1;

        do {
            nextValue++;
            nextOneCount = getCountOne2Jinsu(nextValue);
        }while(nOneCount != nextOneCount);

        return nextValue;
    }

    public int getCountOne2Jinsu(int value) {
        int oneCount = 0;

        while(value>0) {
            oneCount += value%2;
            value /=2;
        }

        return oneCount;
    }

    /**TODO Javadoc주석작성
     * @param args
     */
    public static void main(String[] args) {
        C12911 testCls = new C12911();

        long starttime = System.currentTimeMillis();

        System.out.println(testCls.solution(78));
        System.out.println(testCls.solution(15));

        System.out.println("Elapsed Time : " + (System.currentTimeMillis()-starttime) + "ms ,  ");

    }



}
