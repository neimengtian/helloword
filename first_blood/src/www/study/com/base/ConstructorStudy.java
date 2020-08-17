package www.study.com.base;

public class ConstructorStudy {
    public static void main(String[] args) {
        new Lock();
    }
}
class Lock{
    Lock(){
        System.out.println("First default initialize()");
    }
}
