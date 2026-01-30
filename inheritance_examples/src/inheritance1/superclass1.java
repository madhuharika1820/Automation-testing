package inheritance1;

class sample1 {
	void parent() {
		System.out.println("Iam in super class");
	}
}


class superclass1 extends sample1 {
	void parent()

	{
		super.parent();
		System.out.println("Iam in sub class");
	}

	public static void main(String[] args) {
		superclass1 s = new superclass1();
		s.parent();
		
		
	}
}
