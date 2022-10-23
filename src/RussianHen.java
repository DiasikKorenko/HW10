public class RussianHen extends Hen {
    static int countRus = 0;

    int sumRus = 0;

    public RussianHen() {
        countRus++;
    }

    public String getNameCountry() {
        return "Россия";
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 24;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Моя страна " + getNameCountry() + ".Я несу " + getCountOfEggsPerMonth() + " яиц в месяц";
    }

    public int sumRus() {

        sumRus = countRus * 12 * getCountOfEggsPerMonth();
        return sumRus;
    }
}
