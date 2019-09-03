//package com.inti.service.impl;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.inti.entities.Role;
//import com.inti.entities.Utilisateur;
//import com.inti.model.UtilisateurDetail;
//import com.inti.service.interfaces.IAppUserDetailsService;
//import com.inti.service.interfaces.IUtilisateurService;
//
//@Service
//@Transactional
//public class AppUserDetailService implements IAppUserDetailsService{
//	@Autowired
//	IUtilisateurService utilisateurService;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		Utilisateur utilisateur = utilisateurService.findOneByUsername(username);
//		Set<Role> roles = utilisateur.getListRole();
//		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
//		for (Role role : roles) {
//			authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getLibelle()));
//			System.out.println("Le role est:" + role.getLibelle());
//		}
//		UtilisateurDetail utilisateurDetail = new UtilisateurDetail();
//		utilisateurDetail.setUtilisateur(utilisateur);
//		utilisateurDetail.setAuthorities(authorities);
//		return utilisateurDetail;
//	}
//}
