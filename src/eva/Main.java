package eva;

public class Main {

    public static void main(String[] args) {
	BaseAccount account01 = new BaseAccount(1000,10 , 2);
    System.out.println(account01.toString());
    LongAccount account02 = new LongAccount(1000,10,5, 5);
    System.out.println(account02.toString());
    SpecialAccount account03 = new SpecialAccount(1000, 10,0.5, 0.2);
    System.out.println(account03.toString());
        System.out.println();
    
    BaseAccount accounts[]=new BaseAccount[3];
       accounts[0] = new BaseAccount(1000,10 , 2);
        accounts[1]  = new LongAccount(1000,10,5, 5);
        accounts[2]  = new SpecialAccount(1000, 10,0.5, 0.2);
        for (BaseAccount account : accounts)
        {
            System.out.println(account.toString());
        }
    }
}
