import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n11659 {
	public static void main(String[] args) throws IOException {
		// 데이터의 개수, 질의 개수 입력 받아서 dataNum, questNum int에 저장하기
		BufferedReader  bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

		int dataNum = Integer.parseInt(stringTokenizer.nextToken());
		int questNum = Integer.parseInt(stringTokenizer.nextToken());

		// 구간 합을 구할 대상 배열을 dataNum 크기 만큼 입력 받아서 배열에 저장하기
		int[] array = new int[dataNum + 1]; // 0 5 9 12 14 15
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for(int i = 1; i < dataNum + 1; i++) {
			array[i] = array[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
		}

		// questNum 만큼의 반복문을 실행하여 구간합을 시작 인덱스 i, 마지막 인덱스 j를 입력받기
		int startIndex = 0, lastIndex = 0;
		for(int i=0;i<questNum;i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			startIndex = Integer.parseInt(stringTokenizer.nextToken());
			lastIndex = Integer.parseInt(stringTokenizer.nextToken());

			// 입력 받은 구간의 합을 더하고 출력하기
			System.out.println(array[lastIndex] - array[startIndex - 1]);
		}

	}
}
