package com.dawnop.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dawnop.server.mapper.PositionMapper;
import com.dawnop.server.pojo.Position;
import com.dawnop.server.service.IPositionService;
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
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position> implements IPositionService {

}
