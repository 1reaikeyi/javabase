package 异常;

public class Exceptiontest {
    public static void main(String[] args) {

        try {saveid(12);
            saveid(1);
        } catch (exception2 e) {
            throw new RuntimeException(e);
        }
    }
//    public static void saveid(int a){
//        if(a <= 10 && a > 0){
//            System.out.println("id:"+a);
//
//        }else{
//            throw new exception1("错误");
//        }
//    }
    public static void saveid(int a) throws exception2 {
        if(a <= 10 && a > 0){
            System.out.println("id:"+a);

        }else{
            throw new exception2("错误");
        }
    }
}
