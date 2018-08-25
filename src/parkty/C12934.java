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
public class C12934 {

    public long solution(long n) {

        String nString = String.valueOf(n);
        char[] nStringChar = nString.toCharArray();
        Arrays.sort(nStringChar);

        return Long.parseLong(new StringBuilder(String.valueOf(nStringChar)).reverse().toString());
    }

    /**TODO Javadoc주석작성
     * @param args
     */
    public static void main(String[] args) {
        C12934 testCls = new C12934();
        System.out.println(testCls.solution(118372));

    }

}
