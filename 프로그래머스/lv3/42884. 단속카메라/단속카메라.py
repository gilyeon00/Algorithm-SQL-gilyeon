def solution(routes):
    # 문제 잘못이해
#     answer = 0
#     cam_list = [0] * 60001
    
#     for route in routes:
#         a,b = route
#         a += 30000
#         b += 30000
#         for i in range(a, b+1):
#             cam_list[i] += 1
            
#     answer = max(cam_list)
    answer = 0
    routes.sort(key=lambda x: x[1]) # 가장빨리 나온차부터 보려고
    cam_list = [ routes[0][1] ]
    
    for i in range(1, len(routes)):
        if routes[i][0] <= cam_list[-1] and routes[i][1] >= cam_list[-1]:   # 겹치는 부분 있을 때
            continue
        else:   # 겹치는 부분이 없을 때 
            cam_list.append(routes[i][1])
        
    answer = len(cam_list)
    return answer
