## 常见的问题Q&A(技术性/非技术性)
#### 1. 新加入到static目录中的css,js文件无法识别?

答: 重新启动IDEA编辑器.

参考:[解决方案](https://blog.csdn.net/qq_40803710/article/details/89344106)

#### 2. access_token不能作为请求参数了

答: 可以使用如下代码来替换OkHttp中的Request生成代码:[参考连接](https://niter.cn/p/115)
```java
...
    Request request = new Request.Builder()
        .url("https://api.github.com/user")
        .header("Authorization","token "+accessToken)
        .post(body)
        .build();
```