public void exception_name() throws Exception{
    throw new Exception("crash");
}
public static void main(String[] args){
    try{
        exception_name();
    } catch (Exception e) {
        e.printStackTrace()
    }
}
