Java 12 in Action
===================

### Java 12 API Updates

* String methods:  indent(行缩进), transform(字符串转换)
* Compact Number format: NumberFormat 数字格式化
* Teeing Collector: 将一个流的两个collector进行关联操，如一个流中最大值和最小值差多少等等
* CompletableFuture增加很多API，结合Stream已经和Reactive框架快没有区别啦
* JDK 12 Security Enhancements 安全方面做了很多的提升，有人已经全面整理啦，主要是Crypto、TLS 和SecurityManager， 请点击这里： https://seanjmullan.org/blog/2019/03/19/jdk12

### Switch Expression

command line添加 --enable-preview

### Micro-benchmark

IntelliJ IDEA下请下载JMH插件，然后在@Benchmark函数中右键鼠标选择运行就可以进行benchmark测试啦。

个人经常使用这个 https://github.com/mp911de/microbenchmark-runner 和JUnit整合，运行更加方便

### JVM Changes

* G1 GC提升
* New GC: Shenandoah
* JVM Constants API: 平常开发基本不用到，JVM底层API。 是关于class文件的



### References

* What's New in Java 12: https://app.pluralsight.com/library/courses/java-12-whats-new/table-of-contents