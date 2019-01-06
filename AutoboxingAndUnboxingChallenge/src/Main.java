
public class Main {

	public static void main(String[] args) {
		Bank absaBank = new Bank("absa");
		
		String fourwaysBranchName = "Fourways";
		absaBank.addBranch(fourwaysBranchName);
		absaBank.addCustomer(fourwaysBranchName, "Lloyd", 10000);
		absaBank.addCustomer(fourwaysBranchName, "Adam", 2122);
		absaBank.addCustomerTransaction(fourwaysBranchName, "Lloyd", 500.43);
		absaBank.addCustomerTransaction(fourwaysBranchName, "Adam", 53.33);
		
		String capeBranchName = "Cape Town";
		absaBank.addBranch(capeBranchName);
		absaBank.addCustomer(capeBranchName, "Gerald", 32);
		absaBank.addCustomerTransaction(capeBranchName, "Gerald", 45);
		absaBank.addCustomer(capeBranchName, "Skoobs", 400);
		absaBank.addCustomer(capeBranchName, "Gerald", 900);
		
		absaBank.addBranch(capeBranchName); // error to test if branch checking works
		
		absaBank.listCustomers(fourwaysBranchName, false);
		absaBank.listCustomers(capeBranchName, false);
	}

}
