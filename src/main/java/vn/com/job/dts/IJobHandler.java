package vn.com.job.dts;

public abstract class IJobHandler {
    public abstract void execute() throws Exception;

    public void init() throws Exception {
        // do something
    }

    public void destroy() throws Exception {
        // do something
    }

}
