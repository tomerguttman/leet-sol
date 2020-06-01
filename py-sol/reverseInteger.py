def reverse(x):
    output = None
    if x > 0:
        output = int(str(x)[::-1])
    if x < 0:
        output = (-1)*int(str(x*(-1))[::-1])
    min_range = -2 ** 31
    max_range = 2**31 - 1
    if output not in range(min_range,max_range):
        return 0
    else:
        return output

print(reverse(123))