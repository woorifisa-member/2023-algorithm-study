# 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
t = int(input())

for i in range(t):
    s = input()
    print(s[0] + s[len(s)-1])