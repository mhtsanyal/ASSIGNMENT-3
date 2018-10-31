class Default{
	Default(){
		System.out.println("default is called through parametrized ");
	}
	Default(int x){
		this();
	}
	
	public static void main(String args[]){
		Default obj=new Default(10);
		
	}
}