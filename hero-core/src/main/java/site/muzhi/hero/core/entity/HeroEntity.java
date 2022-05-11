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

    /**
     * 名称
     */
    private String name;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 世界等级
     */
    private Long worldLevel;

    /**
     * 世界职业
     */
    private Integer worldOccupation;

    /**
     * 世界种族
     */
    private Integer worldRace;

    /**
     * 经验值
     */
    private Long experiencePoint;

    /**
     * 生命值
     */
    private Long healthPoint;

    /**
     * 魔法值
     */
    private Long magicPoint;

    /**
     * 物理攻击
     */
    private Long physicalAttack;

    /**
     * 魔法攻击
     */
    private Long magicAttack;

    /**
     * 物理防御
     */
    private Long physicalDefense;

    /**
     * 魔法防御
     */
    private Long magicDefense;

    /**
     * 物理命中
     */
    private Long physicalHit;

    /**
     * 魔法命中
     */
    private Long magicHit;

    /**
     * 物理闪避
     */
    private Long physicalDodge;

    /**
     * 魔法闪避
     */
    private Long magicDodge;

    /**
     * 基础力量
     */
    private Long baseStrength;

    /**
     * 基础敏捷
     */
    private Long baseAgility;

    /**
     * 基础智力
     */
    private Long baseIntelligence;

    /**
     * 时间
     */
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
