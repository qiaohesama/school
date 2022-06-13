import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.TemplateType;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.keywords.MySqlKeyWordsHandler;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CodeGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create(new DataSourceConfig.Builder("jdbc:mysql://47.104.107.7:3306/nanjing?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai", "dev", "OPS@ufunxm.com")
                        .typeConvert(new MySqlTypeConvert()) // 类型转换
                        .keyWordsHandler(new MySqlKeyWordsHandler()) // 关键字加``
                )
                .globalConfig(builder -> builder
                        .fileOverride() // 覆盖旧文件
                        .disableOpenDir() // 完成后不打开文件夹
                        .outputDir(System.getProperty("user.dir") + "\\common\\src\\main\\java") // 输出路径
                        .author("qiaohe")
                        .enableSwagger() // 启用swagger注解
                )
                .packageConfig(builder -> builder //包配置
                        .parent("com.mnnu")
                        .moduleName("common")
                        .entity("entity.domain")
                        .mapper("dao")
                        .xml("dao.mapper")
                        .other("dao.ext")
                )
                .templateConfig(builder -> builder
                                .disable(TemplateType.CONTROLLER, TemplateType.SERVICE, TemplateType.SERVICEIMPL) // 不生成controller和service
//                                .controller("/templates/controller.java")
                )
                .strategyConfig((scanner, builder) -> builder
                        .addInclude(getTables(scanner.apply("请输入表名，多个用空格分隔，所有输入*")))
                        .addTablePrefix("t_") // 生成类名去除前缀

                        .entityBuilder()
                        .enableLombok() //使用lombok
                        .enableTableFieldAnnotation() // 字段注解
                        .versionColumnName("version") //乐观锁
                        .logicDeleteColumnName("deleted") // 逻辑删除字段
                        .formatFileName("%sDO")

                        .mapperBuilder()
                        .superClass(BaseMapper.class)
                        .formatMapperFileName("%sBaseMapper")
                        .enableMapperAnnotation() //mapper注解
                        .enableBaseResultMap() // 生成BaseResultMap
                        .enableBaseColumnList() // 生成BaseColumnList
                        .formatXmlFileName("%sMapper")
                )
                .execute();
    }

    protected static List<String> getTables(String tables) {
        return "*".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(" "));
    }

}
