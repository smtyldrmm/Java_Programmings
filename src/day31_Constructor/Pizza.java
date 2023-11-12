package day31_Constructor;

public class Pizza {   public char size;
    public int numberOfCheeseTopic;
    public int numberOfPepperoniTopic;

    public Pizza(char size, int numberOfCheeseTopic, int numberOfPepperoniTopic) {
        this.size = size;
        this.numberOfCheeseTopic = numberOfCheeseTopic;
        this.numberOfPepperoniTopic = numberOfPepperoniTopic;
    }
    public double calCost(){
        double startingPrice=(size=='S')? 10 : (size=='M')? 12 : 14;
        double totalPrice=startingPrice+ 2*(numberOfCheeseTopic+numberOfPepperoniTopic);
        return  totalPrice;
    }


    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopic=" + numberOfCheeseTopic +
                ", numberOfPepperoniTopic=" + numberOfPepperoniTopic +
                '}';
    }
}


