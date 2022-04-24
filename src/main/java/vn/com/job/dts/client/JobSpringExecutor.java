package vn.com.job.dts.client;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class JobSpringExecutor extends JobExecutor implements ApplicationContextAware, SmartInitializingSingleton, DisposableBean {
    @Override
    public void destroy() throws Exception {

        stop();
        // destroy
    }

    @Override
    public void afterSingletonsInstantiated() {
        //init
        init();
        //khởi tạo các cấu kiện phục vụ cho client
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

}
