package com.dooioo.vip;

import com.dooioo.se.lorik.core.annotation.EnableBuiltinRestSupport;
import com.dooioo.vip.spi.UserSpi;
import com.lianjia.sh.xcount.point.EnableXcount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableXcount
@EnableEurekaClient
@Configuration
@EnableFeignClients(basePackageClasses = {UserSpi.class})
@EnableBuiltinRestSupport
@EnableScheduling
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
public class VipServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(VipServerApplication.class, args);
    }
}
