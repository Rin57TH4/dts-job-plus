package vn.com.job.dts;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class Lifecyclet implements Lifecycle {

    private final AtomicReference<Status> status;

    protected Lifecyclet() {
        this.status = new AtomicReference<>(Status.STOPPED);
    }

    private enum Status {STARTING, STARTED, STOPPING, STOPPED;}

    @Override
    public boolean init() {
        return false;
    }

    @Override
    public boolean start() {
        return false;
    }

    @Override
    public boolean stop() {
        return false;
    }

    @Override
    public boolean stop(long timeout, TimeUnit unit) {
        return false;
    }

    @Override
    public boolean isRunning() {
        return this.status.get() == Status.STARTED;
    }
}
