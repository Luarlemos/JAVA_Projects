package br.com.dh.empresaSpring.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource dataSource;
	@Bean
	public PasswordEncoder passwordEncoder() {
		//return new BCryptPasswordEncoder();
		return NoOpPasswordEncoder.getInstance();
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.jdbcAuthentication()
			.dataSource(dataSource)
			.usersByUsernameQuery("select email, senha, habilitado "+ "from funcionario where email = ?")
			.authoritiesByUsernameQuery("select email, autoridade "+"from autorizacao where email = ?");
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.csrf().disable()
			.authorizeRequests()
			.antMatchers("/").permitAll()
			.antMatchers("/cliente/cadastrar").permitAll()
			.antMatchers("/pedido/cadastrar").permitAll()
			.antMatchers("/funcionario/cadastrar").hasRole("GERENTE")
			.antMatchers("/funcionario/demitir/{idFuncionario}").hasRole("GERENTE")
			.antMatchers("/funcionario/reajustar/{idFuncionario}").hasRole("GERENTE")
			.antMatchers("/funcionario/editar/{idFuncionario}").hasRole("GERENTE")
			.and().httpBasic();
	}
}
