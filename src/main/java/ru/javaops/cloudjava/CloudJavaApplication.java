package ru.javaops.cloudjava;

import com.zaxxer.hikari.HikariPoolMXBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class CloudJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudJavaApplication.class, args);
    }

    private void logPoolStats() {
//            State stateLocal = state;
//            HikariPoolMXBean poolProxy = stateLocal.poolProxy;
//            if (poolProxy != null) {
//                try {
//                    log.warn(
//                            "[{}] HikariCP: "
//                                    + "numBusyConnections = {}, "
//                                    + "numIdleConnections = {}, "
//                                    + "numConnections = {}, "
//                                    + "numThreadsAwaitingCheckout = {}",
//                            "myPullHikary",
////                            connConfig.getConnectionPoolName(),
//                            poolProxy.getActiveConnections(),
//                            poolProxy.getIdleConnections(),
//                            poolProxy.getTotalConnections(),
//                            poolProxy.getThreadsAwaitingConnection());
//                } catch (Exception e) {
//                    System.out.println("Ошибо4ка");
////                    log.error("[{}] Unable to log pool statistics.", connConfig.getConnectionPoolName(), e);
//                }
//            }
        }
}
