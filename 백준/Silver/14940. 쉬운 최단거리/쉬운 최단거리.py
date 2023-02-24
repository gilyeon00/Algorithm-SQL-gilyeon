from collections import deque

n, m = map(int, input().split())
q = deque()
originmap = []
visited = [ [False] * m for _ in range(n) ]
result = [ [-1] * m for _ in range(n)]

for i in range(n):
    row = list(map(int, input().split()))

    for j in range(m):
        if row[j] == 2:
            q.append((i,j))
            visited[i][j] = True
            result[i][j] = 0
        if row[j] == 0:
            result[i][j] = 0

    originmap.append(row)

direction = [ (1,0), (-1,0), (0,1), (0,-1) ]
while q:
    x, y = q.popleft()

    for dx, dy in direction:
        nx, ny = x + dx, y + dy

        if 0 <= nx < n and 0<= ny < m and not visited[nx][ny] and originmap[nx][ny]==1:
            q.append((nx, ny))
            visited[nx][ny] = True
            result[nx][ny] = result[x][y] + 1

for row in result:
    for i in row:
        print(i, end=" ")
    print()




