# 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
n = int(input())
result = ""

for i in range(n):
    result += "*"
    print(result)