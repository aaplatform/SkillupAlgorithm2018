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
public class C12903 {

    public String solution(String s) {
        String answer = "";

        if(s != null) {
            int slength = s.length();
            //짝수 문자
            if(slength%2 == 0) {
                answer = s.substring(slength/2-1, slength/2+1);
            } else {
                // 홀수
                answer = String.valueOf(s.charAt(slength/2));
            }
        }

        return answer;
    }

    /**TODO Javadoc주석작성
     * @param args
     */
    public static void main(String[] args) {
        C12903 sm = new C12903();

        System.out.println(sm.solution("abcde"));
        System.out.println(sm.solution("qwer"));

    }

}
