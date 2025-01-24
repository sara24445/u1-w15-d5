package com.esempio.biblioteca.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("RIVISTA")
public class Rivista extends Elemento {
    public enum Periodicità {
        SETTIMANALE, MENSILE, SEMESTRALE
    }

    private Periodicità periodicità;

    // Getter e Setter

    public Periodicità getPeriodicità() {
        return periodicità;
    }

    public void setPeriodicità(Periodicità periodicità) {
        this.periodicità = periodicità;
    }
}