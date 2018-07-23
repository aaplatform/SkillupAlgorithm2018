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
public class C12917 {

    public String solution(String s) {
        String answer = "";

        int strLength = s.length();
        char[] sca = s.toCharArray();
        Arrays.sort(sca);

        char[] dsca = new char[strLength];
        for(int i=0; i<strLength; i++) {
            dsca[strLength-i-1] = sca[i];
        }

        answer = String.valueOf(dsca);

        return answer;
    }

    /**TODO Javadoc주석작성
     * @param args
     */
    public static void main(String[] args) {
        C12917 sds = new C12917();
        System.out.println(sds.solution("Zbcdefg"));

    }

}
