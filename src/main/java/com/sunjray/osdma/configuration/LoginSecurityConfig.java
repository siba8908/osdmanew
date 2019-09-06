package com.sunjray.osdma.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.sunjray.osdma.loginservice.UserService;
import com.sunjray.osdma.loginservice.UserServiceImpl;
import com.sunjray.osdma.util.CustomSucessHandler;

@Configuration
@EnableWebSecurity

public class LoginSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	UserServiceImpl userDetailsService;
	@Autowired
	CustomSucessHandler sucessHandeller;

	/*
	 * @Autowired public void configureGlobal(AuthenticationManagerBuilder
	 * authenticationMgr) throws Exception {
	 * authenticationMgr.inMemoryAuthentication()
	 * .withUser("jduser").password("jdu@123").authorities("ROLE_USER") .and()
	 * .withUser("jdadmin").password("jda@123").authorities("ROLE_USER","ROLE_ADMIN"
	 * ); }
	 * 
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * 
	 * http.csrf().disable(); http.authorizeRequests() .antMatchers("/homePage").
	 * access("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
	 * .antMatchers("/userPage").access("hasRole('ROLE_USER')")
	 * .antMatchers("/adminPage").access("hasRole('ROLE_ADMIN')") .and()
	 * .formLogin().loginPage("/login") .defaultSuccessUrl("/addmateriallist")
	 * .failureUrl("/loginPage?error")
	 * .usernameParameter("username").passwordParameter("password") .and()
	 * .logout().logoutSuccessUrl("/loginPage?logout");
	 * 
	 * }
	 */
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		// Setting Service to find User in the database.
		// And Setting PassswordEncoder
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
		//auth.authenticationProvider(authenticationProvider());
		
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable();

		// The pages does not require login
		http.authorizeRequests().antMatchers("/", "/login", "/logout").permitAll();
	
		// /userInfo page requires login as ROLE_USER or ROLE_ADMIN.
		// If no login, it will redirect to /login page.
		//http.authorizeRequests().antMatchers("/userInfo").access("hasAnyRole('ROLE_HR', 'ROLE_PC')");

		// For HR only.
		http.authorizeRequests().antMatchers("/hr/**").access("hasRole('ROLE_HR')");
		http.authorizeRequests().antMatchers("/qaqc/**").access("hasRole('ROLE_QA')");
		http.authorizeRequests().antMatchers("/am/**").access("hasRole('ROLE_AM')");
		http.authorizeRequests().antMatchers("/pc/**").access("hasRole('ROLE_PC')");
		http.authorizeRequests().antMatchers("/wa/**").access("hasRole('ROLE_WA')");
		http.authorizeRequests().antMatchers("/wb/**").access("hasRole('ROLE_WB')");
		http.authorizeRequests().antMatchers("/pm/**").access("hasRole('ROLE_PM')");
		// When the user has logged in as XX.
		// But access a page that requires role YY,
		// AccessDeniedException will be thrown.
		http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");

		// Config for Login Form
		http.authorizeRequests().and().formLogin()//
				// Submit URL of login page.
				.loginPage("/login")//
				.loginProcessingUrl("/j_spring_security_check")
				.usernameParameter("username").passwordParameter("password") // Submit Parameter
				.successHandler(sucessHandeller)//
				.failureUrl("/login?error=true")
				// Config for Logout Page
				.and().logout().logoutUrl("/logout").logoutSuccessUrl("/login?logout=true");

	}
	@Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(
                "/resources/**", "/static/**", "/css/**", "/js/**", "/images/**",
                "/resources/static/**", "/css/**", "/js/**", "/img/**", "/fonts/**",
                "/images/**", "/scss/**", "/vendor/**",          
                 "/components/**"
                );
    }
	 /*@Bean
	    public DaoAuthenticationProvider authenticationProvider() {
	        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
	        authenticationProvider.setUserDetailsService(userDetailsService);
	        authenticationProvider.setPasswordEncoder(passwordEncoder());
	        return authenticationProvider;
	    }*/
}
