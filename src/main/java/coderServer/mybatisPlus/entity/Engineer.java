package coderServer.mybatisPlus.entity;

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
public class Engineer implements Serializable {

    private static final long serialVersionUID = 1L;

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
     * 表id
     */
    @TableField("engineer_id")
    private Integer engineerId;

    /**
     * 图像
     */
    @TableField("engineer_img")
    private String engineerImg;

    /**
     * 类型
     */
    @TableField("engineer_type")
    private String engineerType;

    /**
     * 简介
     */
    @TableField("engineer_intro")
    private String engineerIntro;

    /**
     * 技能
     */
    @TableField("engineer_sill")
    private String engineerSill;

    /**
     * 学历
     */
    @TableField("engineer_degree")
    private String engineerDegree;

    /**
     * 成长周期
     */
    @TableField("engineer_growth")
    private String engineerGrowth;

    @TableField("engineer_scarcity")
    private String engineerScarcity;

    @TableField("engineer_salary_One")
    private Integer engineerSalaryOne;

    @TableField("engineer_salary_Three")
    private Integer engineerSalaryThree;

    @TableField("engineer_salary_Five")
    private Integer engineerSalaryFive;

    @TableField("engineer_proceed")
    private Integer engineerProceed;

    @TableField("engineer_tip")
    private String engineerTip;


}
