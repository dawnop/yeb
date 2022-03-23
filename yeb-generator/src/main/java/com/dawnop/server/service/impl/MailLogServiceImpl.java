package com.dawnop.server.service.impl;

import com.dawnop.server.pojo.MailLog;
import com.dawnop.server.mapper.MailLogMapper;
import com.dawnop.server.service.IMailLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
