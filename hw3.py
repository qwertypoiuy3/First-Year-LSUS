#Karin Galicia
#Hw 3

startingWeight = input("Enter the starting weight of the food: ")
find = startingWeight.find(":")
lbs = startingWeight[0:find]
ozs = startingWeight[find+1:]
mult = (int(lbs) * 16) + int(ozs)

endingWeight = input("Enter the ending weight of the food: ")
find2 = endingWeight.find(":")
lbs2 = endingWeight[0:find2]
ozs2 =  endingWeight[find2+1:]
mult2 = (int(lbs2) * 16) + int(ozs2)

op = (mult - mult2) / 16
print(op)
