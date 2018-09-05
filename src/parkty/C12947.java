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
public class C12947 {

    public boolean solution(int x) {
        boolean answer = true;

        int jariSum = 0;
        int copyX = x;

        while(copyX>0) {
            jariSum += copyX%10;
            copyX /= 10;
        }

        answer = (x%jariSum==0);

        return answer;
    }

    /**TODO Javadoc주석작성
     * @param args
     */
    public static void main(String[] args) {
        C12947 testCls = new C12947();
        long starttime = System.currentTimeMillis();
        //System.out.println(testCls.solution(6));
        //System.out.println(testCls.solution(16));
        System.out.println(testCls.solution(10));
        System.out.print("Elapsed Time : " + (System.currentTimeMillis()-starttime) + "ms ,  ");
    }

}
