package codes;

public class Human {
	
	private String name;
	private int age;
	private boolean female;
	
	//constructor with all parameters
	public Human(String name,int age, boolean female){
		this.name = name;
		this.age = age;
		this.female = female;
	}
	
	//constructor with name parameter
	public Human(String name){
		this.name = name;
		age = 0;
		female = false;
	}
		
	//constructor with age, gender parameters
	public Human(int age, boolean female){
		name = "John";
		this.age = age;
		this.female = female;
	}
	
	//constructor sans parameters
	public Human(){
		name = "John";
		age = 0;
		female = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		if(age>30)
			if((int)(Math.random()*100+1)<=30)
				return age-5;
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isFemale() {
		return female;
	}

	public void setFemale(boolean female) {
		this.female = female;
	}
	
	//adding method1
	public int add(String num1, String num2){
			int numero1=-1;
			int numero2=-1;
			
			switch(num1){
			case "zero":
				numero1=0;
				break;
			case "one":
				numero1=1;
				break;
			case "three":
				numero1=3;
				break;
			case "four":
				numero1=4;
				break;
			case "five":
				numero1=5;
				break;
			case "six":
				numero1=6;
				break;
			case "seven":
				numero1=7;
				break;
			case "eight":
				numero1=8;
				break;
			case "nine":
				numero1=9;
				break;
			}
			
			switch(num2){
			case "zero":
				numero2=0;
				break;
			case "one":
				numero2=1;
				break;
			case "three":
				numero2=3;
				break;
			case "four":
				numero2=4;
				break;
			case "five":
				numero2=5;
				break;
			case "six":
				numero2=6;
				break;
			case "seven":
				numero2=7;
				break;
			case "eight":
				numero2=8;
				break;
			case "nine":
				numero2=9;
				break;
			}
			
			return numero1+numero2;
				
		}
	
	//adding method2
	public int add(int num1, int num2){
		return num1+num2;
	}

}
