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
public class C12916 {

    boolean solution(String s) {
        boolean answer = true;

        int pCount = 0;
        int yCount = 0;

        int strLength = s.length();
        for(int i=0; i<strLength; i++) {
            if('p' == s.charAt(i) || 'P' == s.charAt(i)) {
                pCount++;
            } else if('y' == s.charAt(i) || 'Y' == s.charAt(i)) {
                yCount++;
            }
        }

        answer = (pCount==yCount)?true:false;

        return answer;
    }

    /**TODO Javadoc주석작성
     * @param args
     */
    public static void main(String[] args) {
        C12916 pycount = new C12916();
        System.out.println(pycount.solution("pPoooyY"));
        System.out.println(pycount.solution("Pyy"));

    }

}
