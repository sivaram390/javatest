package polymorphism_Section9;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Polymorphism is close to inheritance

		/*
		 * Phone phone = new Phone("Nokia 3310"); System.out.println(phone.getModel());
		 * phone.features();
		 * 
		 * SamsumgNote samsung = new SamsumgNote("Note 8");
		 * System.out.println(samsung.getModel()); samsung.features();
		 */
		
		Phone note8 = new SamsumgNote("Note8");
		System.out.println(note8.getModel());
		note8.features();

	}

}
