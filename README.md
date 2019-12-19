# xlly

## 2019-12-19
###添加sql控制台打印
####用到的依赖
compile group: 'org.springframework.boot', name: 'spring-boot-starter-log4j2', version: '2.2.2.RELEASE'
####yaml配置文件：
logging:
  level:
    com.mxc.xlly.xllyservo: debug
    
    
###添加swagger
####用到的依赖
compile group: 'io.springfox', name: 'springfox-swagger2', version: '2.9.2'
compile group: 'io.springfox', name: 'springfox-swagger-ui', version: '2.9.2'
compile group: 'io.springfox', name: 'springfox-core', version: '2.9.2'
####配置文件
Swagger2Config.java
