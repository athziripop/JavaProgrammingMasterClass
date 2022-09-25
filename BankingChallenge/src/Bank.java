import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        System.out.println("Branch already exists");
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            if(branch.newCustomer(customerName, initialTransaction)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            if(branch.addCustomerTransaction(customerName, transaction)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for(Branch branch : branches){
            if(branch.getName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customer details for branch " + branchName);
            ArrayList<Customer> customers = branch.getCustomers();
            for(int i = 0; i < customers.size(); i++){
                Customer customer = customers.get(i);
                System.out.println("Customer: "+ customer.getName() +"["+ (i+1) +"]");
                ArrayList<Double> transactions = customer.getTransactions();
                if(printTransactions){
                    System.out.println("Transactions");
                    for(int j = 0; j < transactions.size();j++){
                        System.out.println("["+(j + 1)+"]  Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
