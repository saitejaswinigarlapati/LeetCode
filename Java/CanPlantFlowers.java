public class CanPlantFlowers {
    public boolean canPlantFlowers(int[] flowerbed,int n){
        for(int i=0;i<flowerbed.length;i++){
            if (flowerbed[i]==0){
                boolean left =(i==0) || (flowerbed[i-1]==0);
                boolean right=(i==flowerbed.length || (flowerbed[i+1]==0));
                
                if (left && right){
                    flowerbed[i]=1;
                    n--;
                    if (n==0){
                    return true;
                    }
                }
            }
        }
        return n <= 0;
    }
    public static void main(String[] args) {
        CanPlantFlowers obj=new CanPlantFlowers();
        int[] flowerbed ={1,0,0,0,1};
        int n=1;
        System.out.print("Can plant flowers : " + obj.canPlantFlowers(flowerbed, n));
    }
}
