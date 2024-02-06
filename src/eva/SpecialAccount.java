package eva;

public class SpecialAccount extends BaseAccount
{
    double increase;
    public SpecialAccount(double sum, int period, double percent, double increase)
    {
        super(sum,period,percent);
        this.increase =increase;
    }
    @Override
    public double income()
    {
        double newSum=sum;
        double newPercent=percent;
        for(int i=0;i<period;i++)
        {
            double addition=newSum*newPercent/100;
            newSum+=addition;
            newPercent+=increase;
        }
        return newSum-sum;
    }

    @Override
    public String toString() {
        return "SpecialAccount{" +
                "sum=" + sum +
                ", period=" + period +
                ", percent=" + percent +
                ", increase=" + increase +
                ", income=" + String.format("%.2f",income())+
                '}';
    }
}
//patronymic