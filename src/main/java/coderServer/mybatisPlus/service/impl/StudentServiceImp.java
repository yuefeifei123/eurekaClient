package coderServer.mybatisPlus.service.impl;

import coderServer.mybatisPlus.entity.Student;
import coderServer.mybatisPlus.mapper.StudentMapper;
import coderServer.mybatisPlus.service.StudentService;
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
public class StudentServiceImp extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
