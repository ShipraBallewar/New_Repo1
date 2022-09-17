package interface_;

public interface Demo3 extends Demo1
{
    // variables are by default static and final
	//methods re by default abstract and public
	
	int a=1110;
	
    void xyz(); 
	void abc();

	
	public static void main(String[] args)
	{
		System.out.println(a);
	}
	 
}
