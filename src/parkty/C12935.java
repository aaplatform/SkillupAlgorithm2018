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
public class C12935 {

    public int[] solution(int[] arr) {

        int[] answer = {-1};

        int arrLength = arr.length;
        if(arrLength != 1) {

            int miniumIdx = 0;
            for(int i=0; i<arrLength; i++) {
                if(arr[miniumIdx]>arr[i]) {
                    miniumIdx = i;
                }
            }

            answer = new int[arrLength-1];
            int resultIdx = 0;
            for(int i=0; i<arrLength; i++) {
                if(i != miniumIdx) {
                    answer[resultIdx++] = arr[i];
                }
            }
        }

        return answer;
    }

    /**TODO Javadoc주석작성
     * @param args
     */
    public static void main(String[] args) {
        C12935 testCls = new C12935();
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(testCls.solution(arr)));

    }

}
