class a extends Thread{
    public void run(){
        for(int i =0;i<100;i++){
            System.out.println(i);
        }
    }
}

class b extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(i);
        }
    }
}
public class multithreading {
    public static void main(String[] args){
        a A = new a();
        b B = new b();
        A.start();
        B.start();
        A.setPriority(10);

    }
}
