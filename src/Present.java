import java.util.Arrays;

/**
 * Created by cs.ucu.edu.ua on 06.10.2016.
 */
public class Present {
    Sweets[] sweets = new Sweets[1];
    private int lastIndex = 0;
    public void addSweet(Sweets sw){
        if(lastIndex < sweets.length){
            sweets[lastIndex] = sw;
            lastIndex += 1;
        }else {
            Sweets[] sweet = new Sweets[lastIndex+1];
            for (int i = 0; i < lastIndex; i++){
                sweet[i] = sweets[i];
            }
            sweet[lastIndex] = sw;
            sweets = sweet;
            lastIndex += 1;

        }

    }
    public String toString(){
        return Arrays.toString(sweets);
    }
    public Integer Weight(){
        int weight = 0;
        for(int i=0;i<sweets.length;i++){
            weight+=this.sweets[i].getWeight();
        }
        return weight;
    }

    public void SortSugar(){
        Arrays.sort(sweets, (a, b) -> Integer.compare(a.amount_of_sugar, b.amount_of_sugar));
    }

    public String  FindSweet(int start_am, int end_am){
        for(int i=0; i< sweets.length; i++){
            if (this.sweets[i].amount_of_sugar < end_am && this.sweets[i].amount_of_sugar >start_am){
                return this.sweets[i].wrapper_color +" "+ this.sweets[i].name;
            }
        }
        return "";
    }
}
