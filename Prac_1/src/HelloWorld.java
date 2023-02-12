class HelloWorld
{
	//public : access specifier => accesible from anywhere
	//static : without instance(object)
	public static void main(String[] args)
	{
		//System : name of the class under pkg : java.lang
		//out :data menber of the system class 
		//System.out => std o/p data type : PrintStream class
		//PrintStream : print / println / printf 
		System.out.println("Welcome 2 Java");
		System.out.println("Hi,"+args[0]);

	}
}