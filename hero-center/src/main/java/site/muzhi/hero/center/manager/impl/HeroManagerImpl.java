package site.muzhi.hero.center.manager.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import site.muzhi.hero.center.manager.HeroManager;
import site.muzhi.hero.core.entity.HeroEntity;
import site.muzhi.hero.center.repo.service.HeroEntityService;
import site.muzhi.hero.center.util.HeroNameUtils;
import site.muzhi.hero.core.constant.GenderEnum;

import java.time.LocalDateTime;

/**
 * @author lichuang
 * @date 2022/05/08
 * @description
 */
@Component
public class HeroManagerImpl implements HeroManager {

    @Autowired
    private HeroEntityService heroEntityService;

    @Override
    public String heroBuild() {
        HeroEntity hero = HeroEntity.builder()
                .uid(IdWorker.getIdStr())
                .name(HeroNameUtils.makeRandomName())
                .gender(GenderEnum.BOY.getCode())
                .createDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();
        heroEntityService.save(hero);
        return hero.getName();
    }

    @Override
    public HeroEntity query(String uid) {
        LambdaQueryWrapper<HeroEntity> queryWrapper = new LambdaQueryWrapper<HeroEntity>()
                .eq(HeroEntity::getUid, uid);
        return heroEntityService.getOne(queryWrapper);
    }
}
