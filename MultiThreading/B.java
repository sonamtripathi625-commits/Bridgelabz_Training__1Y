package MultiThreading;

public class B extends Thread{
    @Override
    public void run(){
        for(int i =0;i<=10;i++){
            if(i%2==0){
                System.out.println("thread"+i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
