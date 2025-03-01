package pension.pension.model;

import lombok.Data;

@Data
public class Finance {

    public double franchiseRegeling;
    public double beschikbarePremiePercentage;
    public double rendement;

    public Double getfranchiseRegeling() {
        return franchiseRegeling;
    }

    public void setfranchiseRegeling(Double franchiseRegeling) {
        this.franchiseRegeling = franchiseRegeling;
    }

    public Double getbeschikbarePremiePercentage() {
        return beschikbarePremiePercentage;
    }

    public void setrendement(Double rendement) {
        this.rendement = rendement;
    }

    public Double getrendement() {
        return rendement;
    }

    public void setbeschikbarePremiePercentage(Double beschikbarePremiePercentage) {
        this.beschikbarePremiePercentage = beschikbarePremiePercentage;
    }

}
