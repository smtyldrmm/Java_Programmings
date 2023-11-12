package day30_CustomClass;

public class Student {
    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;
    // setInfo methodu için kısayol oluşturmak için sağ tık generate, sonra constructor
    // hepsini seç ve ok.bas. public kısmını void setInfo olarak değiştir.İşte bu kadar.

    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    /*  public void setInfo( String name, char gender, int age, int ID, char grade){
        // Yukarıdaki object değişkenleri ile alt tarafta oluşturdumuz değişken isimleri aynı olursa
        // bu şekilde this kullanarak birbirlerine atıyabiliriz.
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.ID=ID;
        this.grade=grade;*/


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void code() {
        System.out.println(name + " is coding");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
}


