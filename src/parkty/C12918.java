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
public class C12918 {

    public boolean solution(String s) {
        boolean answer = false;

        int strLength = s.length();
        if(strLength==4 || strLength==6 ) {
            try{
                Integer.valueOf(s);
                answer = true;
            } catch(NumberFormatException ex) {
            }
        }

        return answer;
    }

    /**TODO Javadoc주석작성
     * @param args
     */
    public static void main(String[] args) {
        C12918 cn = new C12918();
        System.out.println(cn.solution("a234"));
        System.out.println(cn.solution("01234"));

    }

}
