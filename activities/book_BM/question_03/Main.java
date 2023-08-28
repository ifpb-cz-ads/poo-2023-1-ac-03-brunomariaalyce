package activities.book_BM.question_03;

public class Main {
    public static void main(String[] args) {
        float item1 = 2.95f;
        float item2 = 3.50f;

        System.out.println("O item 1 custa " + item1 + " e o item 2 custa " + item2);

        float total = item1 + item2;
        System.out.println("TOTAL = " + total);

        final float TAXA = 0.0825f;
        float taxaCalculada = (total * TAXA);
        System.out.println("Taxa a ser cobrada = " + taxaCalculada);

        float novoCusto = (total + taxaCalculada);
        boolean muitoCaro = novoCusto > 10;
        System.out.println("Valor total da compra = " + novoCusto);
        System.out.println("Foi caro? " + (muitoCaro ? "SIM" : "NÃO"));

    }
}
