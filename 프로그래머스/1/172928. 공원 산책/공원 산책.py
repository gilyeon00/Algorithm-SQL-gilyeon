def solution(park, routes):
    
    # 시작점, 맵, 방향 정의
    y, x = 0 ,0
    h, w = len(park), len(park[0])
    op = {'N' : (-1, 0), 'S' : (1, 0), 'E': (0, 1), 'W': (0, -1)}
    
    
    # 시작점 찾기
    for i in range(len(park)):
        start_index = park[i].find("S")
        if start_index != -1:
            x = start_index
            y = i
            break
    
    
    # 이동
    for route in routes:
        dx, dy = op.get(route.split(" ")[0])
        n = int(route.split(" ")[1])

        xx, yy = x, y   # 현재위치
        canmove = True
        
        for _ in range(n):
            # 이동할 위치
            nx = xx + dy
            ny = yy + dx
            
            if 0 <= ny <= len(park)-1 and 0<= nx <= len(park[0])-1 and park[ny][nx] != 'X':
                canmove = True
                xx, yy = nx, ny
            else:
                canmove = False
                break
        
        if canmove:
            x, y = nx, ny
        
    return [y, x]