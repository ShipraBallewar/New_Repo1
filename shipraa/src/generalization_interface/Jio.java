package generalization_interface;

public class Jio implements Gen
{

	@Override
	public void Calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling limit= 2000min");
	}

	@Override
	public void Messaging() {
		// TODO Auto-generated method stub
		System.out.println("500 msg per month");
	}

	@Override
	public void Internet() {
		// TODO Auto-generated method stub
		System.out.println("1.5 GB per day");
	}
 
	public void Jio_Saavan()
	{
		System.out.println("Jio saavan is an extra feature");
	}
}
