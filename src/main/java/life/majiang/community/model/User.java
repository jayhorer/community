package life.majiang.community.model;

import lombok.Data;

/**
 * Created by Jay on 20/10/9 - 17:05
 */

@Data
public class User {

    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;


}
