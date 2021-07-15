import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CassandraInsertion {

    public static void main(String[] args)
    {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new CassandraRunnable());


    }

}
