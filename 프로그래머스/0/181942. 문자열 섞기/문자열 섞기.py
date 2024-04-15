def solution(str1, str2):
    answer = ''
    if len(str1) > len(str2):
        for i in range(len(str2)):
            answer += str1[i]
            answer += str2[i]
        
    else:
        for i in range(len(str1)):
            answer += str1[i]
            answer += str2[i]

    
    return answer