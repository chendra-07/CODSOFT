def sub(a, b):
	return a - b

def div(a, b):
    return a / b

def mul(a, b):
	return a * b

def add(a, b):
    return a + b

print("Welcome to Simple Calculator\n" \
		"1. Addition (+)\n" \
		"2. Subtraction (-)\n" \
		"3. Multiplication (*)\n" \
		"4. Divide (\)\n")

ch = int(input("\nEnter your choice :"))

a = int(input("Enter first number: "))
b = int(input("Enter second number: "))

if ch == 1:
    print("Sum= ",add(a , b))

elif ch == 2:
    print("Difference= ",subtract(a, b))

elif ch == 3:
    print("Product= ",multiply(a, b))

elif ch == 4:
    print("Quotient= ",divide(a , b))
else:
    print("Invalid input")
