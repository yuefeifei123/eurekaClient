package coderServer.mybatisPlus.service.impl;

import coderServer.mybatisPlus.entity.Engineer;
import coderServer.mybatisPlus.mapper.EngineerMapper;
import coderServer.mybatisPlus.service.EngineerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author feifei
 * @since 2018-10-19
 */
@Service
public class EngineerServiceImp extends ServiceImpl<EngineerMapper, Engineer> implements EngineerService {

}
