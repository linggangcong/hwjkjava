public class Thread1 implements Runnable {
    private MyThread t;
    private String  threadName;
    private int ticketPool ;

    public void setTicketPool(int ticketPool) {
        this.ticketPool = ticketPool;
    }

    public int getTicketPool(){
        return ticketPool;
    }

    Thread1(String name){
        threadName=name;
    }

    @Override
    public void run() {

    }
    public void start(){
        if(t==null){
           // t=new MyThread(this,threadName); //用 Runnable实例 生成线程对象
            //t.start();
        }
    }
}
