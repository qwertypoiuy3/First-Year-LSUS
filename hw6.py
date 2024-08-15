O = [1]
for i in range(0,8):
    e = O[i] + O[i - 1]
    O.append(e)

for a in range(8,-1,-1):
    print(O[a], end = ', ')
print("1")
