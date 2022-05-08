package site.muzhi.hero.core.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author lichuang
 * @date 2022/05/08
 * @description
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("hero")
public class HeroEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO, value = "id")
    private Integer id;

    private String uid;

    private String name;

    private Integer gender;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

}
