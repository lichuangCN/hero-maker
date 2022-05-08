package site.muzhi.hero.center.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import site.muzhi.hero.center.manager.HeroManager;
import site.muzhi.hero.core.api.Result;
import site.muzhi.hero.core.api.ResultFactory;
import site.muzhi.hero.core.entity.HeroEntity;

/**
 * @author lichuang
 * @date 2022/05/08
 * @description
 */
@RestController
@Slf4j
public class HeroController {

    @Autowired
    private HeroManager heroManager;

    /**
     * 创建一个新的 hero
     */
    @PostMapping("/hero/build")
    public Result<String> heroBuild() {
        return ResultFactory.ok(heroManager.heroBuild() + ",A new Hero!");
    }

    /**
     * 查询 hero
     */
    @GetMapping("/hero/info")
    public Result<HeroEntity> heroInfo(@RequestParam String uid) {
        return ResultFactory.ok(heroManager.query(uid));
    }
}
