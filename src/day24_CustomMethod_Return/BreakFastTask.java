package day24_CustomMethod_Return;

public class BreakFastTask {
    public static void main(String[] args) {
        initials("Samet","Yildirim");
        domain("yildirimsamet1@gmail.com");
        String [] emails={"john@gmail.com","samet@yahoo.com","sevinc@outlook.com","kayra@yandex.com"};
        for (String email : emails) {
            domain(email);
            // String [] emails arrayinde for döngüsü ile arrayin içerisinde bulunan elementlerin domain bilgilerini alabiliriz.

        }
        nameOfMonth(3);
        nameOfDay(3);
        ageGroups(41);
    }
    // create a method that can display the initials of the person
    public static void initials(String firstName, String lastName){
        String first=firstName.substring(0,1);
        String last=lastName.substring(0,1);
        System.out.println(first+"."+last);
        // or you can use String initial=firstName.charAt(0)+"."+lastName.charAt(0);


    }
    // create a method that can display the domain of the email
    public static void domain(String email){
        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println(domain);

    }
    // create a method that can display  name of the month based on given the number of the method
    public static void nameOfMonth(int number) {
        String name;
        if (number >= 1 && number <= 12) {
            name = (number == 1)? "January" : (number == 2)? "February" : (number == 3) ? "March" : (number == 4) ?
                    "April" : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" :
                    (number == 8) ? "August" : (number == 9) ? "October" : (number == 10)?
                            "September" : (number == 11) ? "November" : (number==12)? "December" : "Invalid Entry";


        }else {
            name="Invalid Entry";
        }
        System.out.println(name);
    }
    // create a method that can print name of the day based on the  given number to the method
    public static void nameOfDay (int number){
        String name="";
        if(number>=1 && number<=7){
            name=(number==1)? "Monday" : (number==2)? "Tuesday" : (number==3)? "Wednesday" : (number==4)?
                    "Thursday" : (number==5)? "Friday" : (number==6)? "Saturday" :"Sunday";
        }else {
            System.out.println("Invalid Entry");
        }
        System.out.println(name);
    }
    //age groups are : infant(1-2), Toddler(3-5), Kid(6-9), Pre-Teen(10-12), Teenager(13-17), Young Adult(18-20)
    //adult(21-39), Young Middle Age adult (40-49), Middle Age Adult(50-54), Very Young Senior Citizen(55-64)
    //Young Senior Citizen(65-74), Senior Citizen(75-84), Old Citizen (85+)
    public static void ageGroups(int number){
        String define="";
        if(number>=0 && number<=130){
            define=(number<=2)? "Infant" : (number<=5)? "Toddler" : (number<=9)? "Kid" : (number<=12)? "Pre-Teen" :
                    (number<=17)? "Teenager" : (number<=20)? "Young Adult" : (number<=39)? "Adult" : (number<=49)?
                            "Young Middle Age Adult" : (number<=54)? "Middle Age Adult" : (number<=64)?
                            "Very Young Senior Citizen" : (number<=74)? "Young Senior Citizen" : (number<=84)?
                            "Senior Citizen" : "Old Citizen" ;
        }else {
            System.out.println("Invalid Entry");
        }
        System.out.println(define);
    }

}

