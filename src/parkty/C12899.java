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
public class C12899 {

    public String solution(int n) {

        System.out.print(n + "=>");

        StringBuilder sb = new StringBuilder();

        while(n>0) {
            int threeJinsu = n%3;
            if(threeJinsu==0) {
                sb.append(4);
                n--;
            } else {
                sb.append(threeJinsu);
            }

            n = n/3;
        }

        return sb.reverse().toString();
    }

    /**TODO Javadoc주석작성
     * @param args
     */
    public static void main(String[] args) {
        C12899 testCls = new C12899();
        System.out.println(testCls.solution(1));
        System.out.println(testCls.solution(2));
        System.out.println(testCls.solution(3));
        System.out.println(testCls.solution(4));
        System.out.println(testCls.solution(5));
        System.out.println(testCls.solution(6));
        System.out.println(testCls.solution(7));
        System.out.println(testCls.solution(8));
        System.out.println(testCls.solution(9));
        System.out.println(testCls.solution(10));

    }

}
