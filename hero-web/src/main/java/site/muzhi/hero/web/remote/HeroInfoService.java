package site.muzhi.hero.web.remote.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.muzhi.hero.core.api.Assert;
import site.muzhi.hero.core.api.Result;
import site.muzhi.hero.core.entity.HeroEntity;
import site.muzhi.hero.core.remote.feign.HeroCenterFeign;

/**
 * @author lichuang
 * @date 2022/05/08
 * @description
 */
@Service
public class HeroInfoService {

    @Autowired
    private HeroCenterFeign heroCenterFeign;

    public String heroBuild() {
        Result<String> result = heroCenterFeign.heroBuild();
        Assert.checkResult(result);
        return result.getData();
    }

    public HeroEntity heroInfo(String uid) {
        Result<HeroEntity> result = heroCenterFeign.heroInfo(uid);
        Assert.checkResult(result);
        return result.getData();
    }
}
