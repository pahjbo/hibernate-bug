package org.acme;
/*
 * Created on 08/12/2023 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DISCR")
public class AbstractEntity {
   @SequenceGenerator(name="ex_generator", sequenceName = "ex_seq", initialValue = 2)
   @Id
   @GeneratedValue(generator = "ex_generator")
   public Long id;
}
