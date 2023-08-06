/*
    문제 설명
    단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

    재한사항
    s는 길이가 1 이상, 100이하인 스트링입니다.
*/
function solution(s) {
  let answer = "";

  const even = (num) => {
    const cutNum = num.length / 2;
    answer = num.substring(cutNum - 1, cutNum + 1);
  };

  const odd = (num) => {
    const cutNum = Math.floor(num.length / 2);
    answer = num.substring(cutNum, cutNum + 1);
  };

  s.length % 2 === 0 ? even(s) : odd(s);

  return answer;
}
