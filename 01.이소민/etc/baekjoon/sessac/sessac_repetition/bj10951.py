# 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

while 1:
    try:
        a, b = map(int, input().split())
        print(a + b)
    except:
        break
# => try except 으로 입력값이 없는 경우의 오류를 캐치해서 break로 반복문 나옴