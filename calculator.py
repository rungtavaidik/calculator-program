import operator

def calculate(x, y, op):
    ops = {
        '1': operator.add,
        '2': operator.sub,
        '3': operator.mul,
        '4': operator.truediv,
    }
    return ops[op](x, y)

x = int(input('Enter the first number: '))
y = int(input('Enter the second number: '))
print('Choose whether to:')
print('[1] ADD')
print('[2] SUBTRACT')
print('[3] MULTIPLY')
print('[4] DIVIDE')
op = input('')

result = calculate(x, y, op)
print(f'Result: {result}')
