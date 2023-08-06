// 문제
// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

// 출력
// 입력으로 주어진 숫자 N개의 합을 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String sNum = br.readLine();
        char[] cNum = sNum.toCharArray();
        int sum=0;
        for(int i = 0; i<cNum.length;i++){
            sum+=cNum[i] - '0'; //cNum[i]를 정수형으로 변환, sum에 더하며 누적
        }
        System.out.println(sum);
    }
}
