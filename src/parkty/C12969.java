/*
 * Copyright (C) 2015 LG CNS Inc.
 * All rights reserved.
 *
 * 모든 권한은 LG CNS(http://www.lgcns.com)에 있으며,
 * LG CNS의 허락없이 소스 및 이진형식으로 재배포, 사용하는 행위를 금지합니다.
 */
package programmers.level1;

import java.util.Scanner;

/**
 * TODO Javadoc주석작성
 *
 * @author R11224
 * @version $Id: lgcns-code-templates-java.xml 426 2012-04-10 07:49:33Z designtker $
 */
public class C12969 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        long starttime = System.currentTimeMillis();


        // 하나하나 출력 : 제일 느림
        for(int j=0; j<b; j++) {
            for(int i=0; i<a; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Elapsed Time : " + (System.currentTimeMillis()-starttime) + "ms ,  ");



        starttime = System.currentTimeMillis();

        // char배열로 별 문자를 만들어 출력 : 제일 빠름
        char[] starChars = new char[a];
        for(int i=0; i<a; i++) {
            starChars[i] = '*';
        }
        String stars = String.valueOf(starChars);
        for(int j=0; j<b; j++) {
            System.out.println(stars);
        }

        System.out.println("Elapsed Time : " + (System.currentTimeMillis()-starttime) + "ms ,  ");


        starttime = System.currentTimeMillis();

        // String format을 이용해서 별 문자를 만들어 출력 : 중간
        String formatStars = String.format("%"+a+"s", "").replace(" ", "*");
        for(int j=0; j<b; j++) {
            System.out.println(formatStars);
        }

        System.out.println("Elapsed Time : " + (System.currentTimeMillis()-starttime) + "ms ,  ");
    }

}
