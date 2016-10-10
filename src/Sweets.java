/**
 * Created by cs.ucu.edu.ua on 06.10.2016.
 */
public class Sweets {


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    protected int weight = 0;

    public String getWrapper_color() {
        return wrapper_color;
    }

    public void setWrapper_color(String wrapper_color) {
        this.wrapper_color = wrapper_color;
    }

    protected String wrapper_color = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected String name = "";

    public int getAmount_of_sugar() {
        return amount_of_sugar;
    }

    public void setAmount_of_sugar(int amount_of_sugar) {
        this.amount_of_sugar = amount_of_sugar;
    }

    protected int amount_of_sugar = 0;

    public String toString() {
        return this.wrapper_color + " " + this.name;
    }

}
