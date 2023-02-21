def solution(numbers, target):
    
    super = [0]
    for num in numbers:
        sub = []
        for s in super:
            sub.append(s+num)
            sub.append(s-num)
        super = sub
        
    answer = super.count(target)
    
    return answer