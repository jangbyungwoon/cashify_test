package kr.bts.cashify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CashifyTestApplication {

	public static void main(String[] args) {
		System.out.println("헬로 월드!");
		SpringApplication.run(CashifyTestApplication.class, args);
	}

}
