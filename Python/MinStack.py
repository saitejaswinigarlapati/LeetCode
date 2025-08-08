class MinStack:

    def __init__(self):
        self.__stack=[]
        self.__minstack=[]

    def push(self, val: int) -> None:
        self.__stack.append(val)
        if not self.__minstack:
            self.__minstack.append(val)
        else:
            if self.__minstack[-1] >= val:
                self.__minstack.append(val)
            

    def pop(self) -> None:
        if self.__stack[-1]==self.__minstack[-1]:
            self.__minstack.pop()
        self.__stack.pop()

        

    def top(self) -> int:
        return self.__stack[-1]
        

    def getMin(self) -> int:
        return self.__minstack[-1]
        



obj = MinStack()
obj.push(-2)
obj.push(0)
obj.push(4)
obj.push(-3)
print(obj.getMin()) # -3
obj.pop()
print(obj.top()) # 4
print(obj.getMin()) # -2

