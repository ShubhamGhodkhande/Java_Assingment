package Validation_Rules;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Exceptions.LicenceExpiredException;
import Exceptions.SpeedException;

public class ValidatingRules {
		public static final int MIN_SPEED;
		public static final int MAX_SPEED;
		private static SimpleDateFormat sdf;
		static {
			MIN_SPEED=40;
			MAX_SPEED=80;
			sdf=new SimpleDateFormat("dd-MM-yyy");
			
		}
		public static void ValidateSpeed(int speed) //throws SpeedException
		{
			try {
				if(speed<MIN_SPEED)
					throw new SpeedException("Too Slow, Speed UP!");
				if(speed>MAX_SPEED)
					throw new SpeedException("Too Fast, Slow Down");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		public static Date ValidateLicense(String date) throws ParseException, LicenceExpiredException 
		{
			Date licenseExpDate=sdf.parse(date);
			Date today=new Date();
			if(licenseExpDate.after(today))
				return licenseExpDate;
			throw new LicenceExpiredException ("License Expired");
		}
		
}