/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hi.framework.hibernate.frontiers;

import com.mycompany.hi.framework.hibernate.data.model.Member;
import com.mycompany.hi.framework.hibernate.data.services.MemberService;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.emerjoin.hi.web.meta.Frontier;

/**
 *
 * @author zjohn
 */
@ApplicationScoped
@Frontier
public class MemberFrontier {
    @Inject
    private MemberService memberService;
    
    
    public List<Member> findAll(){
        return memberService.getAllMembers();
    }
    
    public boolean add(Member member){
        return memberService.add(member);
    }
    
    public boolean delete(int id){
        return memberService.delete(id);
    }
    
    public Member update(Member member){
        return memberService.update(member);
    }
    
    public Member get(int id){
        return memberService.read(id);
    }
}
