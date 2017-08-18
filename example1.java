class example1{
	public static void main(String args[]){
		System.out.println("Start");
		
		String sNum="100a";
		int x=0;
		
		try{
			x=Integer.parseInt(sNum);
			System.out.println("try block...");
		}catch(NumberFormatException e){
			System.out.println("Wrong number");
			x=Integer.MAX_VALUE;
		}		
		System.out.println("End. "+x);
	}
}

