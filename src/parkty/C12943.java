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
public class C12943 {

    public int solution(int num) {
        int count = 0;

        if(num>1) {
            while(true) {
                if(num%2==0) {
                    num /=2;
                } else {
                    num = num*3+1;
                }
                count++;
                if(num==1 || count==500){
                    break;
                }
            }
        }

        return num==1?count:-1;
    }

    /**TODO Javadoc주석작성
     * @param args
     */
    public static void main(String[] args) {
        C12943 testCls = new C12943();
        long starttime = System.currentTimeMillis();
        //System.out.println(testCls.solution(6));
        //System.out.println(testCls.solution(16));
        System.out.println(testCls.solution(626331));
        System.out.print("Elapsed Time : " + (System.currentTimeMillis()-starttime) + "ms ,  ");
    }

}
