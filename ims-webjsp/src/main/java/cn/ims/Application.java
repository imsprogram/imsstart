package cn.ims;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
@MapperScan(basePackages = {"cn.ims.**.dao"})
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new SpringApplicationBuilder().sources(Application.class).run(args);
        DispatcherServlet servlet = (DispatcherServlet) ctx.getBean("dispatcherServlet");
        servlet.setThrowExceptionIfNoHandlerFound(true);
        ctx.registerShutdownHook();
    }
}
