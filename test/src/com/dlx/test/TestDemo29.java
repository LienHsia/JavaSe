public class TestDemo29 {
    public static void main(String[] args) {
        for(int i=6;i<1000;i+=2){
            for(int j=1;j<=i;j++){
                if(isJudge(j)&&isJudge(i-j)){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    public static boolean isJudge(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
