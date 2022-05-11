package site.muzhi.hero.core.remote.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import site.muzhi.hero.core.api.Result;
import site.muzhi.hero.core.entity.HeroEntity;

/**
 * @author lichuang
 * @date 2022/05/08
 * @description
 */
@FeignClient(name = "hero-maker-center")
public interface HeroCenterFeign {

    /**
     * 创建一个新的 hero
     */
    @PostMapping("/hero/build")
    Result<String> heroBuild();

    /**
     * 查询 hero
     */
    @GetMapping("/hero/info")
    Result<HeroEntity> heroInfo(@RequestParam("uid") String uid);
}
