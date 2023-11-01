package day21_ForEachLoop;

public class ReverseNames2 {
    public static void main(String[] args) {

        String [] names={"Samet Yildirim","Kayra Uras","Kara Kartal","Valtra Hattat"};

        for (String each : names) {
            String str="";
            for (int i = each.length()-1; i >=0 ; i--) {
// if I don't write each.length()-1, I get exception that StringIndexOutOfBound exception
                str+=each.charAt(i);
// in above part, fori loop give me first last part of the each one
            }
            System.out.println(str);
        }
        }
    }

