package eva;

public class BaseAccount extends Account
{
    int period;
    double percent;
    public BaseAccount(double sum, int period, double percent)
    {
        super(sum);
        this.period=period;
        this.percent=percent;
    }

    @Override
    public double income()
    {
        double newSum=sum;
        for(int i=0;i<period;i++)
        {
            double addition=newSum*percent/100;
            newSum+=addition;
        }
        return newSum-sum;

    }

    @Override
    public String toString() {
        return "BaseAccount{" +
                "sum=" + sum +
                ", period=" + period +
                ", percent=" + percent +
                ", income=" + String.format("%.2f",income())+
                '}';
    }
}
