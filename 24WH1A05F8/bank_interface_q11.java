package src;

public class bank_interface_q11 {
    interface Bank {
        double RATE_OF_INTEREST = 6.5;

        void createAccount(String accNo, String name, double initialBalance);
        void creditAmount(String accNo, double amount);
        void debitAmount(String accNo, double amount);
        void transferAmount(String fromAccNo, String toAccNo, double amount);
        String miniStatement(String accNo);
    }

    class Axis_Bank implements Bank {
        String accNo;
        String name;
        double balance;

        public void createAccount(String accNo, String name, double initialBalance) {
            this.accNo = accNo;
            this.name = name;
            this.balance = initialBalance;
        }

        public void creditAmount(String accNo, double amount) {
            if (this.accNo.equals(accNo)) {
                balance = balance + amount;
                System.out.println("Balance after credit: " + balance);
            }
        }

        public void debitAmount(String accNo, double amount) {
            if (this.accNo.equals(accNo)) {
                if (balance >= amount) {
                    balance = balance - amount;
                    System.out.println("Balance after debit: " + balance);
                } else {
                    System.out.println("Insufficient balance");
                }
            }
        }

        public void transferAmount(String fromAccNo, String toAccNo, double amount) {
            if (this.accNo.equals(fromAccNo)) {
                if (balance >= amount) {
                    balance = balance - amount;
                    
                    System.out.println("Transferred " + amount + " from " + fromAccNo + " to " + toAccNo);
                } else {
                    System.out.println("Insufficient balance");
                }
            }
        }

        public String miniStatement(String accNo) {
            if (this.accNo.equals(accNo)) {
                return "Mini Statement\nName: " + name + "\nAccount No: " + accNo + "\nBalance: " + balance + "\nInterest Rate: " + RATE_OF_INTEREST;
            }
            return "Account not found";
        }
    }

    class Sbi_Bank implements Bank {
        String accNo;
        String name;
        double balance;

        public void createAccount(String accNo, String name, double initialBalance) {
            this.accNo = accNo;
            this.name = name;
            this.balance = initialBalance;
        }

        public void creditAmount(String accNo, double amount) {
            if (this.accNo.equals(accNo)) {
                balance = balance + amount;
                System.out.println("Balance after credit: " + balance);
            }
        }

        public void debitAmount(String accNo, double amount) {
            if (this.accNo.equals(accNo)) {
                if (balance >= amount) {
                    balance = balance - amount;
                    System.out.println("Balance after debit: " + balance);
                } else {
                    System.out.println("Insufficient balance");
                }
            }
        }

        public void transferAmount(String fromAccNo, String toAccNo, double amount) {
            if (this.accNo.equals(fromAccNo)) {
                if (balance >= amount) {
                    balance = balance - amount;

                    System.out.println("Transferred " + amount + " from " + fromAccNo + " to " + toAccNo);
                } else {
                    System.out.println("Insufficient balance");
                }
            }
        }

        public String miniStatement(String accNo) {
            if (this.accNo.equals(accNo)) {
                return "Mini Statement\nName: " + name + "\nAccount No: " + accNo + "\nBalance: " + balance + "\nInterest Rate: " + RATE_OF_INTEREST;
            }
            return "Account not found";
        }
    }

    public static void main(String[] args) {
        bank_interface_q11 obj = new bank_interface_q11();
        Axis_Bank axis = obj.new Axis_Bank();
        Sbi_Bank sbi = obj.new Sbi_Bank();

        axis.createAccount("A123", "shrena", 1000);
        sbi.createAccount("S123", "shriya", 2000);

        axis.creditAmount("A123", 500);
        axis.debitAmount("A123", 300);


        axis.transferAmount("A123", "S123", 200);

        System.out.println(axis.miniStatement("A123"));
        System.out.println(sbi.miniStatement("S123"));
    }
}
