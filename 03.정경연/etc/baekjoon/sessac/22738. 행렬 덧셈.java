// 문제
// N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다. 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

// 출력
// 첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //받은 값 공백 기준으로 분리
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //N과 M 받아 저장
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [][] A = new int [N][M];
        int [][] B = new int [N][M];
        int [][] result = new int[N][M];

        StringBuilder sb = new StringBuilder();

        //첫 번째 입력 값 저장
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0 ; j<M; j++){
                A [i][j]=Integer.parseInt(st.nextToken());
            }
        }

        //두 번째 입력 값 저장
        for(int i=0; i<N ; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j =0; j<M ; j++){
                B [i][j]=Integer.parseInt(st.nextToken());
            }
        }

        //두가지 값들을 저장할 배열
        for(int i=0; i<N ; i++){
            for(int j =0; j<M ; j++){
                result [i][j]=A[i][j]+B[i][j];
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
