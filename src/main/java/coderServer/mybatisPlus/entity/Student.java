package coderServer.mybatisPlus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author feifei
 * @since 2018-10-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 表id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 学生姓名
     */
    @TableField("name")
    private String name;

    /**
     * 创建时间
     */
    @TableField("create_at")
    private Long createAt;

    /**
     * 更新时间
     */
    @TableField("update_at")
    private Long updateAt;

    /**
     * qq
     */
    @TableField("qq")
    private Integer qq;

    /**
     * 学习类型
     */
    @TableField("study_type")
    private String studyType;

    /**
     * 加入时间
     */
    @TableField("join_time")
    private Long joinTime;

    /**
     * 大学
     */
    @TableField("university")
    private String university;

    @TableField("study_id")
    private String studyId;

    @TableField("daily_link")
    private String dailyLink;

    @TableField("slogen")
    private String slogen;

    @TableField("master")
    private String master;


}
