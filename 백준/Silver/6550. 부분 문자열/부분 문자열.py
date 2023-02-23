import sys
input = sys.stdin.readline

while True:
    str = input().rstrip()
    if not str:
        break
    
    s, target = str.split()

    idx = 0
    flag = False

    for i in range( len(target) ):
        if target[i] == s[idx]:
            idx += 1
            if idx == len(s):
                flag = True
                break
    
    if flag == True:
        print('Yes')
    else:
        print("No")