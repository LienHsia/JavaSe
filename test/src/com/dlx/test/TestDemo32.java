public class TestDemo32 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int m=sc.nextInt();
    	int t=sc.nextInt();
    	int[] score=new int[n];
    	boolean[] flag=new boolean[n];
    	int[][] ans=new int[t][n];
    	for(int i=0;i<m;i++) {
    		int ts=sc.nextInt();
    		int id=sc.nextInt();
    		ans[ts-1][id-1]++;
    	}
    	for(int i=0;i<t;i++) {
    		for(int j=0;j<n;j++) {
    			if(ans[i][j]==0) {
    				if(score[j]!=0) {
    					score[j]-=1;
    				}
    			}
    			else {
    				for(int k=0;k<ans[i][j];k++) {
    					score[j]+=2;
    				}
    			}
    			if(score[j]>5) {
    				flag[j]=true;
    			}
    			else if(score[j]<=3) {
    				flag[j]=false;
    			}
    		}
    	}
    	int res=0;
    	for(boolean i:flag) {
    		if(i) {
    			res++;
    		}
    	}
    	System.out.println(res);
    }	
}
