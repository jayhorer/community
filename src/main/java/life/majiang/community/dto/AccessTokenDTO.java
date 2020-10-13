package life.majiang.community.dto;

import lombok.Data;

/**
 * Created by Jay on 20/9/29 - 23:09
 * <p>
 * 因为传递的参数较多,故将所有传输的参数封装为一个对象
 * 编程习惯: 参数超过两个以上,就把他封装一个对象.
 * <p>
 * <p>
 * DTO (数据传输对象): Data Transfer Object   主要用于远程调用等需要大量传输对象的地方。
 * <p>
 * 网络之间传输的 流数据对象
 */
@Data
public class AccessTokenDTO {

    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;


}
