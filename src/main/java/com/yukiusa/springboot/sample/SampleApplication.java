package com.yukiusa.springboot.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleApplication {

	/**
	 * サンプル・アプリケーションメイン
	 * @param args 引数
	 */
	public static void main(String[] args) {
		System.out.println("Hello Topic C");
		SpringApplication.run(SampleApplication.class, args);
	}
}
