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
public class C12922 {

    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        int sbCount = n/2;
        for(int i=0; i<sbCount; i++) {
            sb.append("수박");
        }
        if(n%2==1) {
            sb.append("수");
        }

        return sb.toString();

        //return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }

    /**TODO Javadoc주석작성
     * @param args
     */
    public static void main(String[] args) {
        C12922 testCls = new C12922();
        System.out.println(testCls.solution(3));
        System.out.println(testCls.solution(4));

    }

}
