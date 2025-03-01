package pension.pension.service;

import pension.pension.model.User;
import pension.pension.model.Finance;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    public static Double getPensioenWaarde(User user){
        Finance finance = createFinance();
        Double jaarlijksePremie = berekenJaarlijksePremie(user,finance);
        Double waarde = huidigeWaardeBeleggingen();
        return berekenPensioenWaarde(waarde, jaarlijksePremie, user, finance);       
    }

    public static Finance createFinance(){
        //Ophalen uit database
        Finance finance = new Finance();
        finance.setfranchiseRegeling(15599.00);
        finance.setbeschikbarePremiePercentage(0.05);
        finance.setrendement(0.03);
        return finance;
    }

    public static Double huidigeWaardeBeleggingen(){
        // api request met beleggingsservice om op te halen
        return 100000.00;
    }

    public static Double berekenJaarlijksePremie(User user, Finance finance){
        return (user.getFulltimeSalaris() - finance.getfranchiseRegeling()) * user.getparttimePercentage() * finance.getbeschikbarePremiePercentage();
    }

    public static Double berekenPensioenWaarde(Double waarde, Double jaarlijksePremie, User user, Finance finance){
        Integer years = user.getverwachtePensioenLeeftijd() - user.getleeftijd();
        for (int i = 0; i < years; i++) {
            waarde = (waarde + jaarlijksePremie + (waarde + jaarlijksePremie / 2) * finance.getrendement());
        }
        return waarde;
    }
}
