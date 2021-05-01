package inheritance3;

public class Main {

	public static void main(String[] args) {
	Instructer engin = new Instructer();
	engin.firstname ="Engin";
	
	
	
	
	StudentUser talha = new StudentUser();
	talha.firstname ="Talha";
	
	UserManager userManager = new UserManager();
	userManager.add(talha);
	userManager.add(engin);
	
	
	
	}

}
 