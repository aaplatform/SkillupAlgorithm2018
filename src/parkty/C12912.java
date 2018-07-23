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
public class C12912 {

    public long solution(int a, int b) {
        long starttime = System.currentTimeMillis();

        long answer = 0;

        if(a != b) {
            long small = a;
            long large = b;
            if(a>b) {
                small = b;
                large = a;
            }

            //곱하기 이용
            long pairSum = small+large;
            if((large-small)%2==0) {  //홀수개
                // 쌍합계 * 쌍개수 + 쌍중간값
                answer = pairSum * (large-small)/2L + (pairSum/2L) ;
            } else {                 // 짝수개
                // 쌍합계 * 쌍개수
                answer = pairSum * (large-small+1)/2L;
            }
        } else {
            answer = a;
        }

        System.out.print("Elapsed Time : " + (System.currentTimeMillis()-starttime) + "ms ,  ");

        return answer;
    }

    public long solution2(int a, int b) {
        long starttime = System.currentTimeMillis();

        long answer = 0;
        int min;
        int max;
        if(a>b){
            max=a;
            min=b;
        }else{
            max=b;
            min=a;
        }

        for(long i =min;i<=max;i++){
            answer += i;
        }

        System.out.print("Elapsed Time : " + (System.currentTimeMillis()-starttime) + "ms ,  ");

        return answer;
    }

    public static void main(String[] args) {
        C12912 sbi = new C12912();
        System.out.println("solution one");
        System.out.println(sbi.solution(3, 5));
        System.out.println(sbi.solution(3, 3));
        System.out.println(sbi.solution(5, 3));
        System.out.println(sbi.solution(0, 10000000));
        System.out.println("solution two");
        System.out.println(sbi.solution2(3, 5));
        System.out.println(sbi.solution2(3, 3));
        System.out.println(sbi.solution2(5, 3));
        System.out.println(sbi.solution2(0, 10000000));

        //        System.out.println(Integer.MAX_VALUE);
        //        System.out.println(sbi.solution(0, Integer.MAX_VALUE));
        //        System.out.println(sbi.solution2(0, Integer.MAX_VALUE));
    }

}
