#Karin Galcia
#Hw 4

name = input("Enter employee's name: ")
totalPay = 0
while name != "zzzz ":
    hours = int(input("Enter employee’s hours worked: "))
    rate = int(input("Enter employee's hourly rate of pay: "))
    if hours > 40:
        pay = rate * 40 + (hours - 40) * 1.5 * rate
    else:
        pay = rate * hours
    print (name + "'s pay=$" + str(pay))
    name = input("Enter employee's name: ")
    totalPay = totalPay + pay
print ("Total pay =$" + str(totalPay))
