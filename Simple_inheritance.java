package boi_c1;


	public class Account {
		int mob=7;
		String name="vishal";
		float account_balance=33333;
		public void display()
		{
			System.out.println("\bcustomer name:"+name+"\nMobile no.:"+mob+"\n: avalable_balance:"+account_balance);
		}
		class  fdaaccount extends Account
		{
			int loan_amount=22222;
			public void display()
			{
				
				int available_balance=account_balance-loan_amount;
				System.out.println("My loan amount is"+available_balance);
			}		}
		public class Simple_inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fdaaccount emp1=new fdaaccount();
		emp1.display();
		emp1 displayloan();
		
	}

}
