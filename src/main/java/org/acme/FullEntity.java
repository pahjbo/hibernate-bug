package org.acme;
/*
 * Created on 08/12/2023 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */


import jakarta.persistence.Entity;

@Entity
public class FullEntity extends BaseEntity{

   protected String fullField;

   public FullEntity(String initialValue)
   {
      super(initialValue);
      fullField = initialValue;
   }

   public FullEntity() {

   }
   public void updateValues()
   {
      this.fullField = "updated";
      this.baseField = "updated";
   }
}
