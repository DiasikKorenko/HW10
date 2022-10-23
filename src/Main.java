
public class Main {
    public static void main(String[] args) {
        RussianHen russianHen = null;
        UkrainianHen ukrainianHen = null;
        BelarusianHen belarusianHen = null;
        MoldovanHen moldovanHen = null;

        for (int i = 0; i < 107; i++) {
            if ((i + 1) % 3 == 0) {
                russianHen = new RussianHen();
                System.out.println(russianHen.getDescription());
            }
            if ((i + 2) % 4 == 0) {
                belarusianHen = new BelarusianHen();
                System.out.println(belarusianHen.getDescription());
            }
            if ((i + 3) % 5 == 0) {
                ukrainianHen = new UkrainianHen();
                System.out.println(ukrainianHen.getDescription());
            }
            if ((i + 4) % 6 == 0) {
                moldovanHen = new MoldovanHen();
                System.out.println(moldovanHen.getDescription());
            }
        }
        System.out.println("Количество российских куриц = " + russianHen.countRus);
        System.out.println("Общее количество яиц за год, российских куриц = " + russianHen.sumRus());
        System.out.println("Количество Украинских куриц = " + UkrainianHen.countUk);
        System.out.println("Общее количество яиц за год, украинских куриц = " + ukrainianHen.sumUk());
        System.out.println("Количество беларусских куриц = " + BelarusianHen.countBel);
        System.out.println("Общее количество яиц за год, беларусских куриц = " + belarusianHen.sumBel());
        System.out.println("Количество молдовских куриц = " + MoldovanHen.countMold);
        System.out.println("Общее количество яиц за год, молдовских куриц = " + moldovanHen.sumMold());

        int sumOfYear = russianHen.sumRus() + ukrainianHen.sumUk() + belarusianHen.sumBel() + moldovanHen.sumMold();
        System.out.println("Сумма всех яиц всех данных куриц, за год = " + sumOfYear);
    }
}