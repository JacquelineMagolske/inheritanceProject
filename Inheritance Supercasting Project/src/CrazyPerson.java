
public abstract class CrazyPerson
	{
		protected String crazy = "crazy person"; //superclass variable
		
		public CrazyPerson()
		{
			System.out.println("Crazy person constructor called");
			
		}
				
		public void getObsessed()
			{
			System.out.println("I LOVE LOVE LOVE LOVE LOVE AHHH");
			}
			
		public void stalk()
			{
			System.out.println("I know everything about them");
			}

		public abstract void runAway(); // implemented by the subclass

		
	}
