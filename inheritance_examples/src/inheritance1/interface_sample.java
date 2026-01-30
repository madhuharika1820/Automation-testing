package inheritance1;

 interface interface1 {

		
		void paint();
		default void painting()
		{
			System.out.println("Iam painting");
		}

}
		class interface_sample implements interface1
		{
			public void paint()
			{
				System.out.println("Iam not painting");
			}
			public static void main(String[] args)
			{
				interface_sample s=new interface_sample ();
				s.paint();
				s.painting();
			}
		}




