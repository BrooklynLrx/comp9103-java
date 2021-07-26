public class insterest{
    public double count(double m,int t){
        if(t == 1){
            return m*1.05;
        }
        else{
            return count(m,t-1)*1.05;
        }
    }
    public static void main(String[] args){
        insterest i = new insterest();
        System.out.println(i.count(1,1));
        System.out.println(i.count(1,2));
        System.out.println(i.count(1,3));
    }
}
