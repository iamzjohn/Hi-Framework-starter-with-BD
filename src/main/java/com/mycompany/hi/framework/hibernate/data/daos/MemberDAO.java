/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hi.framework.hibernate.data.daos;

import com.mycompany.hi.framework.hibernate.data.model.Member;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author zjohn
 */
@ApplicationScoped
public class MemberDAO extends DAO<Member>{

    @Override
    public Class<Member> getEntityClass() {
       return Member.class;
    }

   
}
