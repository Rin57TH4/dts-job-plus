package vn.com.job.dts.client.embed;

import vn.com.job.dts.client.JobSpringExecutor;
import vn.com.job.dts.client.thread.JobThread;
import vn.com.job.dts.client.thread.RegistryThread;

public class NettyEmbedServer extends EmbedServer {
    private RegistryThread registryThread;

    @Override
    public boolean init() {
        registryThread = new RegistryThread();
        return false;
    }

    @Override
    public boolean start() {
        //khởi tạo Netty server

        registryThread.start();
        return false;
    }

    @Override
    public void process() {
        // Tiếp nhận Http request và xử lý
        JobThread jobThread = JobSpringExecutor.loadJobThread(1);

        // nếu kill job
        jobThread.interrupt();
        // xử lý tiếp kích hoạt job trả kq về
    }

    @Override
    public boolean stop() {
        registryThread.stop();
        return false;
    }
}
