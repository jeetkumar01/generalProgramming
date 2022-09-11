public class Threadtest {
    public static void main(String[] args) {
        ThreadImpl th= new ThreadImpl();
        Thread thr= new Thread(th);

        Threadimp thre1 = new Threadimp();
        Threadimp thre2 = new Threadimp();
        thre1.start();
//        try{
//            thre1.join();
//        }catch(InterruptedException e){}
        if(!thre1.isAlive()){
            thre2.start();
        }

//        System.out.println(thre.getName());
//        System.out.println(thr.getName());
//        thr.start();
    }

}

class Threadimp extends Thread{
    public void run(){
        System.out.println("t1");
        try{
            Thread.sleep(500);
        }catch (InterruptedException e){

        }
        System.out.println("t2");
    }
}

 class ThreadImpl implements Runnable{
    public void run(){
        System.out.println("Hello there");
    }

}
