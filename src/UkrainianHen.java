public class UkrainianHen extends Hen {
    static int countUk = 0;
    int sumUk = 0;

    public UkrainianHen() {
        countUk++;
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 18;
    }

    public String getNameCountry() {
        return "Украина";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Моя страна " + getNameCountry() + ".Я несу " + getCountOfEggsPerMonth() + " яиц в месяц";
    }

    public int sumUk() {

        sumUk = countUk * 12 * getCountOfEggsPerMonth();
        return sumUk;
    }


}
