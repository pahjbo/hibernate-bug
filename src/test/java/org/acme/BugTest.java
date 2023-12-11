package org.acme;
/*
 * Created on 08/12/2023 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */

import io.quarkus.test.junit.QuarkusTest;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class BugTest {
   @PersistenceContext
   protected EntityManager em;

   @Test
   @Transactional
   public void testAddNew(){
      FullEntity e = new FullEntity("initial value");
      em.persist(e);
      e.updateValues();
      em.merge(e);
   }
   @Test
   @Transactional
   public void testUpdate(){

      TypedQuery<FullEntity> q = em.createQuery("select s from FullEntity s where s.id = 1", FullEntity.class);
      FullEntity fq = q.getSingleResult();
      fq.updateValues();
      em.merge(fq);
   }


}
