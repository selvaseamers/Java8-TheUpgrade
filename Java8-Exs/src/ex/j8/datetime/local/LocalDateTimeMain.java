package ex.j8.datetime.local;

import java.time.LocalDateTime;

public class LocalDateTimeMain {

	public static void main(String[] args) {

		LocalDateTime currentTime = LocalDateTime.now();	
		System.out.println("Current DateTime: " + currentTime);
		System.out.println("Current Date: " + currentTime.toLocalDate());
		System.out.println("Current Date: " + currentTime.toLocalTime());

	}

}
