# 시간 초과
# def solution(participant, completion):
#     answer = ''
    
#     for c in completion:
#         if c in participant:
#             participant.remove(c)
    
#     answer = participant[0]
    
#     return answer

def solution(participant, completion):
    dict = {}
    for p in participant:
        if p in dict:
            dict[p] += 1
        else:
            dict[p] = 1
            
    for c in completion:
        if dict[c] == 1:
            del dict[c]
        else:
            dict[c] -= 1
            
    return list(dict.keys())[0]