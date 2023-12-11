package org.acme;
/*
 * Created on 08/12/2023 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */

import jakarta.persistence.Entity;

@Entity
public class AltEntity extends BaseEntity {
   public String altField;
}
