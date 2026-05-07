public class DataType{
	public static void main(String[] args){
		byte age = 30;
		System.out.printf("Your age is %d%n",age);
		
		short quantity = 10000; 
		System.out.printf("The quantity of phone ordered is %,d%n", quantity);
		
		int nigeriaPopulation = 27937937; 
		System.out.printf("The population of Nigeria %,d%n",nigeriaPopulation);
		
		long worldPopulation = 234583204232452L; 
		System.out.printf("The world's population is %,d%n", worldPopulation);
		
		float price = 487956855.349823F; 
		System.out.printf("The price of iphone is %c%,.2f%n",'$',price);
		
		double myBalance = 434550340953498509.484059084933489;
		System.out.printf("The account balance is %c%,.2f%n",'$',myBalance);
		
		char symbol = '%';
		System.out.printf("There is an increase in petrol by 15.2%c%n",symbol);
		
		boolean isJavaFun = true; 
		System.out.printf("Do you love Java?, %b",isJavaFun);
	}
}