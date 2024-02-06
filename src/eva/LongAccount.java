package eva;

public class LongAccount extends BaseAccount
{
    int startPeriod;
    public LongAccount(double sum, int period, double percent, int startPeriod)
    {
        super(sum,period,percent);
        this.startPeriod=startPeriod;
    }

    @Override
    public double income()
    {
        double newSum=sum;
        for(int i=startPeriod;i<period;i++)
        {
            double addition=newSum*percent/100;
            newSum+=addition;
        }
        return newSum-sum;
    }

    @Override
    public String toString() {
        return "LongAccount{" +
                "sum=" + sum +
                ", period=" + period +
                ", percent=" + percent +
                ", startPeriod=" + startPeriod +
                ", income=" + String.format("%.2f",income())+
                '}';
    }
}
