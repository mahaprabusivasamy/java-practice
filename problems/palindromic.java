class Solution {
    public boolean isPalindrome(int x) {
        int sum=0,r,temp;
        temp=x;
        while(x>0)
        {r=x%10;
        sum=(sum*10)+r;
          x=x/10; 
        }
        if(sum==temp)
        {
            return true;
        }
        else
       
        return false;
       
  }
    public static void main(String args[])
    {
        Scanner ss=new Scanner(System.in);
        Solution bb=new Solution();
        int a=ss.nextInt();
        bb.isPalindrome(a);
    }
  }
