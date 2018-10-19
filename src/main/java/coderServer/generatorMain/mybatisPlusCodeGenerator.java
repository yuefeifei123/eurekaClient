package coderServer.generatorMain;

import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mybatisPlusCodeGenerator {

    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
//    public static String scanner(String tip) {
//        Scanner scanner = new Scanner(System.in);
//        StringBuilder help = new StringBuilder();
//        help.append("请输入" + tip + "：");
//        System.out.println(help.toString());
//        if (scanner.hasNext()) {
//            String ipt = scanner.next();
//            if (StringUtils.isNotEmpty(ipt)) {
//                return ipt;
//            }
//        }
//        throw new MybatisPlusException("请输入正确的" + tip + "！");
//    }

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        //项目路径,user.dir为项目路径，如果要输出别的文件夹，需要指定
//        String projectPath = System.getProperty("user.dir");
        String projectPath = "c:/gongzuofile/eurekaClient1";
        //输出目录
        gc.setOutputDir(projectPath + "/src/main/java");
        //作者
        gc.setAuthor("feifei");
        //是否打开输出目录
        gc.setOpen(false);
        //注解api文档形式注释
//        gc.setSwagger2(true);
        //实体类继承model
//        gc.setActiveRecord(true);
        //生成xml中的结果映射
        gc.setBaseResultMap(true);
        //动态sql语句中的所有列
//        gc.setBaseColumnList(true);
        //%s占位符代替表名,自定生成的类名
//        gc.setEntityName("%s");
        gc.setMapperName("%sMapper");
        //xml文件名称，试验了没用
//        gc.setXmlName("%sDao");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImp");
        //设置全局属性
        mpg.setGlobalConfig(gc);

        // 数据源配置;常见配置，不用解释；
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/testgenerate?useUnicode=true&useSSL=false" +
                "&serverTimezone=UTC&characterEncoding=utf8");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
//        dsc.setPassword("密码");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        //父包模块名，此处写死
//        pc.setModuleName(scanner("模块名"));
//        pc.setModuleName("eurekaserver");
        //父包名。如果为空，将下面子包名必须写全部， 否则就只需写子包名
        pc.setParent("coderServer.mybatisPlus");
//        pc.setParent("client.com");
        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
        //文件输出位置及名称设置
        List<FileOutConfig> focList = new ArrayList<>();
        focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输入文件名称
//                return projectPath + "/src/main/resources/mapper/" + pc.getModuleName()
//                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
                //mapper.xml文件名称
                return projectPath + "/src/main/resources/mapper/"
                       + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);
        mpg.setTemplate(new TemplateConfig().setXml(null));

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        //数据库表映射到实体的命名策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        //数据库表字段映射到实体的命名策略,未指定按照 naming 执行
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //自定义继承的Entity类全称，带包名
//        strategy.setSuperEntityClass("com.baomidou.ant.common.BaseEntity");
        //是否为lombok模型(默认 false)
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        //自定义继承的Controller类全称，带包名
//        strategy.setSuperControllerClass("com.baomidou.ant.common.BaseController");
        //需要包含的表名，允许正则表达式（与exclude二选一配置）
//        strategy.setInclude(scanner("表名"));
        strategy.setInclude("engineer","student");
        //自定义基础的Entity类，公共字段
//        strategy.setSuperEntityColumns("id");
        //驼峰转连字符
//        strategy.setControllerMappingHyphenStyle(true);
        //表前缀
        strategy.setTablePrefix(pc.getModuleName() + "_");
        //根据数据库表生成注释
        strategy.entityTableFieldAnnotationEnable(true);
        //实体类使用建造者模式
//        strategy.setEntityBuilderModel(true);
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();

    }

}
