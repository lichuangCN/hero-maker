package site.muzhi.hero.center.repo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import site.muzhi.hero.core.entity.HeroEntity;
import site.muzhi.hero.center.repo.mapper.HeroEntityMapper;
import site.muzhi.hero.center.repo.service.HeroEntityService;

/**
 * @author lichuang
 * @date 2022/05/08
 * @description
 */
@Slf4j
@Service
public class HeroEntityServiceImpl extends ServiceImpl<HeroEntityMapper, HeroEntity> implements HeroEntityService {
}
