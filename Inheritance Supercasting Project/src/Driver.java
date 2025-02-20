
public class Driver
	{
	
		public static void main(String[] args)
			{
				CrazyPerson crazy = new TwilightFan();
				crazy.getObsessed();
				crazy.stalk();
				
				
				System.out.println();
				
				TwilightFan fan = new TwilightFan(); // casting
				System.out.println("Subclass twilight: " + fan.twilight);
				fan.jumpAcrossTrees();
				fan.parentStalk();
				
				System.out.println();
				
				System.out.println("Superclass crazy: " + fan.crazy);
				fan.runAway();
				
				
			}

	}
