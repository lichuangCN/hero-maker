package site.muzhi.hero.core.api;

import cn.hutool.core.util.ObjectUtil;
import site.muzhi.hero.core.exception.BusinessException;

/**
 * @author lichuang
 * @date 2022/05/08
 * @description
 */
public class Assert {

    public static void checkResult(Result result) throws BusinessException {
        if (ObjectUtil.isNull(result) || ObjectUtil.isNull(result.getData())) {
            throw new BusinessException(ResultCode.SERVER_INTERNAL_ERROR);
        }
    }
}
