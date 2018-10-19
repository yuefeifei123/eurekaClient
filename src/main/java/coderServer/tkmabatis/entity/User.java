package coderServer.tkmabatis.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Table;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author feifei
 * @since 2018-10-16
 */
@Data
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String nameHaha;

    private Integer age;

    private String emailKk;


}
