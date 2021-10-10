package life.majiang.commnunity.controller;

import life.majiang.commnunity.dto.AccessTokenDTO;
import life.majiang.commnunity.dto.GiteeUser;
import life.majiang.commnunity.provider.GiteeProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Jay on 21/10/6 - 19:19
 */
@Controller
@Slf4j
public class AuthorizeController {

    @Autowired
    private GiteeProvider githubProvider;

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code, @RequestParam(name = "state") String state) {
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setCode(code);
        accessTokenDTO.setState(state);
        accessTokenDTO.setClient_id("dded2a15a8c3a3f544af");
        accessTokenDTO.setClient_secret("6a4c96eda87184019b52bc145bc6a91731cae072");
        accessTokenDTO.setRedirect_uri("http://localhost:8887/callback");
        String accessToken = githubProvider.getAccessToken(accessTokenDTO);
        GiteeUser user = null;
        try {
            user = githubProvider.getUser(accessToken);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("user.getName():{}",user.getName());
        return "index";
    }


}
