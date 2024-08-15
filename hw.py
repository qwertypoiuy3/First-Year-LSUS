#Karin Galicia
#Hw #3

initial_time_1 = int(input("At what time did you start working? (hour)"))
initial_time_2 = int(input("At what time did you start working? (minute)"))
end_time_1 = int(input("At what time did you finish? (hour)"))
end_time_2 = int(input("At what time did you finish? (minute)"))

first = (end_time_1 - initial_time_1) * 60 + end_time_2 - initial_time_2

break_start_1 = int(input("At what time did you start your break? (hour)"))
break_start_2 = int(input("At what time did you start your break? (minute)"))
break_end_1 = int(input("At what time did your break end? (hour)"))
break_end_2 = int(input("At what time did you break end? (minute)"))

second = (break_end_1 - break_start_1) * 60 + break_end_2 - break_start_2

result = first - second

print("Total time worked in minutes is: " ,result)
print("Hours: " ,result // 60 , " minutes: " ,result % 60)
