
# Simple log framework demo.
Shows common usage example of log4j2 + slf4j

## Usage in 3 steps
### Step1-Add log4j library dependencies (log4j-api)

    <properties>
        <log4j.version>2.8.1</log4j.version>
    </properties>

    <dependencies>
    <!-- log4j2 -->
    <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-api</artifactId>
            <version>${log4j.version}</version>
        </dependency>
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>${log4j.version}</version>
        </dependency>
    </dependencies>

### Step2-Create log configuration file

Three tags are commonly used

1-properties -> define variables  
2-Appenders -> define reference of log type and setting  
3-Loggers -> define seperate log level + appenders  

### Step3-Use SLF4j for log framework interface
Benefit: this facade help us to not include log implementation inside source code.

FAQ
Q1-What’s difference between log4j and log4j2  
artifact version number 1.x vs 2.x  
https://stackoverflow.com/questions/30019585/log4j2-why-would-you-use-it-over-log4j

Q2-How to install log4j2 instead of log4j  
Use newer version with 2

Q3-What happen if we didn’t provide log configuration file  
ERROR StatusLogger No log4j2 configuration file found. 

Make sure you log config file is at src/main/resources  
Also clean targets/ via sbt clean fix the problem for me.

Is it’s runtime we can provide argument for log config file location  
-Dlog4j.configurationFile=conf/log4j2.xml

Q4-What’s SLF  
Simple Logging Facade for JAVA.  
Static binding log framework implementation via bridge jar  
https://blog.csdn.net/yycdaizi/article/details/8276265

Example Slf4j + log4j   
https://github.com/apache/spark/blob/e2ebca733ce4366349a5a25fe94a8e31b67d410e/core/src/main/scala/org/apache/spark/internal/Logging.scala

Q5-What’s status attribute in log4j2 Configuration xml tag?  
http://logging.apache.org/log4j/2.x/manual/configuration.html#ConfigurationSyntax

Q6-What’s filter usage in log4j  
https://stackoverflow.com/questions/5119883/what-does-threshold-mean-in-log4j

Reference
R1-log4j2 support .properties file after version 2.4  
https://stackoverflow.com/questions/22485074/log4j-2-doesnt-support-log4j-properties-file-anymore

R2-Log4j2与Slf4j的最佳实践  
https://zhuanlan.zhihu.com/p/36554554

R3-FAQ in log4j offical page  
https://logging.apache.org/log4j/2.0/faq.html