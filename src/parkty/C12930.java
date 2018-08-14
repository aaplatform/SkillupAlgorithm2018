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
public class C12930 {

    public String solution(String s) {

        boolean isOdd = true;
        char[] sChar = s.toCharArray();
        for(int i=0; i<sChar.length; i++) {
            if(sChar[i] != ' ') {
                if(isOdd){
                    sChar[i] = Character.toUpperCase(sChar[i]);
                } else {
                    sChar[i] = Character.toLowerCase(sChar[i]);
                }
                isOdd = !isOdd;
            } else {
                isOdd = true;
            }
        }
        return new String(sChar);
    }


    /**TODO Javadoc주석작성
     * @param args
     */
    public static void main(String[] args) {
        C12930 testCls = new C12930();
        System.out.println(testCls.solution("try  hello world"));

    }

}
