package day30_CustomClass;

public class Dog {


        public String name  ;
        public int    age   ;
        public char gender  ;
        public String breed ;
        public String size  ;
        public String color ;
        public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
            name=dogName;
            breed=dogBreed;
            age=dogAge;
            gender=dogGender;
            size=dogSize;
            color=dogColor;
        }

        public void eat() {
            System.out.println(name+ " is eating");
        }
        public void bark() {
            System.out.println(name+" is barking");
        }
        public void play() {
            System.out.println(name+" is playing");
        }

        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    ", breed='" + breed + '\'' +
                    ", size='" + size + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }





/*

Attributes :
        names, age, gender, breed, size, color


Actions    :
        eat(), play (), bark(),
 */



