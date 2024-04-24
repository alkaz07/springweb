package alkaz.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Класс-запускалка

@SpringBootApplication
public class SpringwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebApplication.class, args);
		//запускается встроенный Apache Tomcat и начинает слушать порт, указанный в файле application.properties
	}

}
