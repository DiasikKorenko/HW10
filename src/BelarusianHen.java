public class BelarusianHen extends Hen {
    static int countBel = 0;
    int sumBel = 0;

    public BelarusianHen() {
        countBel++;
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 20;
    }

    public String getNameCountry() {
        return "Беларусь";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Моя страна " + getNameCountry() + ".Я несу " + getCountOfEggsPerMonth() + " яиц в месяц";
    }

    public int sumBel() {

        sumBel = countBel * 12 * getCountOfEggsPerMonth();
        return sumBel;
    }

}
