package homework2;

public class City {

    char code;
    int population;

    public City(char code, int population) {
        this.code = code;
        this.population = population;
    }

    void printInfo() {
        System.out.println("City code: " + code + ", " + "Population: " + population);
    }

    public static void main(String[] args) {

        City yerevan = new City('Y', 1075800);
        City moscow = new City('M', 13000000);
        City newYork = new City('N', 8500000);
        City paris = new City('P', 2148000);

        yerevan.printInfo();
        moscow.printInfo();
        newYork.printInfo();
        paris.printInfo();

    }
}
