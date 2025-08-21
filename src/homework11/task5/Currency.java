package homework11.task5;

public enum Currency {
    USD("$", "United States Dollar"),
    EUR("€", "Euro"),
    JPY("¥", "Japanese Yen");

    private final String symbol;
    private final String country;

    Currency(String symbol, String country) {
        this.symbol = symbol;
        this.country = country;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString () {
        return this.name() + " - " + country;
    }
}
