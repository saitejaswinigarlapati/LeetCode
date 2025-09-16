class MyHashSet:

    def __init__(self):
        self.hp={}
    def add(self, key: int) -> None:
        self.hp[key]=True
    def remove(self, key: int) -> None:
        if key in self.hp:
            del self.hp[key]

    def contains(self, key: int) -> bool:
        return key in self.hp


# Your MyHashSet object will be instantiated and called as such:
obj = MyHashSet()
obj.add(1)
obj.add(2)
obj.add(3)
obj.add(4)
obj.add(5)
obj.add(6)

obj.remove(3)
param_1 = obj.contains(2)
param_2 = obj.contains(22)

print(obj.hp)
print(param_1)
print(param_2)