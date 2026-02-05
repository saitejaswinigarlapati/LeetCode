from typing import List
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        dic={}
        for i in nums:
            if i in dic:
                dic[i]+=1
            else:
                dic[i]=1
        sorted_dic=sorted(dic.items(),key=lambda x :x[1],reverse=True)
        res=[i[0] for i in sorted_dic[:k] ]
        return res
    
s=Solution()

ls=list(map(int,input("Enter the elements : ").split()))
k=int(input('k : '))
print(f"Top {k} frequent elements : {s.topKFrequent(ls,k)}")
