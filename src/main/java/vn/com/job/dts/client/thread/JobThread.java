package vn.com.job.dts.client.thread;

import vn.com.job.dts.IJobHandler;

import java.util.concurrent.LinkedBlockingDeque;

/**
 * Mỗi Object sẽ được ánh xạ tới 1 Job
 */
public class JobThread extends Thread {

    /**
     * Chứa thông tin về job method xử lý, input class ....
     */
    private IJobHandler jobHandler;

    private LinkedBlockingDeque<String> jobParams = new LinkedBlockingDeque<>();

    @Override
    public void run() {
        //liên tục quét trong jobParams thực thi ...

        try {
            jobHandler.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Sau khi thực thi job xong callback tới Admin Server để trả kết quả Job
    }

}
