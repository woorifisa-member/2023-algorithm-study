// 문제
// X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.

// 교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.

// 입력
// 입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 출석번호에 중복은 없다.

// 출력
// 출력은 2줄이다. 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고, 2번째 줄에선 그 다음 출석번호를 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //숫자를 미리 저장해둔 배열(인덱스 1부터 30까지 사용)ㄴ
        int [] students = new int [31];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력된 숫자의 배열 부분에 1 저장(2명 덜 제출하므로 0~27)
        for(int i = 0; i<28 ; i++){
            int submit = Integer.parseInt(br.readLine());
            students[submit]=1;
        }

        //미제출 학생 출력
        for(int i=1; i<students.length; i++){
            if(students[i] !=1){
                System.out.println(i);
            }
        }
        br.close();
        //--- Scanner 사용해서 풀어봄
//        Scanner sc = new Scanner(System.in);
//        int[] students = new int[30];
//        for(int i =0; i<28;i++){
//            int submit = sc.nextInt();
//            students[submit]=1;
//        }
//        for(int i = 0; i<30; i++){
//            if(students[i]!=1){
//                System.out.println(i);
//            }
//        }
//        sc.close();
//    }
    }

}
