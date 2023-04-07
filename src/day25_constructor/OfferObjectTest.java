package day25_constructor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjectTest {
    public static void main(String[] args) {

        Offer offer1=new Offer("VA","SDETs",65000,true,false,true,true);
        Offer offer2=new Offer("FL","Developer",75000,true,false,true,true);
        Offer offer3=new Offer("TX","SDETs",65000,true,false,true,true);
        Offer offer4=new Offer("WA","SDETs",65000,true,false,true,true);
        Offer offer5=new Offer("CA","Developer",85000,true,false,true,false);
        Offer offer6=new Offer("FL","SDETs",65000,true,false,false,true);
        Offer offer7=new Offer("FL","Developer",95000,true,true,true,true);


        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5,offer6,offer7};
        ArrayList<Offer> fullTimeOffer=new ArrayList<>(Arrays.asList(offer1,offer2,offer3,offer4,offer5,offer6,offer7));
        fullTimeOffer.removeIf(p->!p.isFullTime);
        System.out.println(fullTimeOffer.size());
        System.out.println(fullTimeOffer);

        ArrayList<Offer> localOffers = new ArrayList<>( Arrays.asList( myOffers )  );
        localOffers.removeIf( p -> !( p.location.equals("VA") || p.location.equals("CA") ) ); // removes the offer if the offer is not from local area

        System.out.println(localOffers.size());

    }
}
