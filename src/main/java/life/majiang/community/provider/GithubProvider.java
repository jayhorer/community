package life.majiang.community.provider;

import com.alibaba.fastjson.JSON;
import life.majiang.community.dto.AccessTokenDTO;
import life.majiang.community.dto.GithubUser;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by Jay on 20/9/29 - 23:05
 * <p>
 * 单个功能的封装   代码隔离
 * 减弱系统各功能间的耦合
 *
 * @component 该注解  用于将当前类添加到上下文,,IOC容器里面,spring bean 自动管理
 * 为单例模式   只能有一个对象  可以通过配置文件进行修改
 * <p>
 * <p>
 * 通过package (包) 来隔离业务
 */
@Component
public class GithubProvider {


    public String getAccessToken(AccessTokenDTO accessTokenDTO) {
        MediaType mediaType = MediaType.get("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(accessTokenDTO));
        Request request = new Request.Builder()
                .url("https://github.com/login/oauth/access_token")
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String string = response.body().string();//以上为  获取token+statu 内容
            String token = string.split("&")[0].split("=")[1];//截取其中的token信息
            //System.out.println(token); 测试token是否获取
            return token;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public GithubUser getUser(String accessToken) {

        OkHttpClient client = new OkHttpClient();
       /* Request request = new Request.Builder()
                .url("https://api.github.com/user?access_token=" + accessToken)
                .build();*/
        Request request = new Request.Builder()
                .url("https://api.github.com/user")
                .header("Authorization","token "+accessToken)
                .build();
        try {
            Response response = client.newCall(request).execute();
            String string = response.body().string();
            GithubUser githubUser = JSON.parseObject(string, GithubUser.class);

            return githubUser;
        } catch (IOException e) {

        }
        return null;
    }
}
