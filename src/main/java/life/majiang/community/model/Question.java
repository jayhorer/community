package life.majiang.community.model;

import lombok.Data;

/**
 * Created by Jay on 20/10/12 - 18:31
 */
@Data
public class Question {

    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;


}
