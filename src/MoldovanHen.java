public class MoldovanHen extends Hen {
    static int countMold = 0;
    int sumMold = 0;

    public MoldovanHen() {
        countMold++;
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 21;
    }

    public String getNameCountry() {
        return "Молдова";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Моя страна " + getNameCountry() + ".Я несу " + getCountOfEggsPerMonth() + " яиц в месяц";
    }

    public int sumMold() {

        sumMold = countMold * 12 * getCountOfEggsPerMonth();
        return sumMold;
    }

}
