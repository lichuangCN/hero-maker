package site.muzhi.hero.center.manager;

import site.muzhi.hero.core.entity.HeroEntity;

/**
 * @author lichuang
 * @date 2022/05/08
 * @description
 */
public interface HeroManager {

    /**
     * 创建一个新的hero
     */
    String heroBuild();

    /**
     * 寻找hero
     */
    HeroEntity query(String uid);
}
