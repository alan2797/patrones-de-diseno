package PatronTemplate;

public class Demo 
{
	public static void main(String[] args) 
	{
		System.out.println("empesar  a construir la casa de muro de hormig�n");
		
		Casa house = new CasaParedOrmigon();
		house.contruirCasa();
		          System.out.println(house.contruirCasa());
		System.out.println("Casa de muro de hormig�n construida con �xito");
		
		System.out.println("********************");
		
		System.out.println("empesar  a construir la casa de muro de vidrio");
		
		house = new CasaParedVidrio();
		//house.buildhouse();
		
		System.out.println("Casa de muro de vidrio construida con �xito");
	}
}
