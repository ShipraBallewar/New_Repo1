package generalization_interface;

public class Idea implements Gen
{

	@Override
	public void Calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling limit= 1500min");
	}

	@Override
	public void Messaging() {
		// TODO Auto-generated method stub
		System.out.println("50 msg per day");
	}

	@Override
	public void Internet() {
		// TODO Auto-generated method stub
		System.out.println("4 GB per day");
	}

	public void Hungama_music()
	{
		System.out.println("Humgama music is an extra feature");
	}
	
}
