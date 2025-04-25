'''a=0
for i in range(5):
    for j in range(i+1):
        if(i==j):
            continue
        a=a+2
    a+a+1
print(a)'''
'''def flower(a):
    if(a==4):
        return
    print(a+10,end=" ")
    flower(a+1)
    print(a,end=" ")
flower(1)'''

#count the string elements in a line
'''s=input("enter the  string")
res=" "
c=1
for i in range(len(s)-1):
    if(s[i]==s[i+1]):
        c=c+1
    else:
        res=res+s[i]
        res=res+str(c)
        c=1
res=res+s[-1]+str(c)
print(res)'''

#flames question
'''bname=input("enter the girl name:")
gname=input("enter the boy name:")
l1=list(bname)
l2=list(gname)
for i in range(len(l1)):
    for j in range (len(l2)):
        if(l1[i]==l2[j]):
            l1[i]='2'
            l2[j]='2'

x=sum(1 for i in l1 if i!='2')
y=sum(1 for j in l2 if j!='2')
print(x)
print(y)
count=x+y
ans=['F','L','A','M','E','S']
i=0
while(len(ans)>1):
    i=(i+count-1) % len(ans)
    ans.pop(i)
print(ans)
'''
'''def isround(n):
    res=[]
    while(n!=1):
        if(n in res):
            return False
        res.append(n)
        n=sum((int i) * int(i))'''
# ranking problem
'''def percentage(person):
    tot=sum(person["marks"])
    return tot/4
a=[
    {"name":"raju" ,"age":24 ,"marks":[69,75,85]},
    {"name":"mohan" ,"age":23 ,"marks":[58,92,91]},
    {"name":"rosy" ,"age":22 ,"marks":[79,86,98]},
    {"name":"raju" ,"age":24 ,"marks":[90,97,88]}
]
b=sorted(a,key=percentage,reverse=True)
print(b)
pos=1
for i in b:
    print("{} has score {}% ---->stands {}".format(i["name"],percentage(i),[pos]))
    pos=pos+1'''
#finding the time in a location
'''from datetime import datetime
import pytz

a = pytz.timezone('Asia/Kolkata')
b = datetime.now(a)
print(b)'''

#displaed the digital time
'''import time
h, m, s = 4, 3, 0
while True:
    print(f"\r{h:02d} : {m:02d} : {s:02d}", end='', flush=True)
    time.sleep(1)
    s += 1
    if s == 60:
        s = 0
        m += 1
    if m == 60:
        m = 0
        h += 1'''
#using the three variable in single loop
'''for i,j,k in zip(range(1,50),range(99,50,-1),range(100,150)):
    print(i,end=" ")
    print(j,end=" ")
    print(k,end=" ")
    print()'''





