
public class TwilightFan extends CrazyPerson
	{
		public String twilight = "twilight"; // specific to subclass
		
		public TwilightFan()
		{
			super();
			System.out.println("TwilightFan constructor called");
		}
		
		public void jumpAcrossTrees()
			{
			System.out.println("Hold on tight spider monkey");
			}
			
		public void stalk() //overrides super class
			{
			System.out.println("Did you know Robert Pattinson is getting married to Suki Waterhouse instead of me????"); 
			}
		
		public void runAway() //abstract method from super being implemented
			{
			System.out.println("I'm going to get on a plane to Italy without telling anyone");
			}
		
		public void parentStalk()
		{
			super.stalk();
		}
	}
