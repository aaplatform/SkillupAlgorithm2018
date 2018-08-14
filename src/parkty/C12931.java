/*
 * Copyright (C) 2015 LG CNS Inc.
 * All rights reserved.
 *
 * 모든 권한은 LG CNS(http://www.lgcns.com)에 있으며,
 * LG CNS의 허락없이 소스 및 이진형식으로 재배포, 사용하는 행위를 금지합니다.
 */
package programmers.level1;

/**
 * TODO Javadoc주석작성
 *
 * @author R11224
 * @version $Id: lgcns-code-templates-java.xml 426 2012-04-10 07:49:33Z designtker $
 */
public class C12931 {

    public int solution(int n) {
        int answer = 0;

        String nString = (""+n);
        for(int i=0; i<nString.length(); i++) {
            answer += Integer.parseInt(nString.substring(i, i+1));
        }

        return answer;
    }

    public int solution2(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }


    /**TODO Javadoc주석작성
     * @param args
     */
    public static void main(String[] args) {
        C12931 testCls = new C12931();
        System.out.println(testCls.solution(123));
        System.out.println(testCls.solution(987));

    }

}
