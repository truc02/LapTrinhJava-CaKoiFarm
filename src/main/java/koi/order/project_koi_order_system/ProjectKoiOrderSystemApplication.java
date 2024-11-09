package koi.order.project_koi_order_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class ProjectKoiOrderSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectKoiOrderSystemApplication.class, args);
        System.out.print("successful");
    }
    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello";
    }
}
