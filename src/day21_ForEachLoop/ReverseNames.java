package day21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {

        String [] names={"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming",
                "Selenium Automation", "API Testing", "Database Testing", "Manual Testing"};
        // Stringi tersten yazdırmak istiyoruz.
        // For döndererek her bir Stringi ayırdık.
        for (String each : names) {
            // reversed adlı String açtık. İşlem sonuçlarını bu Stringe döndereceğiz
            String reversed="";
            // Yukarıdaki for döngüsünden alınan her bir Stringi tersten yazdırmak için for dönderiyoruz ama each.length()-1 alarak sondan başa gelemesini istiyoruz.
            for (int i =each.length()-1; i >= 0 ; i--) {
                //charAt(i) ile for döngüsünde gelen her bir karakteri ekleyerek reversed atamasını istiyoruz.
                reversed+=each.charAt(i);

            }
            System.out.println(reversed);
        }


    }
}
