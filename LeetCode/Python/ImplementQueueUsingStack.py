class MyQueue:

    def __init__(self):
        self.input=[]
        self.output=[]

    def push(self, x: int) -> None:
        self.input.append(x)

    def pop(self) -> int:
        self.peek()
        return self.output.pop()

    def peek(self) -> int:
        if not self.output:
            while self.input:
                self.output.append(self.input.pop())
        return self.output[-1]

    def empty(self) -> bool:
        return not self.input and not self.output
        


obj = MyQueue()
obj.push(1)
obj.push(2)
obj.push(3)
print(obj.peek()) #1
print(obj.pop()) #1
print(obj.peek()) #2
print(obj.empty()) # false