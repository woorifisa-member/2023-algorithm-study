# 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
input_number = int(input())
result = 1

while input_number > 0:
    result *= input_number
    input_number -= 1

print(result)