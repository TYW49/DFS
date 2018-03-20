
public class D {
    public static int cnt=0;
    public static int A[]=new int[14];
    public static int visit[]=new int[14];
    public static void dfs(int step)
    {
    	if(step>2 && (A[0]+A[1]!=A[2]))
    	    return;
    	if(step>5&&(A[3]-A[4]!=A[5]))
    		return;
    	if(step>8&&(A[6]*A[7]!=A[8]))
    		return;
    	if(step>11&&(A[11]*A[10]==A[9]))//不能直接用除法因为可能除不尽取了整数
    	{
    		cnt++;
    		return;
    	}
    			
    	for(int i=1;i<14;i++)
    	{
    		if(visit[i]==0)
    		{
    			visit[i]=1;
    			A[step]=i;
    			dfs(step+1);
    			visit[i]=0;
    		}
    	}
    	return;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub     
    dfs(0);
    System.out.print(cnt);
	}

}
