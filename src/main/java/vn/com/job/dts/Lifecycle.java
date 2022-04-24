package vn.com.job.dts;


import java.util.concurrent.TimeUnit;

public interface Lifecycle {
    boolean init();

    boolean start();

    boolean stop();

    boolean stop(long timeout, TimeUnit unit);

    boolean isRunning();


}
