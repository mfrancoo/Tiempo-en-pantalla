import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
public class Procesamiento extends TimerTask {
    private double tDiario;
    private double tSemanal;

    @Override
    public void run() {
        System.out.println("Temporizador inicio el :"+new Date());
        completeTask();
        System.out.println("Temporizador terminó el:"+new Date());
    }

    private void completeTask() { 
        try {
            //dura 30 min
            Thread.sleep(60000*30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public static void correrTimer() {
        TimerTask timerTask = new Procesamiento();
        //running timer task as daemon thread
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 10*1000);
        System.out.println("TimerTask started");
        //cancel after sometime
        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("TimerTask cancelled");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void calcularPromedio(ArrayList<Integer> L){
    
    }
}
