
public class Main {
    public static void main(String[] args) {

    }
}

import java.util.Scanner;

public class Hora {
    private int hora;
    private int min;
    private int seg;
    private Scanner scanner;

    public Hora() {
        scanner = new Scanner(System.in);

        setHor();
        setMin();
        setSeg();

        scanner.close();
    }

    public Hora(int h, int m, int s){
        if (isValidTime(h, m, s)) {
            this.hora = h;
            this.min = m;
            this.seg = s;
        } else {
            System.out.println("Hora inválida.");
        }
    }

    public void setHor(int h){
        this.hora = h;
    }

    public void setMin(int m){
        this.min = m;
    }

    public void setSeg(int s){
        this.seg = s;
    }

    public void setHor(){
        do {
            System.out.print("Digite a hora: ");
            this.hora = scanner.nextInt();
            if (this.hora < 0 || this.hora >= 24)
                System.out.println("Hora inválida! Digite novamente.");
        } while (this.hora < 0 || this.hora >= 24);
    }

    public void setMin()
    {
        do {
            System.out.print("Digite os minutos: ");
            this.min = scanner.nextInt();
            if (this.min < 0 || this.min >= 60)
                System.out.println("Minutos inválidos! Digite novamente.");
        } while (this.min < 0 || this.min >= 60);
    }

    public void setSeg(){
        do {
            System.out.print("Digite os segundos: ");
            this.seg = scanner.nextInt();
            if (this.seg < 0 || this.seg >= 60)
                System.out.println("Segundos inválidos! Digite novamente.");
        } while (this.seg < 0 || this.seg >= 60);
    }

    public int getHor(){
        return hora;
    }

    public int getMin()
    {
        return min;
    }

    public int getSeg(){
        return seg;
    }

    // Métodos incompletos
    public String getHora1(){
        return ""; // implemente sua lógica aqui
    }

    public String getHora2(){
        return ""; // implemente sua lógica aqui
    }

    public int getSegundas(){
        return 0; // implemente sua lógica aqui
    }

    private boolean isValidTime(int h, int m, int s) {
        return (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60);
    }
}
