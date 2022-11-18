package Week6Lab;

public class Place {
    private String cityName;
    private String country;
    private Currency currency;
    private String cityHallTel;

    public Place(String cityName, String country, Currency currency, String cityHallTel) {
        this.cityName = cityName;
        this.country = country;
        this.currency = currency;
        this.cityHallTel = cityHallTel;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getCityHallTel() {
        return cityHallTel;
    }

    public void setCityHallTel(String cityHallTel) {
        this.cityHallTel = cityHallTel;
    }

}
