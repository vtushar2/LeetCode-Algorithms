class Solution {
    public int subtractProductAndSum(int n) {
        int mul=1;
        int sum=0;
        int t=n;
        int r=0;
        int j=0;
        while(n>0)
        {
            r=n%10;
            mul=mul*r;
            n=n/10;
            j=t%10;
            sum+=j;
            t=t/10;
        }
        return mul-sum;
        
        
    }
}
