public class Сookies extends Sweets {


    String name;
    double weight;
    double price;
    String uniqueParameter;

    public Сookies(String name, double weight, double price, String uniqueParameter) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.uniqueParameter = uniqueParameter;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getUniqueParameter() {
        return uniqueParameter;
    }

    @Override
    public void setUniqueParameter(String uniqueParameter) {
        this.uniqueParameter = uniqueParameter;
    }
}
