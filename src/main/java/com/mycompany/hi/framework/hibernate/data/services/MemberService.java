/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hi.framework.hibernate.data.services;

import com.mycompany.hi.framework.hibernate.data.daos.MemberDAO;
import com.mycompany.hi.framework.hibernate.data.model.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 *
 * @author zjohn
 */
@ApplicationScoped
public class MemberService {
    @Inject private MemberDAO memberDAO;
    
    public boolean add(Member member){
        try {
            memberDAO.create(member);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(MemberService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public Member update(Member member){
        try {
            member = memberDAO.update(member);
            return member;
        } catch (Exception ex) {
            Logger.getLogger(MemberService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<Member> getAllMembers(){
        List<Member> members = new ArrayList<>();
        try {
            members = memberDAO.getAll();
            return members;
        } catch (Exception ex) {
            Logger.getLogger(MemberService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public Member read(int id){
        try {
            return memberDAO.getMemberById(id);
        } catch (Exception ex) {
            Logger.getLogger(MemberService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public boolean delete(int id){
        try {
            memberDAO.delete(id);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(MemberService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
