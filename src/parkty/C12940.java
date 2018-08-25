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
public class C12940 {

    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int small = n;
        int large = m;
        if(small > large) {
            small = m;
            large = n;
        }
        //최대공약수
        answer[0] = maxCommonDiv(small, large);
        answer[0] = gcd(small, large);
        answer[1] = minCommonMul(small, large, small, large);

        return answer;
    }

    // 느림..
    public int maxCommonDiv2(int small, int large) {
        int maxComDiv = 1;

        int[] smallDivArr = new int[large];
        int[] largeDivArr = new int[large];
        for(int i=1; i<largeDivArr.length/2; i++) {
            if(small%i==0 && small<=i) {
                smallDivArr[i] = 1;
            }

            if(large%i==0) {
                largeDivArr[i] = 1;
            }
        }

        for(int i=smallDivArr.length-1; i>0; i--) {
            if(smallDivArr[i] == 1 && largeDivArr[i] == 1) {
                maxComDiv = i;
                break;
            }
        }

        return maxComDiv;
    }

    public int maxCommonDiv(int small, int large) {

        if(large%small==0) {
            return small;
        } else {
            for(int i=small/2; i>0; i--) {
                if(small%i==0 && large%i==0) {
                    return i;
                }
            }
        }

        return 1;
    }

    public int minCommonMul(int left, int right, int curtLefMulti, int curRightMul) {

        if(curtLefMulti<curRightMul) {
            if(curRightMul % left == 0) {
                return curRightMul;
            } else {
                curtLefMulti = (curRightMul/left) * left + left;
            }
            return minCommonMul(left, right, curtLefMulti, curRightMul);
        } else if(curtLefMulti>curRightMul) {
            if(curtLefMulti % right == 0) {
                return curtLefMulti;
            } else {
                curRightMul = (curtLefMulti/right) * right + right;
            }
            return minCommonMul(left, right, curtLefMulti, curRightMul);
        } else {
            return curtLefMulti;
        }
    }

    public int minCommonMul1(int left, int rigth, int curtLefMulti, int curRightMul) {

        if(curtLefMulti<curRightMul) {
            while(curtLefMulti<curRightMul) {
                curtLefMulti += left;
            }
            return minCommonMul(left, rigth, curtLefMulti, curRightMul);
        } else if(curtLefMulti>curRightMul) {
            while(curRightMul<curtLefMulti) {
                curRightMul += rigth;
            }
            return minCommonMul(left, rigth, curtLefMulti, curRightMul);
        } else {
            return curtLefMulti;
        }
    }

    public int gcd(int p, int q)
    {
        if (q == 0) {
            return p;
        }
        return gcd(q, p%q);
    }

    /**TODO Javadoc주석작성
     * @param args
     */
    public static void main(String[] args) {
        C12940 testCls = new C12940();
        //System.out.println(Arrays.toString(testCls.solution(3, 12)));
        System.out.println(Arrays.toString(testCls.solution(2, 5)));
        long starttime = System.currentTimeMillis();
        System.out.println(Arrays.toString(testCls.solution(1, 1000000)));
        System.out.print("Elapsed Time : " + (System.currentTimeMillis()-starttime) + "ms ,  ");
    }

}
