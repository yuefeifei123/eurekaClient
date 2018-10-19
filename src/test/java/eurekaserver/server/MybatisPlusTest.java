//package eurekaserver.server;
//
//import coderServer.ServerApplication;
//import coderServer.mybatisPlus.entity.Student;
//
//import coderServer.mybatisPlus.mapper.StudentMapper;
//import coderServer.mybatisPlus.service.StudentService;
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.baomidou.mybatisplus.core.metadata.IPage;
//import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//
//
//import lombok.extern.slf4j.Slf4j;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//@Slf4j
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = ServerApplication.class)
//public class MybatisPlusTest {
//
//    @Test
//    public void contextLoads() {
//    }
//
//    @Autowired(required = false)
//    private StudentMapper studentMapper;
//    @Autowired
//    private StudentService studentService;
//    @Test
//    public void testSelect() {
//        System.out.println(("----- selectAll method test ------"));
//
//
//        List<Student> userList = studentMapper.selectList(
//                new QueryWrapper<Student>().eq("id",2));
//        List list1=userList.stream().map(Student::getId).collect(Collectors.toList());
//        userList.forEach(System.out::println);
//        System.out.println(list1);
//    }
//    @Test
//    public void testGene() {
//        System.out.println(System.getProperty("user.dir"));
//        QueryWrapper<Student> queryWrapper=new QueryWrapper<>();
//        Page<Student> page=new Page<Student>(1,10).setDesc("id","update_at");
//        System.out.println(page);
//        IPage<Map<String, Object>> pageMaps=studentService.pageMaps(page,null);
//        IPage<Student> page2=studentMapper.selectPage(page,null);
//        System.out.println("******使用dao进行分页查询*******");
//        page2.getRecords().forEach(System.out::println);
//        IPage<Student> page1=studentService.page(page,null);
//        System.out.println("******使用service进行分页查询*******");
//        for (Student student : page1.getRecords()) {
//            System.out.println(student);
//        }
//    }
//    @Test
//    public void testLike() {
//        System.out.println(System.getProperty("user.dir"));
//        QueryWrapper<Student> queryWrapper=new QueryWrapper<>();
//        queryWrapper.like("name","aill");
//        Page<Student> page=new Page<Student>(1,10).setDesc("id","update_at");
//        System.out.println(page);
//        IPage<Map<String, Object>> pageMaps=studentService.pageMaps(page,null);
//        IPage<Student> page2=studentMapper.selectPage(page,null);
//        System.out.println("******使用dao进行分页查询*******");
//        page2.getRecords().forEach(System.out::println);
//        IPage<Student> page1=studentService.page(page,null);
//        System.out.println("******使用service进行分页查询*******");
//        for (Student student : page1.getRecords()) {
//            System.out.println(student);
//        }
//
//        queryWrapper.like("name","aill");
//        Page<Student> pagell=new Page<Student>(1,10).setAsc("id");
//        IPage<Student> page3=studentService.page(pagell,queryWrapper);
//        System.out.println("****使用like条件分页查询******");
//        page3.getRecords().forEach(System.out::println);
//    }
//
//}
