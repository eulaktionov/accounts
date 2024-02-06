package eva;

public abstract class Account implements IAccount {
    double sum;

    public Account(double sum) {
        this.sum = sum;
    }

    @Override
    public void put(double sum) {
        this.sum += sum;
    }

    @Override
    public double withdraw(double sum) {
        if (sum <= this.sum)
        {
            this.sum -= sum;
            return sum;
        }
        else
        {
            return 0;
        }
    }
    public abstract double income();

}
