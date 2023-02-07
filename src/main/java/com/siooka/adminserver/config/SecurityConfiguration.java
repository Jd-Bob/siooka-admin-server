package com.siooka.adminserver.config;

//import de.codecentric.boot.admin.server.config.AdminServerProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
//import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import java.util.UUID;

//@EnableWebSecurity
public class SecurityConfiguration {
//    private final AdminServerProperties adminServer;
//    private final String adminContextPath;
//
//    public SecurityConfiguration(AdminServerProperties adminServer) {
//        this.adminServer = adminServer;
//        this.adminContextPath = adminServer.getContextPath();
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
////        SavedRequestAwareAuthenticationSuccessHandler successHandler =
////                new SavedRequestAwareAuthenticationSuccessHandler();
////        successHandler.setTargetUrlParameter("redirectTo");
////        successHandler.setDefaultTargetUrl(this.adminServer.getContextPath() + "/");
////
////        http
////                .authorizeRequests()
////                .requestMatchers(this.adminServer.getContextPath() + "/assets/**").permitAll()
////                .requestMatchers(this.adminServer.getContextPath() + "/login").permitAll()
////                .requestMatchers(this.adminServer.getContextPath() + "/actuator").permitAll()
////                .requestMatchers(this.adminServer.getContextPath() + "/actuator/**").permitAll()
////                .requestMatchers(this.adminServer.getContextPath() + "/instances/**").permitAll()
////                .requestMatchers(this.adminServer.getContextPath() + "/instances").permitAll()
////                .anyRequest().authenticated()
////                .and()
////                .formLogin()
////                .loginPage(this.adminServer.getContextPath() + "/login")
////                .successHandler(successHandler)
////                .and()
////                .logout()
////                .logoutUrl(this.adminServer.getContextPath() + "/logout")
////                .and()
////                .httpBasic()
////                .and()
////                .csrf()
////                .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
////                .ignoringRequestMatchers(
////                        new AntPathRequestMatcher(this.adminServer.getContextPath() +
////                                "/instances", HttpMethod.POST.toString()),
////                        new AntPathRequestMatcher(this.adminServer.getContextPath() +
////                                "/instances/*", HttpMethod.DELETE.toString()),
////                        new AntPathRequestMatcher(this.adminServer.getContextPath() + "/actuator/**"))
////                .and()
////                .rememberMe()
////                .key(UUID.randomUUID().toString())
////                .tokenValiditySeconds(1209600);
////        return http.build();
//        http.formLogin().loginPage("/login.html").loginProcessingUrl("/login").permitAll();
//        http.logout().logoutUrl("/logout");
//        http.csrf().disable();
//
//        http.authorizeRequests().requestMatchers("/login.html", "/**/*.css", "/img/**", "/third-party/**").permitAll();
//        http.authorizeRequests().requestMatchers("/**").authenticated();
//
//        http.httpBasic();
//        return http.build();
//    }
}
