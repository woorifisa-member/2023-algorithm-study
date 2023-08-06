/*
    문제 설명
    
    두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
    예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
*/
let result = 0;

const addFunc = (x, y) => {
  for (let i = x; i <= y; i++) {
    result += i;
  }
};

function solution(a, b) {
  a < b ? addFunc(a, b) : addFunc(b, a);
  return result;
}
