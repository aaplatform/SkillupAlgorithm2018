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
public class C12948 {

    public String solution(String phone_number) {
        String answer = "";

        /* 문자 변환 - 느림
        int length = phone_number.length();
        answer = String.format("%"+length+"s", phone_number.substring(length-4)).replace(" ", "*");
         */

        // 배열 처리 - 빠름
        char[] numberChars = phone_number.toCharArray();
        for(int i=0; i<numberChars.length-4; i++) {
            numberChars[i] = '*';
        }
        answer = String.valueOf(numberChars);

        return answer;
    }

    /**TODO Javadoc주석작성
     * @param args
     */
    public static void main(String[] args) {
        C12948 testCls = new C12948();
        long starttime = System.currentTimeMillis();
        //System.out.println(testCls.solution(6));
        //System.out.println(testCls.solution(16));
        System.out.println(testCls.solution("01033334444"));
        System.out.print("Elapsed Time : " + (System.currentTimeMillis()-starttime) + "ms ,  ");
    }

}
