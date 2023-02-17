def solution(s, skip, index):
    answer = ''
    target_idx = 0

    alph = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
    
    for i in range(len(skip)):
        if skip[i] in alph:
             alph.pop(alph.index(skip[i]))
                
    for i in range(len(s)):
        answer += alph[(alph.index(s[i]) + index) % len(alph)]
        
            
    return answer