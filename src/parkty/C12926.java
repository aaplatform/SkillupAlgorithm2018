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
public class C12926 {

    public String solution(String s, int n) {
        char[] sChar = s.toCharArray();
        char[] sCaesarChar = new char[sChar.length];

        for(int i=0; i<sChar.length; i++) {
            if(sChar[i] == ' ') {
                sCaesarChar[i] = sChar[i];
            } else {
                if(Character.isLowerCase(sChar[i])) {
                    sCaesarChar[i] = (char)((sChar[i]-'a'+n) % 26 + 'a');
                } else {
                    sCaesarChar[i] = (char)((sChar[i]-'A'+n) % 26 + 'A');
                }
            }
        }

        return new String(sCaesarChar);
    }

    public String solution2(String s, int n) {

        String lowerAl = "abcdefghijklmnopqrstuvwxyz";
        char[] lowerAlChar = lowerAl.toCharArray();

        String uppperAl = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] uppperAlChar = uppperAl.toCharArray();


        char[] sChar = s.toCharArray();
        char[] sCaesarChar = new char[sChar.length];
        for(int i=0; i<sChar.length; i++) {
            if(sChar[i] != ' ') {
                if(lowerAl.contains(s.substring(i, i+1))) {
                    sCaesarChar[i] = lowerAlChar[(sChar[i]+n-97)%26];
                } else {
                    sCaesarChar[i] = uppperAlChar[(sChar[i]+n-65)%26];
                }
            } else {
                sCaesarChar[i] = sChar[i];
            }
        }

        return new String(sCaesarChar);
    }


    /**TODO Javadoc주석작성
     * @param args
     */
    public static void main(String[] args) {
        C12926 testCls = new C12926();
        System.out.println(testCls.solution("AB",1));
        System.out.println(testCls.solution("z",1));
        System.out.println(testCls.solution("a B z",4));

    }

}
