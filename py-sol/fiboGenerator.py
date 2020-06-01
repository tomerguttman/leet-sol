# Here is an example generator which calculates fibonacci numbers:
# generator version
def fibo1(number):
    a0 =  0
    a1 = 1
    for i in range(number):
        yield a0
        temp = a0
        a0 = a1
        a1 = temp + a1

for x in fibo1(100):
    print(x)

def fibo2(number):
    a0 =  0
    a1 = 1
    result = []
    for i in range(number):
        result.append(a0)
        temp = a0
        a0 = a1
        a1 = temp + a1
    return result
    
print(fibo2(100))