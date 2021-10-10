package life.majiang.commnunity.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created by Jay on 21/10/7 - 14:32
 */
@Component
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
