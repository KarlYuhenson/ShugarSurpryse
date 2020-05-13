abstract public class Sweets {

    String name;
    double weight;
    double price;
    String uniqueParameter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUniqueParameter() {
        return uniqueParameter;
    }

    public void setUniqueParameter(String uniqueParameter) {
        this.uniqueParameter = uniqueParameter;
    }

}
//    Базовый абстрактный класс для всех видов сладостей и конкретные сладости, наследующиеся от базового,