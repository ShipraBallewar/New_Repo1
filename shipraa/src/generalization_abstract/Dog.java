package generalization_abstract;

abstract public class Dog
{
       void behaviour()
       {
    	   System.out.println("Barking, Running");
       }
       
     abstract  void Height();
       
     abstract  void Size();
       
       void Energy()
       {
    	   System.out.println("Energy = High");
       }
}
