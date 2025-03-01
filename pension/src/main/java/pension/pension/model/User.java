package pension.pension.model;

import lombok.Data;

@Data
public class User {

        private String voornaam;
        public String achternaam;
        private String email;
        private Integer leeftijd;

        private Integer verwachtePensioenLeeftijd; 
        public Double verwachtPensioenWaarde; 

        public Double fulltimeSalaris; 
        private Double parttimePercentage;

        // Getters & Setters
        public Integer getleeftijd() {
            return leeftijd;
        }

        public void setleeftijd(Integer leeftijd) {
            this.leeftijd = leeftijd;
        }

        public Integer getverwachtePensioenLeeftijd() {
            return verwachtePensioenLeeftijd;
        }

        public void setverwachtePensioenLeeftijd(Integer verwachtePensioenLeeftijd) {
            this.verwachtePensioenLeeftijd = verwachtePensioenLeeftijd;
        }

        public Double getVerwachtPensioenWaarde() {
            return verwachtPensioenWaarde;
        }

        public void setVerwachtPensioenWaarde(Double verwachtPensioenWaarde) {
            this.verwachtPensioenWaarde = verwachtPensioenWaarde;
        }

        public Double getFulltimeSalaris() {
            return fulltimeSalaris;
        }

        public void setFulltimeSalaris(Double fulltimeSalaris) {
            this.fulltimeSalaris = fulltimeSalaris;
        }

        public Double getparttimePercentage() {
            return parttimePercentage;
        }

        public void setparttimePercentage(Double parttimePercentage) {
            this.parttimePercentage = parttimePercentage;
        }
}
