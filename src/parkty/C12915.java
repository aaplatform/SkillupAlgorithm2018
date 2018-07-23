/*
 * Copyright (C) 2015 LG CNS Inc.
 * All rights reserved.
 *
 * 모든 권한은 LG CNS(http://www.lgcns.com)에 있으며,
 * LG CNS의 허락없이 소스 및 이진형식으로 재배포, 사용하는 행위를 금지합니다.
 */
package programmers.level1;

import java.util.Arrays;
import java.util.TreeMap;

/**
 * TODO Javadoc주석작성
 *
 * @author R11224
 * @version $Id: lgcns-code-templates-java.xml 426 2012-04-10 07:49:33Z designtker $
 */
public class C12915 {

    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        TreeMap<String,String> tm = new TreeMap<>();

        int stringsLen = strings.length;
        for(int i=0; i<stringsLen; i++) {
            tm.put(strings[i].charAt(n) + strings[i], strings[i]);
        }

        answer = tm.values().toArray(answer);

        return answer;
    }

    public static void main(String[] args) {
        C12915 mms = new C12915();
        System.out.println(Arrays.toString(mms.solution(new String[]{"abce", "abcd", "cdx"},1)));

    }

}
