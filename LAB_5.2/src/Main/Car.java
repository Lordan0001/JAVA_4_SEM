package Main;
import java.util.concurrent.Exchanger;
import java.util.concurrent.Semaphore;

public class Car extends Thread {
    Semaphore sem;
    Exchanger<Boolean> exDir;
    Exchanger<Integer> exCtr;
    boolean direction;
    boolean currentDir = true;
    int id;
    int ctr;


    public Car(Semaphore sem, boolean dir, int id, Exchanger<Boolean> exDir, Exchanger<Integer> exCtr)
    {
        this.sem = sem;
        this.id = id;
        this.direction = dir;
        this.exDir = exDir;
        this.exCtr = exCtr;
    }


    public void run()
    {
        try {
            // получаем в переменную currentDir текущее направление потока
            currentDir = exDir.exchange(currentDir);
            // получаем в ctr количество проехавших в одном нправлении авто
            ctr = exCtr.exchange(ctr);

            // если авто собирается ехать в другом направлении то оно ждет а потом направление меняется
            if (direction != currentDir)
            {
                sleep(700);
                currentDir = !currentDir;
            }

            System.out.println("Автомобиль " + id + " собирается ехать " + ((direction) ? "влево" : "вправо"));

            // едем в допустимом направлении
            if (direction == currentDir)
            {
                sem.acquire();
                System.out.println("Автомобиль " + id + " едет " + ((direction) ? "влево" : "вправо"));
                sleep(400);
                System.out.println("Автомобиль " + id + " проехал");
                ctr++;
                exCtr.exchange(ctr);
            }
            sleep(1000);
            exDir.exchange(direction);
            sem.release();
            if (ctr == 3)
                interrupt();
        }
        catch (InterruptedException e) {
            System.out.println("Ошибочка вышла");
        }
    }
}
