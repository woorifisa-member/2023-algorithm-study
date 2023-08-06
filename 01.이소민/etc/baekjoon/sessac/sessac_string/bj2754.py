'''
어떤 사람의 C언어 성적이 주어졌을 때, 평점은 몇 점인지 출력하는 프로그램을 작성하시오.

A+: 4.3, A0: 4.0, A-: 3.7

B+: 3.3, B0: 3.0, B-: 2.7

C+: 2.3, C0: 2.0, C-: 1.7

D+: 1.3, D0: 1.0, D-: 0.7

F: 0.0
'''

result = input()

if result == 'A+': print(4.3)
elif result == 'A0': print(4.0)
elif result == 'A-': print(3.7)
elif result == 'B+': print(3.3)
elif result == 'B0': print(3.0)
elif result == 'B-': print(2.7)
elif result == 'C+': print(2.3)
elif result == 'C0': print(2.0)
elif result == 'C-': print(1.7)
elif result == 'D+': print(1.3)
elif result == 'D0': print(1.0)
elif result == 'D-': print(0.7)
elif result == 'F': print(0.0)
