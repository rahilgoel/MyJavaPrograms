
class PassByReference {

	public static void main(String[] args){
		int a[]=new int[]{
				4,3,2
		};
		PassByReference ref=new PassByReference();
		ref.change(a);
		//System.out.println(a);
		//while(a<10)
		ref.print(a[0]);
	}
	 
	void change(int[] a){
		a[0]=1;
	}
	void print(int a){
	System.out.println(a);
	}
	
}
