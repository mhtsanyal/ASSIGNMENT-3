class example{
static int i;
static {
	i=10;
	System.out.println("static block");
}
}
class s_block{
	public static void main(String args[]){
		System.out.println(example.i);
	}
}