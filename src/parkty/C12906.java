/*
 * Copyright (C) 2015 LG CNS Inc.
 * All rights reserved.
 *
 * 모든 권한은 LG CNS(http://www.lgcns.com)에 있으며,
 * LG CNS의 허락없이 소스 및 이진형식으로 재배포, 사용하는 행위를 금지합니다.
 */
package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * TODO Javadoc주석작성
 *
 * @author R11224
 * @version $Id: lgcns-code-templates-java.xml 426 2012-04-10 07:49:33Z designtker $
 */
public class C12906 {

    public int[] solution(int []arr) {
        int[] answer = {};

        ArrayList<Integer> dlir = new ArrayList<>();
        dlir.add(arr[0]);

        for(int one : arr) {
            if(one != dlir.get(dlir.size()-1)) {
                dlir.add(one);
            }
        }

        answer = new int[dlir.size()];
        int ditSize = dlir.size();
        for(int i=0; i<ditSize; i++) {
            answer[i] = dlir.get(i);
        }

        // java8
        //int[] array = dlir.stream().mapToInt(i->i).toArray();

        return answer;
    }

    public Integer[] solution2(int []arr) {
        ArrayList<Integer> dlir = new ArrayList<>();
        dlir.add(arr[0]);

        for(int one : arr) {
            if(one != dlir.get(dlir.size()-1)) {
                dlir.add(one);
            }
        }

        Integer[] answer = dlir.toArray(new Integer[0]);

        return answer;
    }

    public static void main(String[] args) {
        C12906 dlir = new C12906();
        int[] arr1 = {1,1,3,3,0,1,1};
        int[] arr2 = {4,4,4,3,3};
        System.out.println(Arrays.toString(dlir.solution(arr1)));
        System.out.println(Arrays.toString(dlir.solution(arr2)));
        System.out.println();
        System.out.println(Arrays.toString(dlir.solution2(arr1)));
        System.out.println(Arrays.toString(dlir.solution2(arr2)));

    }

}
