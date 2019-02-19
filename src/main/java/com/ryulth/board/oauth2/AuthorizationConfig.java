/*package com.ryulth.board.oauth2;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@Configuration
@EnableAuthorizationServer // 구체적인 환경설정 가능
public class AuthorizationConfig extends AuthorizationServerConfigurerAdapter {
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception { // 요청 클라이언트의 정보 수정
        clients.inMemory() //inMemory()는 클라이언트 정보를 메모리에 저장한다. 개발 환경에 적합하다. 반면 jdbc()는 데이터베이스에 저장한다. 운영 환경에 적합하다.
                .withClient("some_client_id")
                .secret("some_client_secret")
                .scopes("read:current_user", "read:users")
                .authorizedGrantTypes("client_credentials");
    }
}
*/