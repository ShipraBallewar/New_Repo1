package generalization_interface;

public class Airtel implements Gen
{

	@Override
	public void Calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling limit= 3000min");
	}

	@Override
	public void Messaging() {
		// TODO Auto-generated method stub
		System.out.println("100 msg per day");
	}

	@Override
	public void Internet() {
		// TODO Auto-generated method stub
		System.out.println("2GB per day");
	}

	public void Hotstar()
	{
		System.out.println("Hotstar is an extra feature");
	}
}
