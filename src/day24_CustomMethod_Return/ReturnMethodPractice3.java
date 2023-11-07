package day24_CustomMethod_Return;

public class ReturnMethodPractice3 {
    public static void main(String[] args) {
        String str="aabccdee";
        for (int i = 0; i < str.length(); i++)   {
            int frequency= frequency(str,str.charAt(i));
            if(frequency==1){
                System.out.println(str.charAt(i));
            }
        }
    }
    public static int frequency(String str,char ch){
        int count=0;
        for (char each : str.toCharArray()) {
    /* yukarıda str.toCharArray ile str yi char a ayırdım ve her bir charı aşağı tarafta ch ile
      karşılaştırmasını istedim.Bunlar aynı ise count 1'er arttır dedim.*/
            if(each==ch){
                count++;
            }
        }
        return count;
    }
}
