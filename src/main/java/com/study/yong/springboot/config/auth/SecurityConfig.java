package com.study.yong.springboot.config.auth;

import com.study.yong.springboot.domain.user.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.userinfo.CustomUserTypesOAuth2UserService;

@RequiredArgsConstructor
// spring security 설정들을 활성화 시켜준다.
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final CustomOAuth2UserService customOAuth2UserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                // h2-console화면을 사용하기 위해 해당 옵션들은 disable처리
                .csrf().disable()
                .headers().frameOptions().disable()


                .and()
                    // url별 권한을 관리하는 옵션의 시작점
                    // authorizeRequests가 선언되어야만 antMatchers옵션을 사용할 수 있음.
                    .authorizeRequests()
                    // antMatchers : 권한 관리를 지정하는 옵션
                    // - 권한 관리를 지정하는 옵션
                    // - URL HTTP 메소드별 관리가 가능
                    // - "/"등 지정된 URL들은 permitAll()옵션을 통해 전체 열람 권한을 줌
                    // - POST메서드이면서 "/api/v1/**"주소를 가진 API는 USER권한을 가진 사람만 가능하도록 설정
                    .antMatchers("/", "/css/**", "/images/**", "/js/**", "/h2-console/**").permitAll()
                    .antMatchers("/api/v1/**").hasRole(Role.USER.name())

                    // 설정된 값 외 나머지 URL을 나타냄
                    // 여기서는 authenticated()를 추가해서 나머지 URL들은 모두 인증된 사용자들에게만 허용하게 함(인증된 사용자 : 로그인한 사용자)
                    .anyRequest().authenticated()
                .and()
                    // 로그아웃 기능에 대한 설정의 진입점, 로그아웃 성공시 "/" 주소로 이동 처리
                    .logout()
                    .logoutSuccessUrl("/")
                .and()
                    // OAuth2 로그인 기능에 대한 설정의 진입점
                    .oauth2Login()
                        // OAuth2 로그인 성공 후 사용자 정보를 가져올 떄 설정들을 담당함.
                        .userInfoEndpoint()
                            // 소셜 로그인 성공 시 후속조치를 진행할 UserService 인터페이스 구현체 등록
                            .userService(customOAuth2UserService);
    }

}
