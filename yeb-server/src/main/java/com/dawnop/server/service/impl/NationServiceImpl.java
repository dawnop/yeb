package com.dawnop.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dawnop.server.mapper.NationMapper;
import com.dawnop.server.pojo.Nation;
import com.dawnop.server.service.INationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dawnop
 * @since 2021-11-24
 */
@Service
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

}
