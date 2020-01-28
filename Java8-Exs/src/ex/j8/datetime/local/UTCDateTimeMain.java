package ex.j8.datetime.local;

import java.time.Instant;

public class UTCDateTimeMain {

	public static void main(String[] args) {

		Instant dateTime = Instant.now();
		System.out.println("UTC DateTime: " + dateTime);
	}

}
