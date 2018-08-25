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
public class C12909 {

    boolean solution(String s) {
        boolean answer = true;

        int openBracketCount = 0;

        char[] sChars = s.toCharArray();
        for(char one : sChars) {
            if(one == '('){
                openBracketCount++;
            }else{
                openBracketCount--;
            }

            if(openBracketCount < 0) {
                answer = false;
                break;
            }
        }
        if(openBracketCount != 0) {
            answer = false;
        }

        return answer;
    }

    /**TODO Javadoc주석작성
     * @param args
     */
    public static void main(String[] args) {
        C12909 testCls = new C12909();

        System.out.println(testCls.solution("()()"));
        System.out.println(testCls.solution("(())()"));
        System.out.println(testCls.solution(")()("));
        System.out.println(testCls.solution("(()("));

    }

}
