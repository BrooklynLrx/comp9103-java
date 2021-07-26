public class FibonacciCache{
    private Map<Integer,int[]> cache;
    public FibonacciCache(){
        cache = new HashMap<Integer,int[]>();
    }
    public int[] generateSequnce(int n) {
        if(cache.containsKey(n)) {
            return cache.get(n);
        }
        else{
            if(n == 0){
                return new int[] {0};
            }
            else if(n == 1){
                return new int[] {0,1};
            }
            else{
                int [] f1 = generateSequnce(n-1);
                int [] f2 = generateSequnce(n-2);
                int [] newF = new int[f1.length+1];
                newF[newF.length-1] = f1[f1.length-1]+f2[f2.length-1];
                for(int i = 0;i<f1.length;i++){
                    newF[i] = f1[i];
                    cache.put(n,newF);
                }
                return newF;
            }
        }
    }
}
