package coderServer;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "coderServer.*.mapper")
@SpringBootApplication
public class EurekaClientApplication {
    /**
     * mybatisPlus分页插件需要这个bean来启动
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);

    }
}
