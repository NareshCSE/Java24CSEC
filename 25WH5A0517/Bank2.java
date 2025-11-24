package navya_25wh5a0517;


class Bank {
int getBalance() {
return 0; // Default balance
}}
class BankA extends Bank {
@Override
int getBalance() {
return 2070; }}
class BankB extends Bank {
@Override
int getBalance() {
return 30;}}
class BankC extends Bank {
@Override
int getBalance() {
return 2599; // Balance in Bank C
}}
//Main class (must match file name)
public class Bank2 {
public static void main(String[] args) {
BankA a = new BankA();
BankB b = new BankB();
BankC c = new BankC();
System.out.println("Money deposited in Bank A: $" + a.getBalance());
System.out.println("Money deposited in Bank B: $" + b.getBalance());
System.out.println("Money deposited in Bank C: $" + c.getBalance());
}}


