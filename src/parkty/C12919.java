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
public class C12919 {

    public String solution(String[] seoul) {
        String answer = "";

        int seoulLength = seoul.length;
        for(int i=0; i<seoulLength; i++) {
            if("Kim".equals(seoul[i])) {
                answer = "김서방은 "+ i +"에 있다";
                break;
            }
        }

        return answer;
    }

    /**TODO Javadoc주석작성
     * @param args
     */
    public static void main(String[] args) {
        C12919 cn = new C12919();
        System.out.println(cn.solution(new String[]{"Jane", "Kim"}));

    }

}
