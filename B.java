import java.util.Scanner;

public class B {
    public static int cnt=0;
    public static int n=0;
    public static int s=0;
    public static int a=0;
    public static int b=0;
    public static int sum=0;
    public static void dfs(int i,int step)
    {
    	if(step==n)
    	{
    		if(sum==s)   		
    			{
    			cnt=(cnt + 1) % 100000007;
    			return;
    			}
    		return;   		
    	}
    	sum+=i;
    	dfs(i+a,step+1);
    	dfs(i-b,step+1);
    	sum-=i;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in=new Scanner(System.in);
    n=in.nextInt();
    s=in.nextInt();
    a=in.nextInt();
    b=in.nextInt();
    for(int i=s-n*a;i<s+n*b;i++)
        dfs(i,1);//step从第一步开始到第n布
    System.out.println(cnt);
	}
}
