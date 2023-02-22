from itertools import product

def solution(word):
    answer = 0
    
    # for i in range(1, 6):
    #     word = product('A', repeat = i)
    #     for i in word:
    #         print(i)
    
    word_list = []

    for i in range(1, 6):
        for w in product(['A','E','I','O','U'], repeat = i):
            s = ''.join(w)
            word_list.append(s)
    
    
    word_list.sort()
    answer = word_list.index(word) + 1
    
    return answer