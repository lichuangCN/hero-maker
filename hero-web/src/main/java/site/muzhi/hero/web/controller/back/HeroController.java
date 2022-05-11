package site.muzhi.hero.web.controller.back;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import site.muzhi.hero.core.api.Result;
import site.muzhi.hero.core.api.ResultFactory;
import site.muzhi.hero.core.entity.HeroEntity;
import site.muzhi.hero.web.remote.HeroInfoService;

/**
 * @author lichuang
 * @date 2022/05/08
 * @description
 */
@RestController
@Slf4j
public class HeroController {

    @Autowired
    private HeroInfoService heroInfoService;

    /**
     * 创建一个新的 hero
     */
    @PostMapping("/hero/build")
    public Result<String> heroBuild() {
        return ResultFactory.ok(heroInfoService.heroBuild());
    }
    /**
     * 查询 hero
     */
    @GetMapping("/hero/info")
    public Result<HeroEntity> heroInfo(@RequestParam String uid) {
        return ResultFactory.ok(heroInfoService.heroInfo(uid));
    }
}
