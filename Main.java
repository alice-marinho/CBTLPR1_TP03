public class Main {
    public static void main(String[] args) {
        // Testando o construtor padrão
        Hora hora1 = new Hora();
        System.out.println("Hora 1 (formato 1): " + hora1.getHora1());
        System.out.println("Hora 1 (formato 2): " + hora1.getHora2());
        System.out.println("Total de segundos: " + hora1.getSegundos());

        // Testando o construtor parametrizado
        Hora hora2 = new Hora(13, 45, 30);
        System.out.println("Hora 2 (formato 1): " + hora2.getHora1());
        System.out.println("Hora 2 (formato 2): " + hora2.getHora2());
        System.out.println("Total de segundos: " + hora2.getSegundos());
    }
}
