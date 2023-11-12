package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {
    public static void main(String[] args) {
    Car car1=new Car();
    car1.setInfo("BMW","Blue","520",7,7200);
    System.out.println(car1);

    Car car2= new Car();
    car2.setInfo("Toyota","Black","Camry",2018,8400);
    System.out.println(car2);

    // Array oluşturma
    Car [] cars={car1,car2};

    // ArrayList oluşturma
    ArrayList<Car> carsList= new ArrayList<>();
    carsList.addAll(Arrays.asList(car1,car2));

    for (Car each : carsList){
        System.out.println(each.brand+" : "+each.price);
    }

        /* RECALL :
        BMW : 2005-2008
        Toyota : 1995-1997

                 */
    // Yukarıdaki çağrı listesini bu şekilde carList'e uygulayabiliriz.
    carsList.removeIf(p -> p.brand.equals("BMW") && p.year>=2005 && p.year<=2008);
    carsList.removeIf(p -> p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);

}
}


