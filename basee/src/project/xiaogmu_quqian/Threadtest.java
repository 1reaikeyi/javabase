package xiaogmu_quqian;

public class Threadtest extends Thread{
    private String personName;
    private Account account;
    private int amount;

    public Threadtest(String personName, Account account, int amount) {
        this.personName = personName;
        this.account = account;
        this.amount = amount;
        this.setName(personName);
    }

    @Override
    public void run() {
        account.drawmoney(amount);
    }
}
