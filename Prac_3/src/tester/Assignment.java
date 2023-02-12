public class Assignment
{
	public static void main(String[] args)
	{
		Tank t1 = new Tank(10);
		Tank t2 = new Tank(20);
		System.out.println("1: t1.level1: "+t1.getLevel()+" t2.level2: "+t2.getLevel());
		t1 = t2;//t1 now points to whatever object t2 is pointing at
		// object that t2 previously pointed at is now dereferenced(marked for GC)
		System.out.println("2: t1.level1: "+t1.getLevel()+" t2.level2: "+t2.getLevel());
		t1.setLevel(27);
		System.out.println("3: t1.level1: "+t1.getLevel()+" t2.level2: "+t2.getLevel());
		t2.setLevel(t1.getLevel()+10);
		System.out.println("4: t1.level1: "+t1.getLevel()+" t2.level2: "+t2.getLevel());
	}
}