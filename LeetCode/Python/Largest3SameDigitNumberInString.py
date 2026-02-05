def largestGoodInteger(num: str) -> str:
        for i in range(9,-1,-1):
            check=str(i)*3
            if check in num:
                return check
        return ""
    
s="6777133339"
print(largestGoodInteger(s))

# Input: num = "6777133339"
# Output: "777"

# Input: num = "2300019"
# Output: "000"

# Input: num = "42352338"
# Output: ""