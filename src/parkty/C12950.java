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
public class C12950 {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int r=0; r<arr1.length; r++) {
            for(int c=0; c<arr1[0].length; c++) {
                answer[r][c] = arr1[r][c] + arr2[r][c];
            }
        }

        return answer;
    }

    /**TODO Javadoc주석작성
     * @param args
     */
    public static void main(String[] args) {
        C12950 testCls = new C12950();
        long starttime = System.currentTimeMillis();
        //System.out.println(testCls.solution(6));
        //System.out.println(testCls.solution(16));
        System.out.println(Arrays.toString(testCls.solution(new int[][]{{1,2},{2,3}}, new int[][]{{3,4},{5,6}})));
        System.out.print("Elapsed Time : " + (System.currentTimeMillis()-starttime) + "ms ,  ");
    }

}
