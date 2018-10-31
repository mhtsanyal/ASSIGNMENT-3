class parent{
	int x;
	parent(int x){
		this.x=x;
	}
	public void display(){
	System.out.println("x is "+x);
	}
}
 class child extends parent{
	int x;
	child(int x){
		super(x);
	}
	public void display(){
		System.out.println("output is available printing of parent class value of x:"+super.x);
	}
}
class invoke{
	public static void main(String args[]){
		child obj = new child(10);
		obj.display();
	}
}