#Karin Galicia
#Hw 4

n = 5
print("Rate Principal Simple Compound")
for rate in range(5,16,5):
    for principal in range(10000,15001,1000):
        simple = principal * (1 + (rate / 100) * n)
        compound = principal * (1 + (rate / 100)) ** n
        print("%" + str(rate) + " $" + str(principal) + " " + "$" + str(simple) + "0 $" + str(round(compound,2)))
    
