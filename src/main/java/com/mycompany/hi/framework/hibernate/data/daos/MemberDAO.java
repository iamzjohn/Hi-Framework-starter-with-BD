/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hi.framework.hibernate.data.daos;

import com.mycompany.hi.framework.hibernate.data.model.Member;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author zjohn
 */
@ApplicationScoped
public class MemberDAO {

    private  String PERSISTENCE_UNIT = "h2";
    private Class<Member> entityClass = Member.class;
    private  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
    private EntityManager entityManager;

    public MemberDAO() {
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public Member create(Member member) throws Exception {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(member);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("DAO create failed!");

        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        return member;

    }

//    public List<Member> findAll(){
//        entityManager.
//    }
    public Member update(Member member) throws Exception {

        try {
            entityManager.getTransaction().begin();
            entityManager.merge(member);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("DAO update failed!");
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        return member;

    }

    public Member getMemberById(int id) throws Exception {
        Member member = null;
        try {
            member = entityManager.find(entityClass, id);

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("DAO find failed!");
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        return member;

    }

    public void delete(int id) throws Exception {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(entityManager.getReference(entityClass, id));
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("DAO delete failed!");
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }
     public List<Member> getAll() throws Exception {
        Query query = null;
        List<Member> ts = null;
        try{
             query = entityManager.createQuery("from " + entityClass.getName());
             ts = query.getResultList();
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("DAO getAll failed!");
        }finally {
            if(entityManager!=null)
                entityManager.close();
        }
        return ts;
    }
}
