# N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
# 첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다.
# 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
a, b = [], []

n, m = map(int, input().split())

# a 배열 생성 : [[n,n,n], [n,n,n], [n,n,n]]
for row in range(n):
    row = list(map(int, input().split()))
    a.append(row)

# b 배열 생성 : [[n,n,n], [n,n,n], [n,n,n]]
for row in range(n):
    row = list(map(int, input().split()))
    b.append(row)

# a, b 배열 더한 배열 생성 [[n,n,n], [n,n,n], [n,n,n]] + [[n,n,n], [n,n,n], [n,n,n]]
for row in range(n):
    for col in range(m):
        print(a[row][col] + b[row][col], end=' ')
    print()