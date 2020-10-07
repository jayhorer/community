package life.majiang.community.dto;

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
public class AccessTokenDTO {

    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

    public AccessTokenDTO() {
    }

    public AccessTokenDTO(String client_id, String client_secret, String code, String redirect_uri, String state) {
        this.client_id = client_id;
        this.client_secret = client_secret;
        this.code = code;
        this.redirect_uri = redirect_uri;
        this.state = state;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRedirect_uri() {
        return redirect_uri;
    }

    public void setRedirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "AccessTokenDTO{" +
                "client_id='" + client_id + '\'' +
                ", client_secret='" + client_secret + '\'' +
                ", code='" + code + '\'' +
                ", redirect_uri='" + redirect_uri + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
