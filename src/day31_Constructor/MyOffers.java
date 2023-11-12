package day31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1=new Offer();
        offer1.setInfo("VA","Amazon INC","SDET",11000,true,true,true,true);

        Offer offer2=new Offer();
        offer2.setInfo("CA","Sony INC","QA",12000,true,true,false,true);

        Offer offer3=new Offer();
        offer3.setInfo("FL","Apple","QE",12500,true,true,true,false);

        Offer offer4=new Offer();
        offer4.setInfo("TX","CapitalOne","SM",11500,false,false,true,true);

        Offer offer5=new Offer();
        offer5.setInfo("WA","Bank Of America","BA",13000,true,true,false,true);



        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        Offer [] myOffer={offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer> fullTimeOffer=new ArrayList<>(Arrays.asList(myOffer));
        fullTimeOffer.removeIf(p -> !(p.isFullTime));
        System.out.println(fullTimeOffer.size());

        ArrayList<Offer> localOffers=new ArrayList<>(Arrays.asList(myOffer));
        localOffers.removeIf(p-> !(p.location.equals("VA")));
        System.out.println(localOffers.size());

        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName+" : "+ localOffer.salary);
        }



    }
}

