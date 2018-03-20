//import java.util.ArrayList;

public class C {
	 public static int count = 0;
	    
	    public void swap(int[] A, int a, int b) {
	        int temp = A[a];
	        A[a] = A[b];
	        A[b] = temp;
	    }
	    
	    public void dfs(int[] A, int step) {
	        if(step == A.length) {
	            if(check(A)) {
	                count++;
	            }
	            return;
	        } else {
	            for(int i = step;i < A.length;i++) {
	                swap(A, i, step);
	                dfs(A, step + 1);
	                swap(A, i, step);
	            }
	        }
	        return;
	    }
	    
	    public boolean check(int[] A) {
	        if(A[0] < A[1] && A[0] < A[2]) {
	            if(A[1] < A[3] && A[1] < A[4] && A[2] < A[4] && A[2] < A[5]) {
	                if(A[3] < A[6] && A[3] < A[7] && A[4] < A[7] && A[4] < A[8] && A[5] < A[8] && A[5] < A[9])
	                    return true;
	            }
	        }
	        return false;
	    }
	    
	    public static void main(String[] args) {
	       C test = new C();
	        int[] A = {0,1,2,3,4,5,6,7,8,9};
	        test.dfs(A, 0);
	        System.out.println(count);
	    }
}
