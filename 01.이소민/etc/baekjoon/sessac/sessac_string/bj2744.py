# 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
result = ""

for i in input():
    if i.isupper():
        result += i.lower()
    else:
        result += i.upper()

print(result)