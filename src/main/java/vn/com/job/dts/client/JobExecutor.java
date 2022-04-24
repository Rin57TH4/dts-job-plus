package vn.com.job.dts.client;

import vn.com.job.dts.Lifecyclet;
import vn.com.job.dts.client.embed.EmbedServer;
import vn.com.job.dts.client.embed.NettyEmbedServer;
import vn.com.job.dts.client.thread.JobThread;

import java.util.concurrent.ConcurrentHashMap;


/**
 * Lưu thông tin, quản lý các jobThread
 */
public abstract class JobExecutor extends Lifecyclet {
    // tất cả các job của client
    private static ConcurrentHashMap<Integer, JobThread> jobThreadRepo = new ConcurrentHashMap<>();

    private EmbedServer embedServer;

    @Override
    public boolean init() {
        embedServer = new NettyEmbedServer();
        return false;
    }

    @Override
    public boolean stop() {
        embedServer.stop();
        return false;
    }

    public void addJob(int jobId, JobThread jobThread) {
        jobThreadRepo.put(jobId, jobThread);
    }

    public static JobThread loadJobThread(int jobId) {
        return jobThreadRepo.get(jobId);
    }

}
