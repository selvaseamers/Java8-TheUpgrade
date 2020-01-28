package ex.j8.datetime.zoned;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimemain {

	public static void main(String[] args) {

		Instant dateTime = Instant.now();
		
		System.out.println("Current Europe/London time : "+dateTime.atZone(ZoneId.of("Europe/London")));
		
		System.out.println("Current Atlantic/Azores time : "+dateTime.atZone(ZoneId.of("Atlantic/Azores")));
		
		System.out.println("Current Africa/Lagos time : "+dateTime.atZone(ZoneId.of("Africa/Lagos")));
		
		ZonedDateTime zonedDate = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
	    
		System.out.println("Zoned Date : " + zonedDate);
	}

}
