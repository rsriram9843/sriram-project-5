"""def pattern(str,n):
    for i in range(n):
        for j in range(n):
            if((i+j==n-1 and i<n/2) or (i==j and i<n/2)):
                print(str[j], end=" ")
            else:
                print(" ", end=" ")
        print()
str=input()
n=len(str)
pattern(str,n)
"""
str=input()
l=len(str)
for i in range(0,l):
    for j in range(0,l*2-1):
        if(i==j or i+j==l*2-2):
            print(str[i],end=" ")
        else:
            print(" ",end=" ")
    print()
