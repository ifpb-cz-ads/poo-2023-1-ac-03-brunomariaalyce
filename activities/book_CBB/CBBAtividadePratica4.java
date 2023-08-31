public class CBBAtividadePratica4 {

    public static void main(String[] args) {
        double largura = 4;
        double comprimento = 10;
        double profundidade = 2;

        double volume = largura * comprimento * profundidade;
        double valor = volume * 100; //R$ para cada metro cubico

        System.out.println("Largura: " + largura);
        System.out.println("Comprimento: " + comprimento);
        System.out.println("Profundidade: " + profundidade);
        System.out.println("Volume: " + volume);
        System.out.println("Valor: R$" + valor);

    }
    
}
