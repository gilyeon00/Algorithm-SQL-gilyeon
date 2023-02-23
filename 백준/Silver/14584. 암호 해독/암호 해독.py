secret = input()
n = int(input())

word_list = []
for i in range(n):
    word_list.append(input())

# alph = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
ans = ''

# secret_list= []
# for i in range(len(secret)):
#     secret_list.append(i)

for i in range(1,27):
    tmp = ''
    for s in secret:
        tmp += chr( (ord(s)-97+i)%26 +97 )

    for word in word_list:
        if word in tmp:
            ans =  tmp
            break

print(ans)